package gr.aueb.cf.Exercises_Strings;

/**
 * a given string ends with the contents of another string
 */
public class Exercise9 {

    public static void main(String[] args) {

        String s1 = "Hacking skills";
        String s2 = "Hacking skill";
        String s3 = "Hacking skill";

        String str = "lls";

        boolean ends1 = s1.endsWith(str);
        boolean ends2 = s2.endsWith(str);
        boolean b3 = false;
        boolean b4 = false;
        b3 = s1.equals(s2);
        b4 = s2.equals(s3);

        System.out.println("s1 ends with ends1 : " + ends1);
        System.out.println("s2 ends with ends1 : " + ends2);
        System.out.println("s1 equals s2 : " + b3);
        System.out.println("s2 equals s3 : " + b4);

    }
}
