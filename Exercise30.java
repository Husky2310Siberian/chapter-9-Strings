package gr.aueb.cf.Exercises_Strings;

import com.sun.tools.javac.Main;

/**
 * tests if a string contains only digits and return true,
 * otherwise return false
 */
public class Exercise30 {

    public static void main(String[] args) {

        String str1 = "12345678909876543123456789098765432";
        String str2 = "1234567898765432ZAE1234A98775654332";

        System.out.println("the given strings are : " +str1);
        boolean result1 = testOnlyDigits(str1);
        System.out.println(result1);
        System.out.println("the given strings are : " +str2);
        boolean result2 = testOnlyDigits(str2);
        System.out.println(result2);
    }

    public static boolean testOnlyDigits(String digitString) {

        for (int i = 0; i < digitString.length(); i++){
            if (digitString.matches("[0-9]+") && digitString.length() > 2) {
                return true;
            }
        }
        return false;
    }
}
