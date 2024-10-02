package gr.aueb.cf.Exercises_Strings;

/**
 * create a unique identifier of a given string
 */
public class Exercise13 {

    public static void main(String[] args) {

        String str = "Python Exercises";

        int hash_code = str.hashCode();

        System.out.println("the hash for " + str + " is " + hash_code);
    }
}
