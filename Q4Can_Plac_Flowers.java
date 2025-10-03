import java.util.Scanner;

public class Q4Can_Plac_Flowers {

        public static  boolean placeFlower(int flowers[] , int n){
            // n -> no of flower that we've to plant
            int total =0;
            int length = flowers.length;

            for(int i=0; i<length && total<n; i++){
                if(flowers[i] == 0){
                    int next = (i == length-1) ? 0 :flowers[i+1];
                    int  prev = (i == 0) ? 0 : flowers[i-1];

                    if(next == 0 && prev == 0){
                        flowers[i]  = 1; // plant the flower such that there should  not adjecnt flowers
                        total++;
                    }
                }
            }
            return  total == n;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of array that you  want ");
            int size = sc.nextInt();
            int[] flowerbed =new int[size];
            System.out.println("Enter the elements of the array in binary form ");
            for(int i=0; i<size; i++){
                flowerbed[i] = sc.nextInt();
            }

            System.out.println("Enter the number  of flower that you want to place ");
            int n = sc.nextInt();
            System.out.println(placeFlower(flowerbed, n));
        }



}