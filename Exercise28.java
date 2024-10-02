package gr.aueb.cf.Exercises_Strings;

/**
 * find the character in a string that occurs the most frequently
 */
public class Exercise28 {

    static final int N = 256;

    public static void main(String[] args) {
        String str1 = "test string";

        System.out.println("the given string is " + str1);
        System.out.println("max occuring character in the given string is : " +maxOccuringChar(str1));
    }

    private static Object maxOccuringChar(String str1) {

        int [] ctr = new int[N];
        int l = str1.length();

        for (int i = 0; i < l; i++)
            ctr[str1.charAt(i)]++;

        int max = -1;   //variable to store the maximum occurrence
        char result = ' '; //variable to store the character with the maximum occurrence

        for (int i = 0; i < l; i++){
            if (max < ctr[str1.charAt(i)]){
                max = ctr[str1.charAt(i)];
                result = str1.charAt(i);
            }
        }
        return result;
    }
}
