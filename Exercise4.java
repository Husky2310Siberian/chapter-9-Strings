package gr.aueb.cf.Exercises_Strings;

/**
 * compare two strings
 */
public class Exercise4 {

    public static void main(String[] args) {

        String s1 = "Hello world";
        String s2 = "Hello CyberSecurity";
        String s3 = "hello cybersecurity";
        String s4 = "HELLO WORLD";

        int result1 = s1.compareTo(s4);
        int result2 = s3.compareToIgnoreCase(s2);

        System.out.println("s1 > s2 : " +result1);
        System.out.println("s2 == s3: " +result2);


    }
}
