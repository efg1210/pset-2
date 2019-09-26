/**
 * Problem Set 2.
 *
 * It's time to put your skills to the test. This problem set focuses on prompting
 * the user for information, manipulating that information, and printing it in
 * specific formats.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

// cd ~/Desktop/APCSA/pset-2/src/

import java.util.Scanner;

public class ProblemSet2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
         * Exercise 1.
         *
         * Prompt the user to enter the following information (in order): first name, last
         * name, grade, age, and hometown.
         */

				System.out.print("\nEnter your first name: ");
				String userFirstName = in.nextLine();
				System.out.print("Enter your last name: ");
				String userLastName = in.nextLine();
				System.out.print("Enter your grade: ");
				String userGrade = in.nextLine();
				System.out.print("Enter your age: ");
				String userAge = in.nextLine();
				System.out.print("Enter your hometown: ");
				String userTown = in.nextLine();

				System.out.println("NAME\t : " + userFirstName + " " + userLastName);
				System.out.println("GRADE\t : " + userGrade);
				System.out.println("AGE\t : " + userAge);
				System.out.println("HOMETOWN : " + userTown);

        /*
         * Exercise 2.
         *
         * Given a dollar amount in the range [0.00, 1.00], print the number of dollar
         * bills, quarters, dimes, nickels, and pennies needed to produce this amount.
         */

				final double dollarValue = 1;
				final double quarterValue = 0.25;
				final double dimeValue = 0.10;
				final double nickelValue = 0.05;

				System.out.print("\nEnter a dollar amount: ");
				double moneyAmount = Double.valueOf(in.next());

				int dollarAmount = (int) Math.floor(moneyAmount);
				moneyAmount %= dollarValue;
				int quarterAmount = (int) Math.floor(moneyAmount / quarterValue);
				moneyAmount %= quarterValue;
				int dimeAmount = (int) Math.floor(moneyAmount / dimeValue);
				moneyAmount %= dimeValue;
				int nickelAmount = (int) Math.floor(moneyAmount / nickelValue);
				moneyAmount %= nickelValue;
				int pennyAmount = (int) (moneyAmount * 100);

				System.out.println("DOLLARS\t : " + dollarAmount);
				System.out.println("QUARTERS : " + quarterAmount);
				System.out.println("DIMES\t : " + dimeAmount);
				System.out.println("NICKELS\t : " + nickelAmount);
				System.out.println("PENNIES\t : " + pennyAmount);

        /*
         * Exercise 3.
         *
         * Given a dollar amount in the range [0.00, 20.00], print the smallest number of
         * bills and coins needed to produce this amount.
         */

				

        /*
         * Exercise 4.
         *
         * Given a number of inches, print the equivalent number of miles, yards, feet,
         * and inches.
         */



        /*
         * Exercise 5.
         *
         * Given a number of centimeters, print the equivalent number of kilometers,
         * meters, and centimeters.
         */



        /*
         * Exercise 6.
         *
         * Given a diameter, print the area and circumference of the corresponding circle.
         */



        /*
         * Exercise 7.
         *
         * Given a length and width, print the area, perimeter, and diagonal of the
         * corresponding rectangle.
         */



        /*
         * Exercise 8.
         *
         * Given a side length, print the area and perimeter of the corresponding hexagon.
         */



        /*
         * Exercise 9.
         *
         * Given a string, reverse and print the first and second halves of that string.
         */



        /*
         * Exercise 10.
         *
         * Given a first, middle, and last name, print the corresponding initials.
         */



        in.close();
    }
}
