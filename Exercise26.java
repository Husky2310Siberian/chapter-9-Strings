package gr.aueb.cf.Exercises_Strings;

/**
 * divide string in n equal parts
 */
public class Exercise26 {

    public static void main(String[] args) {

        String str1 = "abcdefghijklmnopqrstuvwxy";
        int split_number = 5;

        splitStrings(str1,split_number);
    }

    /**
     *
     * @param str1 the given String
     * @param n    n parts
     */
    public static void splitStrings (String str1 , int n){
        int str_size = str1.length();
        int part_size;

        if (str_size % n != 0) {
            System.out.println("the size of the given string is not divisible by " +n);
            return;
        } else {
            System.out.println("the given string is: " +str1);
            System.out.println("the string divides int " +n + " parts and they are");

            part_size = str_size / n ;

            for (int i = 0; i < str_size; i++){
                if (i % part_size == 0);
                System.out.println();
                System.out.print(str1.charAt(i));
            }
        }
    }
}
