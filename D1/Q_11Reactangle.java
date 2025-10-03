import java.util.Scanner;

public class Q_11Reactangle {

    public static void main(String[] args) {
       int row =4;
       int col = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bits of the array ");
       int arr[][] = new int[row][col];
       for(int i=0; i<row; i++){
           for(int j=0; j<col; j++){
               arr[i][j] =sc.nextInt();
           }
       }

       System.out.println("Printing the matrix ");
       for(int i=0; i<row; i++){
           for(int j=0; j<col; j++){
               System.out.print(arr[i][j]+" ");
           }
           System.out.println();
       }

    }
}

