package gr.aueb.cf.Exercises_Strings;

/**
 * get the contents of a given  string as a character array
 */
public class Exercise12 {

    public static void main(String[] args) {

        String str = "This is a sample String";

        char[] ch = new char [] {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        str.getChars(4,10,ch,2);


        System.out.println(str + " equals ch array");

    }
}
