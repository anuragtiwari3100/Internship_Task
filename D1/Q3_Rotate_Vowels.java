public  class Q3_Rotate_Vowels {

    public  static boolean  checkVowel(char ch){
        ch = Character.toLowerCase(ch);
        return   ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
    public static String reverseVowels(String s){
        StringBuilder  VowelString = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            if(checkVowel(s.charAt(i))){
                VowelString.append(s.charAt(i));
            }
        }

        StringBuilder resultString = new StringBuilder(s);
        int index =  VowelString.length()-1;
        for(int i=0; i<s.length(); i++){
            if(checkVowel(s.charAt(i))){
                resultString.setCharAt(i,VowelString.charAt(index--) );
            }
        }
        return resultString.toString();
    }


    public static String reverseVowelsTwoPointer(String s) {
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length - 1;

        while (i < j) {
            while (i < j && !checkVowel(arr[i])) i++;
            while (i < j && !checkVowel(arr[j])) j--;

            if (i < j) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }




    public static void main(String[] args) {
        System.out.println("The rotated  string  is -> "+reverseVowels("IceCreAm"));
    }
}