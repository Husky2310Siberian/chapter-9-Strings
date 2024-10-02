package gr.aueb.cf.Exercises_Strings;

/**
 * checks whether a given string starts with the contents of another string
 */
public class Exercise16 {

    public static void main(String[] args) {

        String str1 = "red is my favorite color";
        String str2 = "orange is also my favorite color";

        String str = "red";

        boolean start1 = str1.startsWith(str);
        boolean start2 = str2.startsWith(str);

        System.out.println("red is my favorite color :" +start1);
        System.out.println("orange is also my favorite color :" +start2);
    }
}
