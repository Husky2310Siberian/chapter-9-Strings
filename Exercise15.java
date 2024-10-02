package gr.aueb.cf.Exercises_Strings;

public class Exercise15 {

    public static void main(String[] args) {

        String str1 = "the quick brown fox, jumps over the lazy dog";
        String str2 = "the quick brown fox, jumps over the lazy dog";


        String strNew = str1.replace('d','f');
        String strNew2 = str2.replaceAll("fox", "cat");

        System.out.println(str1);
        System.out.println(strNew);
        System.out.println(" ");
        System.out.println(str2);
        System.out.println(strNew2);

    }
}
