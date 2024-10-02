package gr.aueb.cf.Exercises_Strings;

/**
 * find the first non - repeating character in a string
 */
public class Exercise25 {

    public static void main(String[] args) {

        String str1 = "gibblegabbler";

        System.out.println("the given string is :" +str1);

        for (int i = 0; i < str1.length(); i++){
            boolean unique = true;

            for (int j = 0; j < str1.length(); j++){
                if ( i!=j && str1.charAt(i) == str1.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique){
                System.out.println("the first non-repeated character in the String is: " +str1.charAt(i));
                break;
            }
        }

    }
}
