package gr.aueb.cf.Exercises_Strings;

/**
 * find longest palindromic substring within a string
 */
public class Exercise20 {

    public static void main(String[] args) {
        String str = "thequickbrownfoxxofnworbquickthe";

        System.out.println("the given substring is : " +str);
        System.out.println("the length of the palindromic substring is : " + Main.longPalSubStr(str));
    }

    public class Main {
        //define a method to print the substring given start and end indices
        static void printSubStr(String str, int l, int h) {
            System.out.println(str.substring(l, h + 1));
        }

        //define a method to find the longest palindromic substring
        static int longPalSubStr(String str) {
            int n = str.length();
            boolean table[][] = new boolean[n][n];
            int mlength = 1;

                for (int i = 0; i < n; ++i)
                table[i][i] = true;

                int strt = 0;

                //check for palindromes of length 2
                for (int i = 0; i < n - 1; ++i) {
                    if (str.charAt(i) == str.charAt(i+1)){
                        table[i][i + 1] = true;
                        strt = i;
                        mlength = 2;
                    }
                }
                //check for palindromes of length greater than 2
                for (int k = 3; k <= n; ++k){
                    for (int i = 0;  i < n - k; ++i){
                        int j = i + k - 1 ;
                        if (table[i+1][j - 1] && str.charAt(i) == str.charAt(j)){
                            table[i][j] = true;

                            if (k > mlength){
                                strt = i;
                                mlength = k;
                            }
                        }
                    }
                }
            System.out.println("the longest palindrome substring in the given string is: ");
                printSubStr(str, strt, strt + mlength - 1);
                return mlength;
        }
    }

}