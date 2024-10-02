package gr.aueb.cf.Exercises_Strings;

/**
 * get the character (unicode code point) at the given index within the String
 * get the character (unicode code point) before the specified index within the String
 */
public class Exercise2 {

    public static void main(String[] args) {

        String s1 = "Hello World";

        int val1 = s1.codePointAt(1);
        int val2 = s1.codePointAt(7);
        int val3 = s1.codePointBefore(2);


        System.out.println(s1);
        System.out.println("character unicode code : " +val1);
        System.out.println("character unicode code : " +val2);
        System.out.println("character unicode code : " +val3);
    }
}
