package gr.aueb.cf.Exercises_Strings;

/**
 * trims any leading or trailing whitespace from a given string
 */
public class Exercise19 {

    public static void main(String[] args) {

        String str1 = "   www.examples.com   ";
        String str2 = " coding f a c t o r y";

        String strNew = " ";

        strNew = str1.trim();

        System.out.println(strNew);
    }
}
