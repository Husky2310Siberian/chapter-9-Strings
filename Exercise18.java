package gr.aueb.cf.Exercises_Strings;

/**
 * creates a character array containing the contents of a string
 */
public class Exercise18 {

    public static void main(String[] args) {
        //declare and initialize a string value
        String str1 = "the quick brown fox, jumps over the lazy dog";
        String str2 = " ";
        //converts the string to an char array
        char [] array = str1.toCharArray();
        str2 = str1.toUpperCase();

        //display the contents of the char array
        System.out.println("the string :" +str1);
        System.out.println(array);
        System.out.println();
        System.out.println(str2);
        System.out.println(" ");
        System.out.println(str2.toLowerCase());
    }
}
