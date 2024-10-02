package gr.aueb.cf.Exercises_Strings;

/**
 * get the contents of a given  string as a byte array
 */
public class Exercise11 {

    public static void main(String[] args) {

        String str = "This is a sample String";

        byte[] array = str.getBytes();

        String str2 = new String(array);

        System.out.println(str + " == " + str2);

    }
}
