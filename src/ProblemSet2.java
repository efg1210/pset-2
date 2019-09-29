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

				System.out.println("\nNAME\t : " + userFirstName + " " + userLastName);
				System.out.println("GRADE\t : " + userGrade);
				System.out.println("AGE\t : " + userAge);
				System.out.println("HOMETOWN : " + userTown);

        /*
         * Exercise 2.
         *
         * Given a dollar amount in the range [0.00, 1.00], print the number of dollar
         * bills, quarters, dimes, nickels, and pennies needed to produce this amount.
         */

				final double DOLLAR_VALUE = 1;
				final double QUARTER_VALUE = 0.25;
				final double DIME_VALUE = 0.10;
				final double NICKEL_VALUE = 0.05;

				System.out.print("\nEnter a dollar amount: ");
				double moneyAmount = Double.valueOf(in.next());

				int dollarAmount = (int) Math.floor(moneyAmount);
				moneyAmount %= DOLLAR_VALUE;

				int quarterAmount = (int) Math.floor(moneyAmount / QUARTER_VALUE);
				moneyAmount %= QUARTER_VALUE;

				int dimeAmount = (int) Math.floor(moneyAmount / DIME_VALUE);
				moneyAmount %= DIME_VALUE;

				int nickelAmount = (int) Math.floor(moneyAmount / NICKEL_VALUE);
				moneyAmount %= NICKEL_VALUE;

				int pennyAmount = (int) Math.round(moneyAmount * 100);

				System.out.println("\nDOLLARS\t : " + dollarAmount);
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

				final double FIVE_DOLLAR_VALUE = 5;
				final double TEN_DOLLAR_VALUE = 10;

				System.out.print("\nEnter a dollar amount: ");
				moneyAmount = Double.valueOf(in.next());

				int tenAmount = (int) Math.floor(moneyAmount / TEN_DOLLAR_VALUE);
				moneyAmount %= TEN_DOLLAR_VALUE;
				int fiveAmount = (int) Math.floor(moneyAmount / FIVE_DOLLAR_VALUE);
				moneyAmount %= FIVE_DOLLAR_VALUE;
				dollarAmount = (int) Math.floor(moneyAmount);
				moneyAmount %= DOLLAR_VALUE;

				quarterAmount = (int) Math.floor(moneyAmount / QUARTER_VALUE);
				moneyAmount %= QUARTER_VALUE;
				dimeAmount = (int) Math.floor(moneyAmount / DIME_VALUE);
				moneyAmount %= DIME_VALUE;
				nickelAmount = (int) Math.floor(moneyAmount / NICKEL_VALUE);
				moneyAmount %= NICKEL_VALUE;
				pennyAmount = (int) Math.round(moneyAmount * 100);

				int numberOfDollars = tenAmount + fiveAmount + dollarAmount;
				int numberOfCoins = quarterAmount + dimeAmount + nickelAmount + pennyAmount;

				/*
				* testing to make sure the correct numbers of stuff is there
				System.out.println("ten DOLLARS\t : " + dollarAmount);
				System.out.println("five DOLLARS\t : " + dollarAmount);
				System.out.println("DOLLARS\t : " + dollarAmount);
				System.out.println("QUARTERS : " + quarterAmount);
				System.out.println("DIMES\t : " + dimeAmount);
				System.out.println("NICKELS\t : " + nickelAmount);
				System.out.println("PENNIES\t : " + pennyAmount);
				*/

				System.out.println("\nBILLS : " + numberOfDollars);
				System.out.println("COINS : " + numberOfCoins);

        /*
         * Exercise 4.
         *
         * Given a number of inches, print the equivalent number of miles, yards, feet,
         * and inches.
         */

				final int INCHES_IN_MILE = 63360;
				final int INCHES_IN_YARD = 36;
				final int INCHES_IN_FOOT = 12;

				System.out.print("\nEnter a number of inches: ");
				int userInches = (int) Math.round(in.nextInt());
				in.nextLine();

				int mileAmount = userInches / INCHES_IN_MILE;
				userInches %= INCHES_IN_MILE;
				int yardAmount = userInches / INCHES_IN_YARD;
				userInches %= INCHES_IN_YARD;
        int footAmount = userInches / INCHES_IN_FOOT;
				userInches %= INCHES_IN_FOOT;
        int inchAmount = userInches;

        System.out.println("\nMILES\t\b: " + mileAmount);
        System.out.println("YARDS\t\b: " + yardAmount);
        System.out.println("FEET\t\b: " + footAmount);
        System.out.println("INCHES\t\b: " + inchAmount);

        /*
         * Exercise 5.
         *
         * Given a number of centimeters, print the equivalent number of kilometers,
         * meters, and centimeters.
         */

        final int CENTI_IN_KILO = 100000;
 				final int CENTI_IN_METER = 100;

 				System.out.print("\nEnter a number of centimeters: ");
 				int userCenti = (int) Math.round(in.nextInt());
 				in.nextLine();

 				int kiloAmount = userCenti / CENTI_IN_KILO;
 				userCenti %= CENTI_IN_KILO;
 				int meterAmount = userCenti / CENTI_IN_METER;
 				userCenti %= CENTI_IN_METER;
        int centiAmount = userCenti;

        System.out.println("\nKILOMETERS\t\b\b\b\b: " + kiloAmount);
        System.out.println("METERS\t\t\b\b\b\b: " + meterAmount);
        System.out.println("CENTIMETERS : " + centiAmount);

        /*
         * Exercise 6.
         *
         * Given a diameter, print the area and circumference of the corresponding circle.
         */

        System.out.print("\nEnter a diameter: ");
  			int userDiameter = (int) Math.round(in.nextInt());
  			in.nextLine();

        double circleRadius = userDiameter * 10;
        circleRadius /= 2;
        circleRadius /= 10;
        double circleArea = Math.pow(circleRadius, 2);
        circleArea *= Math.PI;

        double circleCircumference = userDiameter * Math.PI;

        System.out.print("\nAREA\t\t\b\b: ");
        System.out.printf("%.2f", circleArea);
        System.out.print("\nCIRCUMFERENCE : ");
        System.out.printf("%.2f", circleCircumference);

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
