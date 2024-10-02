package gr.aueb.cf.Exercises_Strings;

import java.util.Arrays;

/**
 * remove "b" and "ac" from a given string
 */
public class Exercise29 {

    public static void main(String[] args) {

        String str = "abrambabasc";
        System.out.println("the given string is : " + str);
        System.out.println("after removing the characters \"b\" and \"ac\", the new string is : ");
        removeSetOfCharacters(str, "ac" , "b");
    }

    private static void removeSetOfCharacters(String str, String ptn1, String ptn2) {

        int n = str.length();
        int i = 0;
        int ptr = 0;

        char [] arr1 = str.toCharArray();

        for (i = 0; i < n; i++){
            if (arr1[i] == 'b'){
                continue;
            }   else if ( i + 1 < n && arr1[i]== 'a' && arr1[i] == 'b'){
                ++i;
            } else {
                arr1 [ptr++] = arr1[i];
            }
        }
            char[] ret = Arrays.copyOfRange(arr1,0,ptr);
        System.out.println(new String(ret));

    }
}
