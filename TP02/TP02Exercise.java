package TP02;

import java.util.Scanner;

class TP02Exercise {
    /*
     * Ex01:
     * Write a method called printName with a String parameter named name.
     * The method should not return any value and is used to print the name of the
     * user with a welcome message.
     */

    public static void printName(String name) {
        System.out.println(name);
    }

    /*
     * Ex02:
     * Write a method called intSum with 2 parameters of type int.
     * The method should return the sum of the two numbers of type int.
     */

    public static int intSum(int x, int y) {
        return (x + y);
    }

    /*
     * Ex03:
     * Write a method called isMajor with a short parameter named age.
     * The method should return True if age is greater or equal to 18 otherwise
     * should return False.
     */

    public static boolean isMajor(short age) {
        if (age < 18) {
            return false;
        }
        return true;
    }

    /*
     * Ex04:
     * Write a method called isPair with an int parameter named number.
     * This method should return True If the number is Pair otherwise should return
     * False.
     */

    public static boolean isPair(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    /*
     * Ex05:
     * Write a method called maxValue with 3 parameters of type Double.
     * This method should return the maximum value among these three values.
     */

    public static double maxValue(double x, double y, double z) {
        double max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }

        return max;
    }

    /*
     * Ex06:
     * Write a method called MultiplicationTable with an int parameter named number.
     * The method should not return any value and print the multiplication table of
     * the given number up to 10.
     */

    public static void MultiplicationTable(int number) {
        System.out.println("--- Multiplication table of " + number + " --- ");
        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + i + " = " + (i * number));
        }
        System.out.println();
    }

    /*
     * Ex07:
     * Write a method called factorial with a short parameter named n.
     * This method should return the factorial of the number n as a Long.
     */

    public static long factorial(short n) {
        long fact = 1;
        while (n > 1) {
            fact *= n;
            n--;
        }
        return fact;
    }

    /*
     * Ex08:
     * Write a method called positiveNumber with no parameter.
     * This method should keep asking the user to enter a number till the user enter
     * a positive number.
     * And then return that positive number as an int.
     */

    public static int positiveNumber() {
        int number;
        Scanner reader = new Scanner(System.in);
        do {
            System.out.println("Enter a positive numnber: ");
            number = reader.nextInt();
        } while (number < 0);
        reader.close();

        return number;
    }

    /*
     * Challenge 01:
     * Write a method printYearsAndDays with parameter of type long named minutes.
     * 
     * The method should not return any value, and it needs to calculate the years
     * and days from the minutes parameter.
     * 
     * If the parameter is less than 0, print text "Invalid Value".
     * 
     * Otherwise, if the parameter is valid then it needs to print a message in the
     * format "XX min = YY years and ZZ days".
     * 
     * XX represents the original value minutes.
     * YY represents the calculated years.
     * ZZ represents the calculated days.
     * 
     * Example: 561600 min = 1 years and 25 days.
     * 
     */

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long minutesInYear = 60 * 24 * 365;
            long years = minutes / minutesInYear;
            long remainingMinutes = minutes % minutesInYear;
            long days = (int) (remainingMinutes / (60 * 24));
            System.out.println(minutes + " min = " + years + " years and " + days + " days.");
        }
    }

    /*
     * 
     * Write a method named getGreatestCommonDivisor with two parameters of type int
     * named first and second.
     * 
     * If one of the parameters is < 10, the method should return -1 to indicate an
     * invalid value.
     * 
     * The method should return the greatest common divisor of the two numbers
     * (int).
     * 
     * The greatest common divisor is the largest positive integer that can fully
     * divide each of the integers
     * (i.e., without leaving a remainder).
     * 
     * For example, 12 and 30:
     * 12 can be divided by 1, 2, 3, 4, 6, 12.
     * 30 can be divided by 1, 2, 3, 5, 6, 10, 15, 30.
     * The greatest common divisor is 6 since both 12 and 30 can be divided by 6,
     * and there is no resulting remainder.
     * 
     */
    public static int getGreatestCommonDivisor(int x, int z) {
        if (x >= z) {
            return x;
        } else {
            return z;
        }
    }

    public static void main(String[] args) {
        // Ex01 Solution
        // System.out.println("******** Ex01 Solution ********");

        // Ex02 Solution
        System.out.println("\n******** Ex02 Solution ********");

        // System.out.println("The results of (5 + 7) = " + intSum(5, 7));
        // System.out.println("The results of (-1 + 2) = " + intSum(-1, 2));
        // System.out.println("The results of (-5 - 1) = " + intSum(-5, -1));
        // Ex03 Solution
        // System.out.println("\n******** Ex03 Solution ********");

        // Ex04 Solution
        // System.out.println("\n******** Ex04 Solution ********");

        // Ex05 Solution
        // System.out.println("\n******** Ex05 Solution ********");

        // System.out.println("The maximum value between 5.2 , 7.58 ,and 3.58 is : " +
        // maxValue(5.2, 7.58, 3.58));
        // System.out.println("The maximum value between -15.35 , 0.52 ,and -8.23 is : "
        // + maxValue(-15.35, 0.52, -8.23));
        // System.out.println("The maximum value between -2.59 , -2 ,and -2.598 is : " +
        // maxValue(-2.59, -2, -2.598));

        // Ex06 Solution
        // System.out.println("\n******** Ex06 Solution ********");

        // MultiplicationTable(1);
        // MultiplicationTable(5);
        // MultiplicationTable(13);

        // Ex07 Solution
        // System.out.println("\n******** Ex07 Solution ********");

        // System.out.println("2! = " + factorial((short) 2));
        // System.out.println("7! = " + factorial((short) 7));
        // System.out.println("12! = " + factorial((short) 12));
        // System.out.println("25! = " + factorial((short) 25));

        // Ex08 Solution
        // System.out.println("\n******** Ex08 Solution ********");
        // System.out.println(positiveNumber());

        // Challenge 01 Solution
        // System.out.println("\n******** Challenge 01 Solution ********");

        // printYearsAndDays(561600);
        // printYearsAndDays(1051200);
        // printYearsAndDays(-5000);

        // challenge 02 Solution
        // System.out.println("\n******** Challenge 02 Solution ********");

        // System.out.println(getGreatestCommonDivisor(30, 12));
        // System.out.println(getGreatestCommonDivisor(12, 30));
        // System.out.println(getGreatestCommonDivisor(8, 9));
        // System.out.println(getGreatestCommonDivisor(-5, -2));
        // System.out.println(getGreatestCommonDivisor(35, 72));
        // System.out.println(getGreatestCommonDivisor(18, 24));
        // System.out.println(getGreatestCommonDivisor(55, 77));

    }

}