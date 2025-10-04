import java.util.*;

public class Q1_RemoveDuplicatesFromSortedArray{

    //Approach.1
    public static int  uniqueCount(int arr[]){
        if(arr.length == 0)
            return 0;
        Set<Integer> set = new HashSet<>();
        for(int x :arr){
            set.add(x);
        }
        return  set.size();
    }

    //Approach.2
    public static int uniqueCount2(int arr[]){
        int length = arr.length;
        if(length == 0)
            return  0;

        int j = 0;
        for(int i=1; i<length; i++){
           if(arr[i] != arr[j]){
               j++;
               arr[j] = arr[i];
           }
        }
        return  j+1;
    }


    //Approach 3
    public static int uniqueCount3(int arr[]){
        int length = arr.length;
        if(length ==0)
            return  0;
        int i=1;
        for(int j=1; j<length; j++){
            if(arr[j] != arr[i-1]){
                arr[i] = arr[j];
                i++;
            }
        }
        return i;
    }


    //Approach 4
    public static int uniqueCount4(int arr[], int maxVal) {
        boolean[] seen = new boolean[maxVal + 1];
        int count = 0;

        for (int num : arr) {
            if (!seen[num]) {
                seen[num] = true;
                count++;
            }
        }
        return count;
    }

//    int max = Arrays.stream(arr).max().getAsInt();  // returns 5


//when arr is not sorted --------------------------------------------------------
    // 1. Approach
    public static int freqCount(int arr[]){
        int max = 0;  // returns 5
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        int tempArr[] = new int[max+1];
        for(int i=0; i<arr.length; i++){
            if(tempArr[arr[i]] == 0){
                tempArr[arr[i]]++;

            }
        }

        //   for(int x : tempArr){
        //       System.out.print(x+" ");
        //   }

        int cnt =0;
        for(int i=0; i<tempArr.length; i++){
            if(tempArr[i]  == 1){
                cnt ++;
            }
        }
        return  cnt;
    }



    //2.Approach
    public  static  int  freqCount2(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        int length = arr.length;
        if(length ==0)
            return  0;
        for(int i=0; i<length; i++){
           map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
      return  map.size();  //cnt of keys
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

//        Arrays.sort(arr);
//        System.out.println("Enter the max element of the array ");
//        int max = sc.nextInt();

        int limit = uniqueCount2(arr);
        System.out.println("Size of the array with unique elements "+limit);
        for(int i=0; i<limit; i++){
            System.out.print(arr[i]+",");
        }


    }

}