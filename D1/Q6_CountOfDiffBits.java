import java.util.Scanner;

public class Q6_CountOfDiffBits {

    public static  int countDiffBits(int x, int y) {
        int xor =x^y;

        System.out.println(" xor is -> "+xor);

        int count = 0;

        while (xor != 0) {
            count += (xor & 1);
            xor >>= 1;
        }
        return count;
    }

    public  static  int  countDiffBits2(int x, int y){
        return Integer.bitCount(x ^ y);
    }


    public static void main(String[] args) {
//        System.out.println(5 & 1); // coresponding same then 1 else 0
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First no ");
        int x = sc.nextInt();
        System.out.println("Enter the second no ");
        int y = sc.nextInt();
       System.out.println("No of Position where corresponding bits are different is -> "+ countDiffBits2(x,y));
    }
}