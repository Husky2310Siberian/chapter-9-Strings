package gr.aueb.cf.Exercises_Strings;

/**
 * concatenate a given string to the end of another string
 */
public class Exercise7 {

    public static void main(String[] args) {

        String s1 = "Java / Python programming and ";
        String s2 = "Hacking skills";

        String s3 = s1.concat(s2);
        String s4 = s1.trim();

        System.out.println(s3);

    }
}
