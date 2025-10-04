import java.util.ArrayList;
import java.util.Arrays;


public class Q_10sortDrinkByPrice2 {
    String name;
    int price;

    Q_10sortDrinkByPrice2(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "name ->"+name  +"\t"+ "price ->" + price;
    }

    public static void main(String[] args) {
        Q_10sortDrinkByPrice2 arr[] = new Q_10sortDrinkByPrice2[3];
        arr[0] = new Q_10sortDrinkByPrice2("lime", 10);
        arr[1] = new Q_10sortDrinkByPrice2("lemonade", 50);
        arr[2] = new Q_10sortDrinkByPrice2("Cook", 5);


  Arrays.sort(arr, (a, b) ->a.price - b.price);

            //        for (Q_10sortDrinkByPrice2 drink : arr) {
            //            System.out.println(drink);
            //        }
            //        ArrayList<Object> myList = new ArrayList<>();
            //
            //
            //         for(int i=0; i<arr.length; i++){
            //             myList.add(Arrays.asList(i));
            //         }

        System.out.println(Arrays.toString(arr));
    }
}
