package gr.aueb.cf.Exercises_Strings;

/**
 * prints all permutations of a given string with repetition
 */
public class Exercise23 {

        public static void main(String[] args) {

            permutationWithRepeation("CAB");
        }

        private static void permutationWithRepeation(String str1) {

            System.out.println("the given string is : CAB");
            System.out.println("the permuted strings are :");
            showPermutation(str1, "");
        }

        private static void showPermutation(String str1, String newStringToPrint) {

            if (newStringToPrint.length() == str1.length()) {
                System.out.println(newStringToPrint);
                return;
            }

            for (int i = 0; i < str1.length(); i++) {
                showPermutation(str1, newStringToPrint + str1.charAt(i));
            }
        }

    }