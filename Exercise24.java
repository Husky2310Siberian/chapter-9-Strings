package gr.aueb.cf.Exercises_Strings;

/**
 * print a string, after removing duplicates from a given string
 */
public class Exercise24 {

    public static void main(String[] args) {
        String str1 = "successes";

        System.out.println("the original string is : " + str1);
        System.out.println("the new string, after removing duplicates is :" + removeDuplicates(str1));
        System.out.println(str1.indexOf('c'));
    }

    public static String removeDuplicates(String newString){
        //converts the input string in character array
        char [] ch = newString.toCharArray();

        String newStr = "";
        //checks if the character does nit exist in the newStr, otherwise add it.
        for (char value : ch){
            if (newStr.indexOf(value) == -1){
                newStr += value;
            }
        }
        return newStr;
    }
}
