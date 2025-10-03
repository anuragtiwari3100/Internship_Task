import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public  class Q8_Flatten_Array {

    public static List<Integer> flatten(List<Object> nestedList) {
        List<Integer> result = new ArrayList<>();
        for (Object obj : nestedList) {
            if (obj instanceof List) {
                // recursive call
                result.addAll(flatten((List<Object>) obj));
            } else {
                result.add((Integer) obj);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Object> nestedList = Arrays.asList(
                1, 2, Arrays.asList(5, 4), 3,5, Arrays.asList(93, 8, 2)
        );

//        List<Integer> nestedList2 = Arrays.asList(
//                1, 2, 3,5
//        );

        List<Integer> flat = flatten(nestedList);
        System.out.println(flat);
    }
}