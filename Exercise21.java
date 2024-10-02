package gr.aueb.cf.Exercises_Strings;
import java.util.HashSet;
import java.util.Set;

/**
 * find all interleavings of given strings
 */
public class Exercise21 {

    public static void main(String[] args) {

        String s1 = "WX";
        String s2 = "YZ";

        System.out.println("the given strings are : " + s1 + " " + s2);
        System.out.println("the interleavings strings are: ");

        Set<String> out = new HashSet<>();

        printLeaving("", s1, s2, out);

        out.stream().forEach(System.out::println);
    }

    public static void printLeaving (String res, String s1, String s2, Set out ){

        if ( s1.length() == 0 && s2.length() == 0){
            out.add(res);
            return;
        }
        if (s1.length() > 0){
            printLeaving(res + s1.charAt(0) , s2.substring(1), s2, out);
        }

        if (s2.length() > 0){
            printLeaving(res + s2.charAt(0) ,s1,  s2.substring(1), out);
        }
    }
}
