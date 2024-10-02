package gr.aueb.cf.Exercises_Strings;

public class Exercise31 {

    public static void main(String[] args) {

        String str1 = "abcdeabbccddrreeaaxzr";
        char gChar = 'a';

        String result = removeCharacter(str1, gChar);

        System.out.println("the original string is :" +str1);
        System.out.println("the modified string is : " +result);
    }

    public static String removeCharacter(String str1, char gChar) {

        if ( str1 == null || str1.isEmpty()){
            return "";
        }

        StringBuilder sb = new StringBuilder();

        char [] chArray = str1.toCharArray();

        for ( int i = 0; i < str1.length(); i++){
            if (chArray[i] != gChar) {
                sb.append(chArray[i]);
            }
        }
        return sb.toString();
    }
}
