package gr.aueb.cf.Exercises_Strings;

/**
 * compare a given string to the specified character sequence
 */
public class Exercise5 {

    public static void main(String[] args) {

        String s1 = "hacking SKILLS ";
        String s2 = "Hacking skills";

        boolean b1 = false;
        boolean b2 = false;
        boolean b3 = false;

        CharSequence cs = "Hacking skills";
        CharSequence cs2 = "skills";

        b1 = s1.contentEquals(cs);
        b2 = s2.contentEquals(cs);
        b3 = s2.contains(cs2);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);




    }
}