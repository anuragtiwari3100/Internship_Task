import java.util.Scanner;

public  class Q7_Longest_CommonPrefix {


    public static String CommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
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