package gr.aueb.cf.Exercises_Strings;

/**
 * get the character at the given index within the string
 */
public class Exercise1 {

    public static void main(String[] args) {

        String s = "Java Exercises!";

        int index3;
        int index4;

        System.out.println("Original string = " +s);


        index3 = s.charAt(0);
        index4 = s.charAt(10);

        System.out.println((char)index3 + " is in position 0");
        System.out.println((char)index4 + " is in position 10");





    }
}
