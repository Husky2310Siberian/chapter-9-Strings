package gr.aueb.cf.Exercises_Strings;

/**
 * get the canonical representation of the string object
 */
public class Exercise14 {

    public static void main(String[] args) {

        String s1 = "java exercises";
        String s2 = new StringBuffer("java").append("exercises").toString();
        String s3 = s2.intern();

        System.out.println("str1 == str2 " + (s1 == s2));
        System.out.println("str2 == str3 " + (s2 == s3));
        
    }
}
