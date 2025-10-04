import java.util.Scanner;

public class Q5_FirstOccurence {

    public static  int  checkOccurence(String str1, String str2) {  //O(n*m)
         str1 =  str1.toLowerCase();
         str2 = str2.toLowerCase();
//         System.out.println(str1+"   "+str2);
        int n = str1.length();
        int m = str2.length();
        for (int i=0; i<=n-m; i++) {
            int j = 0;
            while (j<m && str1.charAt(i+j)==str2.charAt(j)) {
                j++;
            }
            if (j == m){
                return i;            }
        }

        return -1;
    }



    public static  int   matchString(String str1 , String str2){
         int  n = str1.length();
         int m = str2.length();
         if(n==0 || m == 0){
             return  -1;
         }
         int  limit = n-m;
         int j=0;
         int cnt =0;
         for(int i=0; i<limit; i++){
          while (j<limit){
              if(str1.charAt(i) == str2.charAt(j)){
                  j++;

              }
          }
          cnt =i;
         }
         return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String ");
        String str1 = sc.nextLine();
        System.out.println("Enter the second String ");
        String str2  =  sc.nextLine();
//        System.out.println("The first occurrence is at index : "+checkOccurence(str1,str2));
       System.out.println("The first occurrence is at index : "+checkOccurence(str1,str2));
    }
}