import java.util.HashMap;
import java.util.Map;

public class ShapeCalculator {
    public static double getValue(Map<String, Object> input) throws Exception {
        String shape = ((String) input.get("shape")).toLowerCase();
        String type = ((String) input.get("value")).toLowerCase();

        switch (shape) {
            case "circle":
                double r = getDouble(input, "radius");
                return "area".equals(type) ? Math.PI * r * r : 2 * Math.PI * r;
            case "square":
                double s = getDouble(input, "side");
                return "area".equals(type) ? s * s : 4 * s;
            case "rectangle":
                double l = getDouble(input, "length"), w = getDouble(input, "width");
                return "area".equals(type) ? l * w : 2 * (l + w);
            case "triangle":
                if ("area".equals(type)) {
                    double b = getDouble(input, "base"), h = getDouble(input, "height");
                    return 0.5 * b * h;
                } else {
                    return getDouble(input, "a") + getDouble(input, "b") + getDouble(input, "c");
                }
            default: throw new Exception("Unsupported shape: " + shape);
        }
    }

    private static double getDouble(Map<String, Object> input, String key) {
        Object val = input.get(key);
        if (val == null || !(val instanceof Double)) throw new IllegalArgumentException("Missing/invalid " + key);
        return (Double) val;
    }

    public static void main(String[] args) {
        Map<String, Object> input = new HashMap<>();
        input.put("shape", "circle");
        input.put("value", "area");
        input.put("radius", 10.0);

        try {
            double result = getValue(input);
            System.out.println("Result: " + result);  // Output: ~314.159
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}