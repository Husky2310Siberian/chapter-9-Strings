package gr.aueb.cf.Exercises_Strings;

/**
 * get the character (unicode code point) in the specified range of a String
 */
public class Exercise3 {

    public static void main(String[] args) {

        String s1 = "Hello World";

        int val1 = s1.codePointCount(0,10);

        System.out.println(val1);



    }
}
