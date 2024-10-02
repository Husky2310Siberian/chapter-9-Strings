package gr.aueb.cf.Exercises_Strings;

/**
 * get a substring of a given string between two specified positions
 */
public class Exercise17 {

    public static void main(String[] args) {

        String str1 = "the quick brown fox, jumps over the lazy dog";
        String str2 = "brown fox jumps";

        String str3 = str1.subSequence(10,26).toString();
//        differnt way
        String str4 = str1.substring(10,26);

        System.out.println("the new string is :" +str3);
        System.out.println("the new string is :" +str4);
    }
}
