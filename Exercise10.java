package gr.aueb.cf.Exercises_Strings;

import java.util.Calendar;

/**
 * print current date and time
 */
public class Exercise10 {

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        System.out.println("the current time and date is : ");

        System.out.format("%tB %te, %tY%n", c,c,c);

        System.out.format("%tl:%tM %tp%n",  c,c,c);


    }
}
