import java.util.Scanner;

public class Q5_FirstOccurence {

    public static  int  checkOccurence(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        for (int i=0; i<=n-m; i++) {
            int j = 0;
            while (j<m && haystack.charAt(i+j)==needle.charAt(j)) {
                j++;
            }
            if (j == m){
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String ");
        String str1 = sc.nextLine();
        System.out.println("Enter the second String ");
        String str2  =  sc.nextLine();
       System.out.println("The first occurrence is at index : "+checkOccurence(str1,str2));

    }
}