import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Q2_Rotate_Array   {



    //Approach 2
    public  static  int[] rotate_K(int arr[], int k){
        int length = arr.length;
        if(length == 0)
            return  new int[]{0};
        int tempArr[] = new int[length];
        for(int i=0; i<length; i++){
            tempArr[(i+k)%length] =arr[i];
        }

        //        for(int i=0; i<tempArr.length; i++){
        //            arr[i] =  tempArr[i];
        //        }
        //        System.arraycopy(tempArr, 0, arr, 0, tempArr.length);
    return  tempArr;

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
        k = k % n;   // required no of rotation
        rev(nums, 0, n - 1);
        rev(nums, 0, k - 1);
        rev(nums, k, n - 1);
    }

    //Approach 3 -> T.c O(3n) -> n & SC O(n)
    public static  int[]  rotateArr(int arr[] , int k){  // k -> no of rotatioon
        Deque<Integer> dq = new LinkedList<>();
        for(int num : arr){
            dq.add(num);
        }
        for(int i=0; i<k; i++){
            dq.addFirst(dq.removeLast());
        }

        int i = 0;
        for(int num : dq ){
            arr[i] = num;
             i++;
        }
         return  arr;
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

//        int res[] = rotate_K(arr,k);
        int res[] = rotateArr(arr,k);
        for(int x : res){
            System.out.print(x +",");
        }
    }

}
