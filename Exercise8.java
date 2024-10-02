package gr.aueb.cf.Exercises_Strings;

/**
 * creates a string object with a character array
 */
public class Exercise8 {

    public static void main(String[] args) {

        char[] arr_num = {'1','2','3','4'};

        String str = String.copyValueOf(arr_num, 0,4);

        System.out.println("the content is : " +str);
    }
}
