package gr.aueb.cf.Exercises_Strings;

/**
 * remove duplicate characters from a given string presents in another given string
 */
public class Exercise27 {

    public static void main(String[] args) {
        String str1 = "the quick brown fox";
        String str2 = "queen";

        System.out.println("the given string is : " + str1);
        System.out.println("the given mask string is : " +str2);

        //creates a character array of the value of the first string
        char [] arr = new char[str1.length()];

        //creates a character array of the value of the second string of size 256
        char [] mask = new char[256];

        for (int i = 0; i < str2.length(); i++)
            mask[str2.charAt(i)]++;
            System.out.println("\n the new string is: ");


            for (int i = 0; i < str1.length(); i++){
                if (mask[str1.charAt(i)] == 0)
                    System.out.print(str1.charAt(i));
            }
    }
}
