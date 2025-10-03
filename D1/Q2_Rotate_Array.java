import java.util.Arrays;
import java.util.Scanner;

public class Q2_Rotate_Array   {

    public  static  int[] rotate_K(int arr[], int k){
        int length = arr.length;
        if(length == 0)
            return  new int[]{0};
        int tempArr[] = new int[length];
        for(int i=0; i<length; i++){
            tempArr[(i+k)%length] =arr[i];
        }
        for(int i=0; i<tempArr.length; i++){
            arr[i] =  tempArr[i];
        }

//        System.arraycopy(tempArr, 0, arr, 0, tempArr.length);
    return  arr;
    }



    //Approach2
    public void rev(int arr[], int si, int ei) {
        while(si<=ei){
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] =temp;
            si++;
            ei--;
        }
    }


    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        rev(nums, 0, n - 1);
        rev(nums, 0, k - 1);
        rev(nums, k, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int size = sc.nextInt();
        System.out.println("Enter the elemt of the array  ");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number of positions to rotate the array ");
        int k = sc.nextInt();

        int res[] = rotate_K(arr,k);
        for(int x : res){
            System.out.println(x);
        }
    }

}
