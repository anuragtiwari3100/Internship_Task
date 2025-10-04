public  class Q3_Rotate_Vowels {

    //Approach 1
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


    //Approach 2
    public static  String  reverseVowels2(String str){
        int length = str.length();
        StringBuilder myString  = new StringBuilder(str);
        int i=0;
        for(int j=length-1; j>=0; j--){
            if(checkVowel(str.charAt(j)) && checkVowel(str.charAt(i))){
                char  temp = str.charAt(j);
                myString.setCharAt(j,str.charAt(i));
                myString.setCharAt(i,temp);
               i++;
            }
        }
        return  myString.toString();
    }



    //Approach 3
    public static  String  revserseString3(String str){
        char ch[] = str.toCharArray();
        int length =str.length()-1;
        int i =0;  //tracks vowels from front
        int j=length-1;  //tracks vowels from  end
            if(!checkVowel(ch[i])){
                i++;
            }
            if(!checkVowel(ch[j])){
                j--;
        }
            while(checkVowel(ch[i]) && checkVowel(ch[j])){
                char temp = ch[i];
                 ch[i] = ch[j];
                 ch[j] = temp;
                 i++;
                 j--;
        }
       str= new String(ch);
     return  str;
    }






    public static void main(String[] args) {
//        System.out.println("The rotated  string  is -> "+reverseVowels2("IceCreAm"));
//        System.out.println("The rotated  string  is -> "+reverseVowels2(reverseVowels2("IceCreAm")));
        System.out.println("The rotated  string  is -> "+revserseString3("IceCreAm"));


    }
}