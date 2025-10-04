import java.util.Scanner;

public  class Q7_Longest_CommonPrefix {


    public static String CommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "---";
            }
        }
        return prefix;
    }





    static boolean allContainSubstring(String[] arr, int left,
                                       int right) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = left; j <= right; j++) {
                if (arr[i].charAt(j) != arr[0].charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }


    static String longestCommonPrefix(String []arr) {
        int minLen = arr[0].length();

        for (String str : arr) {
            minLen = Math.min(minLen, str.length());
        }

        int lo = 0, hi = minLen - 1;
        int prefixLen = 0;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (allContainSubstring(arr, lo, mid)) {
                prefixLen = mid + 1;
                lo = mid + 1;
            }
            else {
                hi = mid - 1;
            }
        }
        return arr[0].substring(0, prefixLen);
    }
        public static void main (String[] args){
  //  System.out.println("abcd".indexOf("ef")); //=>-1
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the size of array you want ");
            int size = sc.nextInt();
            String[] arr = new String[size];
            System.out.println("Enter String array ");
            for(int i=0; i<size; i++){
                arr[i] = sc.next();
            }

//           String[] strs =new String[]{"flower","flow","flight"};

            System.out.println("The length of the  longest common prefix  is : "+ CommonPrefix(arr));
        }


}