import java.util.Scanner;

public class Q1_multiplers{


    public static int[] multiplers(int n){
        if(n == 0)
            return new int[]{0,0};
        int tempArr[] = new int[n];
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                tempArr[i-1] =i;
            }
        }
   return  tempArr;
    }

    public static String multiplers2(int n){
      StringBuilder mybuilder = new StringBuilder();

        for(int i=1; i<=n; i++){
            if(n%i == 0){
                mybuilder.append(i);
            }
        }

        return  mybuilder.toString();
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number to find the multiplers");
        int n = sc.nextInt();

//         int res[] = multiplers(12);
//         for(int x : res){
//             System.out.print(x+",");
//         }

        System.out.print(multiplers2(12));
    }
}
