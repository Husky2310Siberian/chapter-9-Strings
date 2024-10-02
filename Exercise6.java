package gr.aueb.cf.Exercises_Strings;

/**
 * compares a given string to the specified string buffer
 */
public class Exercise6 {

    public static void main(String[] args) {

        String s1 = "hacking SKILLS ";
        String s2 = "Hacking skills";

        boolean b1 = false;
        boolean b2 = false;

        StringBuffer buf = new StringBuffer(s2);

        b1 = s1.contentEquals(buf);
        b2 = s2.contentEquals(buf);

        System.out.println(b1);
        System.out.println(b2);



    }
}
