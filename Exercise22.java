package gr.aueb.cf.Exercises_Strings;

/**
 * finds the second most frequent character in a given string
 */
public class Exercise22 {

    public static void main(String[] args) {

        String str1 = "successes";

        System.out.println("the given string is : " + str1);

        char res = Main.get2ndMostFreq(str1);

        if (res != '\0') {
            System.out.println("the second most frequent char is : " + res);
        } else {
            System.out.println("no second frequent rest exists");
        }
    }
        public class Main {
            //define a constant representing the number of characters (ASCII)
            static final int NOOFCHARS = 256;

            static char get2ndMostFreq(String str1) {
                int [] ctr = new int[NOOFCHARS];
                //int i;

                for (int i = 0; i < str1.length(); i++){
                    (ctr[str1.charAt(i)])++;
                }

                int ctr_first = 0;
                int ctr_second = 0;

                for (int i = 0; i < NOOFCHARS; i++){
                    if (ctr[i] > ctr[ctr_first]){
                        ctr_second = ctr_first;
                        ctr_first = i;
                    } else if (ctr[i] > ctr[ctr_second] && ctr[i] != ctr[ctr_first]){
                        ctr_second = i;
                    }
                }
                return (char) ctr_second;
            }
        }
}
