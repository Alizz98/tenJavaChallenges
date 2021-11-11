
/******************************************************************************

 Author: Ismail Ali
 Date: 11/11/2021

 This code includes ten programming problems. The challenges questions are from Tim Buchalka, an Udemy instructor who teaches the Java Programming Masterclass course.
 It's a fantastic approach to hone your coding abilities by writing methods. This set of ten questions is all about developing methods.
 I hope you like it, and have fun! There's always room for improvements. If you have any recommendations, please do not hesitate to share them with us.

 This program allows the user to select a challenge at random or on their own. If the user makes their own decision.
 The list of challenges will be presented in the program. When a user selects a challenge, it will provide additional information as well as four possibilities.
 if they need a clue, or a solution, or if they want to move on to the next challenge, or if they want to stop the program.
 The process continues until the user enters a value of -1 or an invalid value.

 *******************************************************************************/
package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main
{
    public static void main(String[] args) {

        int choise;

        Scanner input = new Scanner(System.in); // setting up the input

        Random random = new Random();   // setting the Random



        System.out.println("Hi! You've arrived to the programming challenge. There will be ten challenges from which to choose. " +
                "Once you've decided on a challenge, you'll get a greater details.");

        System.out.println(); /// new line

        // menu(); // calling the menu faction

        System.out.println(); // new line

        System.out.println("Do you want to pick the program yourself or do you want the computer to do it? " +
                "Enter 1 if you want to make your own choice; otherwise, enter 0.");

        System.out.println();// new line

        boolean hasNextInt = input.hasNextInt();

        if(hasNextInt){ // checking if the user enter a string
            choise = input.nextInt(); // getting the input from the user


            if(choise == 1 || choise == 0){ // checking if the user input is valid

                if(choise == 0){ // if user input is 0 then the challenge will be chosen random
                    choise = random.nextInt(10) + 1;

                }else{ //

                    System.out.println("Choose a challenge! ");

                    menu(); // calling menu faction

                    System.out.println();// new line
                    boolean hasInt = input.hasNextInt();
                    if(hasInt){
                        choise = input.nextInt(); // getting input form thr user
                    }else{
                        System.out.print("You have entered a Character, please enter a number ");
                        System.exit(0);
                    }
                }

                int count = 0;
                int mychar;



                if(choise >= 1 && choise <= 10){// checking if the user input is in range with spicfy Number

                    while(choise != -1){// the program will end if the user enter -1

                        if(count >= 10 ){ // checking if the user selected all the 10 chalange
                            System.out.println("You have chosen all program. Well-done");
                            break;
                        }


                        int d = choise; // d is for details
                        int h =  choise;// h is for hint

                        switch(choise){

                            case 1:

                                display(choise, d);
                                mychar = input.nextInt();
                                getSolutionsAndHits(mychar, choise, h);
                                count++;

                                break;

                            case 2:
                                display(choise, d );
                                mychar = input.nextInt();
                                getSolutionsAndHits(mychar, choise, h);
                                count++;

                                break;

                            case 3:
                                display(choise, d);
                                mychar = input.nextInt();
                                getSolutionsAndHits(mychar, choise, h);
                                count++;

                                break;

                            case 4:
                                display(choise, d);
                                mychar = input.nextInt();
                                getSolutionsAndHits(mychar, choise, h);
                                count++;

                                break;


                            case 5:
                                display(choise, d);
                                mychar = input.nextInt();
                                getSolutionsAndHits(mychar, choise, h);
                                count++;

                                break;

                            case 6:
                                display(choise, d);
                                mychar = input.nextInt();
                                getSolutionsAndHits(mychar, choise, h);
                                count++;

                                break;

                            case 7:
                                display(choise, d);
                                mychar = input.nextInt();
                                getSolutionsAndHits(mychar, choise, h);
                                count++;

                                break;

                            case 8:
                                display(choise, d);
                                mychar = input.nextInt();
                                getSolutionsAndHits(mychar, choise, h);
                                count++;

                                break;

                            case 9:
                                display(choise, d);
                                mychar = input.nextInt();
                                getSolutionsAndHits(mychar, choise, h);
                                count++;

                                break;
                            case 10:
                                display(choise, d);
                                mychar = input.nextInt();
                                getSolutionsAndHits(mychar, choise, h);
                                count++;

                                break;
                        }

                        menu();
                        System.out.println();
                        System.out.println("Do you want to Choose the program by your self or let the computer Choose it for you? To choise by your self enter 1 otherwise 0 or -1 to end the program");
                        System.out.println();
                        boolean isInt = input.hasNextInt();
                        if(isInt) {
                            choise = input.nextInt();

                            if (choise == -1) {
                                System.out.println("Good Bye! You have ended the program. See you. ");
                                System.exit(0);

                            }

                            if (choise == 1 || choise == 0) {

                                if (choise == 0) {
                                    choise = random.nextInt(10) + 1;

                                } else {
                                    System.out.println("Choose a challenge! ");
                                    if (choise >= 1 && choise <= 10) {
                                        menu();
                                        System.out.println();
                                        choise = input.nextInt();
                                    }
                                }

                            } else {
                                System.out.print("Please enter a valid number 1 or 0 ");
                                break;
                            }
                        }else{
                            System.out.print("You have entered a Character, please enter a number ");
                            System.exit(0);
                        }


                    }// while loop

                }else{
                    System.out.print("Please enter a valid number 1  to 10 ");
                    System.exit(0);
                }// write here


            }else{ // first if
                System.out.print("The program has end");
            }

        }else{
            System.out.print("You have entered a Character, please enter a number ");
        }

    }// end main

    public static void menu(){

        System.out.println("======================================");
        System.out.println("1. Leap Year Calculator");
        System.out.println("2. Number Palindrome");
        System.out.println("3. Even Digit Sum");
        System.out.println("4. First And Last Digit");
        System.out.println("5. Greatest Common Divisor");
        System.out.println("6. All Factors");
        System.out.println("7. Perfect Number");
        System.out.println("8. Largest Prime");
        System.out.println("9. Diagonal Star");
        System.out.println("10.Minutes To Year and Days Calculator");
        System.out.println("======================================");


    }
    //gets solutions and hits
    public static void getSolutionsAndHits(int choice, int s, int h){

        Scanner in = new Scanner(System.in);




        if (choice == -1){
            System.out.println("Good Bye! You have ended the program. See you. ");
            System.exit(0);

        }else{

            if(choice == 1 || choice == 2 || choice == 0){
                while(choice == 1 || choice == 2 ){
                    if(choice == 1){
                        hint(h);
                    }  else if (choice == 2){
                        solutions(s);
                    }

                    System.out.println("Do you need hint? press 1 for hint and 2 for solotion and 0 to countine or -1 to end the program ");
                    boolean isNumber = in.hasNextInt();

                    if(isNumber){
                        choice = in.nextInt();
                    }else{
                        System.out.println("You have entered a Character, please enter a number ");
                        System.exit(0);
                    }

                    if (choice == -1){
                        System.out.println("Good Bye! You have ended the program. See you. ");
                        System.exit(0);

                    }

                }// end while


                System.out.println("Great moving on to the next question");
                System.out.println();

            }else{
                System.out.println("Invalid entry. Try again");
            } // end of else


        }



    }// end

    // Displays the details
    public static void display(int choice, int d){
        System.out.println("Great!" + choice + " have been chosen ");
        System.out.println();
        System.out.println("Here are the details below ");
        System.out.println();
        details(d);
        System.out.println();
        System.out.println("Do you need hint? press 1 for hint or 2 for solution or 0 to continue or - 1 to end the program ");
    }
    // Solutions functions
    public static void solutions(int s){

        if(s == 1){

            System.out.println(" public static boolean isLeapYear (int year){\n" +
                    "\n" +
                    "        if (year <= 1 || year >= 9999) {\n" +
                    "\n" +
                    "            return false;\n" +
                    "\n" +
                    "\n" +
                    "        }else if (year % 4 == 0) {\n" +
                    "\n" +
                    "\n" +
                    "            if (year % 100 == 0) {\n" +
                    "\n" +
                    "\n" +
                    "                if (year % 400 == 0)\n" +
                    "                    return true;\n" +
                    "                else\n" +
                    "                    return false;\n" +
                    "            }\n" +
                    "\n" +
                    "            // if the year is not century\n" +
                    "            else\n" +
                    "                return true;\n" +
                    "        } else\n" +
                    "            return false;\n" +
                    "    }");
        } else if (s == 2 ){
            System.out.println("  public static boolean isPalindrome(int number) {\n" +
                    "        int palindrome = number;\n" +
                    "        int reverse = 0;\n" +
                    "\n" +
                    "        while (palindrome != 0) {\n" +
                    "            int remainder = palindrome % 10;\n" +
                    "            reverse = reverse * 10 + remainder;\n" +
                    "            palindrome = palindrome / 10;\n" +
                    "        }\n" +
                    "\n" +
                    "\n" +
                    "        if (number == reverse) {\n" +
                    "            return true;\n" +
                    "        }\n" +
                    "        return false;\n" +
                    "    }");

        }else if (s == 3 ){
            System.out.println("    public static int getEvenDigitSum(int number){\n" +
                    "\n" +
                    "        int sum = 0;\n" +
                    "\n" +
                    "        if(number < 0){\n" +
                    "\n" +
                    "            return -1;\n" +
                    "\n" +
                    "        } else{\n" +
                    "\n" +
                    "            for(int i = 0; i < number; i++){\n" +
                    "                if(i % 2 == 0){\n" +
                    "\n" +
                    "                    sum = sum + i;\n" +
                    "                }\n" +
                    "\n" +
                    "            }\n" +
                    "            \n" +
                    "            return sum;\n" +
                    "        }\n" +
                    "\n" +
                    "    }");

        }else if (s == 4 ){
            System.out.println("    public static int sumFirstAndLastDigit(int number){\n" +
                    "\n" +
                    "        int first = 0;\n" +
                    "        int last = 0;\n" +
                    "        int sum = 0;\n" +
                    "\n" +
                    "        last = number % 10;\n" +
                    "\n" +
                    "        if(number >= 0){\n" +
                    "\n" +
                    "\n" +
                    "            while(number != 0){\n" +
                    "\n" +
                    "                first = number % 10;\n" +
                    "                number = number / 10;\n" +
                    "\n" +
                    "                sum = first + last;\n" +
                    "            }\n" +
                    "\n" +
                    "\n" +
                    "            return  sum;\n" +
                    "\n" +
                    "        }\n" +
                    "\n" +
                    "        return -1;\n" +
                    "    }");

        }else if (s == 5 ){
            System.out.println("    public static int getGreatestCommonDivisor(int first, int second) {\n" +
                    "\n" +
                    "        if (first < 10 || second < 10) {\n" +
                    "            return -1;\n" +
                    "        }\n" +
                    "        while (first != second) {\n" +
                    "            if (first > second)\n" +
                    "                first = first - second;\n" +
                    "            else {\n" +
                    "                second = second - first;\n" +
                    "            }\n" +
                    "        }\n" +
                    "        return second;\n" +
                    "    }");

        }else if (s == 6 ){
            System.out.println("  public static void printFactors(int number){\n" +
                    "\n" +
                    "\n" +
                    "        if(number < 0){\n" +
                    "            System.out.println(\"Invalid Value\");\n" +
                    "        }\n" +
                    "\n" +
                    "        for (int i = 1; i <= number; i++){\n" +
                    "            if(number % i == 0){\n" +
                    "                System.out.println(i);\n" +
                    "            }\n" +
                    "\n" +
                    "        }\n" +
                    "    }");

        }else if (s == 7 ){
            System.out.println("public static boolean isPerfectNumber(int number){\n" +
                    "\n" +
                    "        int sum = 0;\n" +
                    "        if(number <= 0){\n" +
                    "\n" +
                    "            return false;\n" +
                    "        }\n" +
                    "\n" +
                    "        for (int i = 1; i < number; i++){\n" +
                    "\n" +
                    "            if(number % i == 0){\n" +
                    "                //System.out.println(i);\n" +
                    "                sum += i ;\n" +
                    "                System.out.println(sum);\n" +
                    "\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "        if(sum == number){\n" +
                    "\n" +
                    "            return true;\n" +
                    "\n" +
                    "        } else return false;\n" +
                    "\n" +
                    "    }");

        }else if (s == 8 ){
            System.out.println("public static int getLargestPrime(int number) {\n" +
                    "        if (number < 2) {\n" +
                    "            return -1;\n" +
                    "        }\n" +
                    "        for (int i = 2; i < number; i++) {\n" +
                    "            if ((number % i) == 0) {\n" +
                    "                number /= i;\n" +
                    "                i--;\n" +
                    "            }\n" +
                    "        }\n" +
                    "        return number;\n" +
                    "    }");

        }else if (s == 9 ){
            System.out.println("   public static void printSquareStar(int number){\n" +
                    "        if(number < 5) System.out.println(\"Invalid Value\");\n" +
                    "        else{\n" +
                    "            for (int i = 0; i <number; i++){\n" +
                    "                for (int j=0; j<number; j++){\n" +
                    "                    if(i==0 || i==number-1 || j==0 || j==number-1 || j==i || j==number-1-i) System.out.print(\"*\");\n" +
                    "                    else System.out.print(\" \");\n" +
                    "                }\n" +
                    "                System.out.println(\"\");\n" +
                    "            }\n" +
                    "        }\n" +
                    "    }");

        }else if (s == 10 ){
            System.out.println("public class MinutesToYearsDaysCalculator {\n" +
                    "    public static void printYearsAndDays(long minutes) {\n" +
                    "        if (minutes < 0) {\n" +
                    "            System.out.println(\"Invalid Value\");\n" +
                    "        } else {\n" +
                    "            long years = minutes / (60 * 24 * 365);\n" +
                    "            long yearsRemaining = minutes % (60 * 24 * 365);\n" +
                    "            long days = yearsRemaining / (60 * 24);\n" +
                    "            System.out.println(minutes + \" min \" + \"= \" + years + \" y and \" + days + \" d\");\n" +
                    "        }\n" +
                    "    }\n" +
                    "}");

        }


    }

    // Details function
    public static void details(int d){

        if(d == 1){

            System.out.println("Write a method isLeapYear with a parameter of type int named year.\n" +
                    "\n" +
                    "The parameter needs to be greater than or equal to 1 and less than or equal to 9999.\n" +
                    "\n" +
                    "If the parameter is not in that range return false.\n" +
                    "\n" +
                    "Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is a leap year, otherwise return false.");
        } else if (d == 2 ){
            System.out.println("Write a method called isPalindrome with one int parameter called number.\n" +
                    "\n" +
                    "The method needs to return a boolean.\n" +
                    "\n" +
                    "It should return true if the number is a palindrome number otherwise it should return false.\n" +
                    "\n" +
                    "Check the tips below for more info about palindromes.\n" +
                    "\n" +
                    "Example Input/Output\n" +
                    "\n" +
                    "isPalindrome(-1221); → should return true\n" +
                    "\n" +
                    "isPalindrome(707); → should return true\n" +
                    "\n" +
                    "isPalindrome(11212); → should return false because reverse is 21211 and that is not equal to 11212.");

        }else if (d == 3 ){
            System.out.println(" Write a method named getEvenDigitSum with one parameter of type int called number.\n" +
                    "\n" +
                    "The method should return the sum of the even digits within the number.\n" +
                    "\n" +
                    "If the number is negative, the method should return -1 to indicate an invalid value.");

        }else if (d == 4 ){
            System.out.println("Write a method named sumFirstAndLastDigit with one parameter of type int called number.\n" +
                    "\n" +
                    "The method needs to find the first and the last digit of the parameter number passed to the method, using a loop and return the sum of the first and the last digit of that number.\n" +
                    "\n" +
                    "If the number is negative then the method needs to return -1 to indicate an invalid value.\n");

        }else if (d == 5 ){
            System.out.println("Write a method named getGreatestCommonDivisor with two parameters of type int named first and second. \n" +
                    "\n" +
                    "If one of the parameters is &lt; 10, the method should return -1 to indicate an invalid value.\n" +
                    "\n" +
                    "The method should return the greatest common divisor of the two numbers (int).\n" +
                    "\n" +
                    "The greatest common divisor is the largest positive integer that can fully divide each of the integers (i.e. without leaving a remainder).");

        }else if (d == 6 ){
            System.out.println("Write a method named printFactors with one parameter of type int named number. \n" +
                    "\n" +
                    "If number is &lt; 1, the method should print \"Invalid Value\".\n" +
                    "\n" +
                    "The method should print all factors of the number. A factor of a number is an integer which divides that number wholly (i.e. without leaving a remainder).");

        }else if (d == 7 ){
            System.out.println("What is the perfect number?\n" +
                    "A perfect number is a positive integer which is equal to the sum of its proper positive divisors.\n" +
                    "Proper positive divisors are positive integers that fully divide the perfect number without leaving a remainder and exclude the perfect number itself.\n" +
                    "For example, take the number 6:\n" +
                    "Its proper divisors are 1, 2, and 3 (since 6 is the value of the perfect number, it is excluded), and the sum of its proper divisors is 1 + 2 + 3 = 6. \n" +
                    "\n" +
                    "Therefore, 6 is a perfect number (as well as the first perfect number).\n" +
                    "\n" +
                    "\n" +
                    "Write a method named isPerfectNumber with one parameter of type int named number. \n" +
                    "\n" +
                    "If number is &lt; 1, the method should return false.\n" +
                    "\n" +
                    "The method must calculate if the number is perfect. If the number is perfect, the method should return true; otherwise, it should return false.");

        }else if (d == 8 ){
            System.out.println("Write a method named getLargestPrime with one parameter of type int named number. \n" +
                    "\n" +
                    "If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.\n" +
                    "\n" +
                    "\n" +
                    "The method should calculate the largest prime factor of a given number and return it.");

        }else if (d == 9 ){
            System.out.println("Write a method named printSquareStar with one parameter of type int named number. \n" +
                    "\n" +
                    "If number is < 5, the method should print \"Invalid Value\".\n" +
                    "\n" +
                    "The method should print diagonals to generate a rectangular pattern composed of stars (*). This should be accomplished by using loops (see examples below).\n" +
                    "\n" +
                    "\n" +
                    "EXAMPLE INPUT/OUTPUT:\n" +
                    "\n" +
                    "EXAMPLE 1\n" +
                    "\n" +
                    "printSquareStar(5); should print the following:\n" +
                    "\n" +
                    "→ NOTE: For text in Code Blocks below, use code icon {...}  on Udemy\n" +
                    "\n" +
                    "*****\n" +
                    "** **\n" +
                    "* * *\n" +
                    "** **\n" +
                    "*****\n" +
                    "\n" +
                    "\n" +
                    "Explanation:\n" +
                    "\n" +
                    "*****   5 stars\n" +
                    "** **   2 stars space 2 stars\n" +
                    "* * *   1 star space 1 star space 1 star\n" +
                    "** **   2 stars space 2 stars\n" +
                    "*****   5 stars\n" +
                    "\n" +
                    "\n" +
                    "EXAMPLE 2\n" +
                    "\n" +
                    "printSquareStar(8); should print the following:\n" +
                    "\n" +
                    "********\n" +
                    "**    **\n" +
                    "* *  * *\n" +
                    "*  **  *\n" +
                    "*  **  *\n" +
                    "* *  * *\n" +
                    "**    **\n" +
                    "********\n" +
                    "\n" +
                    "\n" +
                    "The patterns above consist of a number of rows and columns (where number is the number of rows to print). For each row or column, stars are printed based on four conditions (Read them carefully):\n" +
                    "\n" +
                    "* In the first or last row\n" +
                    "\n" +
                    "* In the first or last column\n" +
                    "\n" +
                    "* When the row number equals the column number\n" +
                    "\n" +
                    "* When the column number equals rowCount - currentRow + 1 (where currentRow is current row number)");

        }else if (d == 10 ){
            System.out.println("Write a method printYearsAndDays with parameter of type long named minutes.\n" +
                    "\n" +
                    "The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.\n" +
                    "\n" +
                    "If the parameter is less than 0, print text \"Invalid Value\".\n" +
                    "\n" +
                    "Otherwise, if the parameter is valid then it needs to print a message in the format \"XX min = YY y and ZZ d\".\n" +
                    "\n" +
                    "XX represents the original value minutes.\n" +
                    "YY represents the calculated years.\n" +
                    "ZZ represents the calculated days.");

        }


    }

    public static void hint(int h){

        if(h == 1){

            System.out.println("To determine whether a year is a leap year, follow these steps:\n" +
                    "1. If the year is evenly divisible by 4, go to step\n" +
                    "2. Otherwise, go to step 5.2. If the year is evenly divisible by 100, go to step\n" +
                    "3. Otherwise, go to step 4.3. If the year is evenly divisible by 400, go to step\n" +
                    "4. Otherwise, go to step 5.4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true.\n" +
                    "5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return false.\n" +
                    "\n" +
                    "The following years are not leap years:\n" +
                    "1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600\n" +
                    "This is because they are evenly divisible by 100 but not by 400.\n" +
                    "\n" +
                    "The following years are leap years:\n" +
                    "1600, 2000, 2400\n" +
                    "This is because they are evenly divisible by both 100 and 400.");
        } else if (h == 2 ){
            System.out.println(" Tip: What is a Palindrome number?  A palindrome number is a number which when reversed is equal to the original number. For example: 121, 12321, 1001 etc.\n" +
                    "\n" +
                    "Tip: Logic to check a palindrome number\n" +
                    "\n" +
                    "Find the the reverse of the given number. Store it in some variable say reverse. Compare the number with reverse.\n" +
                    "\n" +
                    "If both are the the same then the number is a palindrome otherwise it is not.\n" +
                    "\n" +
                    "Tip: Logic to reverse a number\n" +
                    "\n" +
                    "Declare and initialize another variable to store the reverse of a number, for example reverse = 0.\n" +
                    "\n" +
                    "Extract the last digit of the given number by performing the modulo division (remainder).\n" +
                    "Store the last digit to some variable say lastDigit = num % 10.\n" +
                    "Increase the place value of reverse by one.\n" +
                    "To increase place value multiply the reverse variable by 10 e.g. reverse = reverse * 10.\n" +
                    "Add lastDigit to reverse.\n" +
                    "Since the last digit of the number is processed, remove the last digit of num. To remove the last digit divide number by 10.\n" +
                    "Repeat steps until number is not equal to (or greater than) zero. \n" +
                    "\n" +
                    "A while loop would be good for this coding exercise.");

        }else if (h == 3 ){
            System.out.println("getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20\n" +
                    "\n" +
                    "* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4\n" +
                    "\n" +
                    "* getEvenDigitSum(-22); → should return -1 since the number is negative");

        }else if (h == 4 ){
            System.out.println("* sumFirstAndLastDigit(252); → should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.\n" +
                    "\n" +
                    "* sumFirstAndLastDigit(257); → should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.\n" +
                    "\n" +
                    "* sumFirstAndLastDigit(0); → should return 0, the first digit and the last digit is 0 since we only have 1 digit, which gives us 0+0 and the sum is 0.\n" +
                    "\n" +
                    "* sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we only have 1 digit, which gives us 5+5 and the sum is 10.\n" +
                    "\n" +
                    "* sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.\n");

        }else if (h == 5 ){
            System.out.println("For example 12 and 30:\n" +
                    "\n" +
                    "12 can be divided by 1, 2, 3, 4, 6, 12\n" +
                    "\n" +
                    "30 can be divided by 1, 2, 3, 5, 6, 10, 15, 30\n" +
                    "\n" +
                    "The greatest common divisor is 6 since both 12 and 30 can be divided by 6, and there is no resulting remainder." +
                    "\n" +
                    "HINT: Use a while or a for loop and check if both numbers can be divided without a remainder.\n" +
                    "\n" +
                    "HINT: Find the minimum of the two numbers.");

        }else if (h == 6 ){
            System.out.println("For example, 3 is a factor of 6 because 3 fully divides 6 without leaving a remainder. In other words 6 / 3 = 2.\n" +
                    "HINT: Use a while or for loop.\n");

        }else if (h == 7 ){
            System.out.println("HINT: Use a while or for loop.\n" +
                    "\n" +
                    "HINT: Use the remainder operator.");

        }else if (h == 8 ){
            System.out.println("Since the numbers 0 and 1 are not considered prime numbers, they cannot contain prime numbers.");

        }else if (h == 9 ){
            System.out.println("The patterns above consist of a number of rows and columns (where number is the number of rows to print). For each row or column, stars are printed based on four conditions (Read them carefully):\n" +
                    "\n" +
                    "* In the first or last row\n" +
                    "\n" +
                    "* In the first or last column\n" +
                    "\n" +
                    "* When the row number equals the column number\n" +
                    "\n" +
                    "* When the column number equals rowCount - currentRow + 1 (where currentRow is current row number)\n" +
                    "\n" +
                    "\n" +
                    "HINT: Use a nested loop (a loop inside of a loop).\n" +
                    "\n" +
                    "HINT: To print on the same line, use the print method instead of println, e.g. System.out.print(\" \"); prints a space and does not \"move\" to another line.\n" +
                    "\n" +
                    "HINT: To \"move\" to another line, you can use an empty println call, e.g. System.out.println(); .");

        }else if (h == 10 ){
            System.out.println("* Use the remainder operator\n" +
                    "\n" +
                    "* 1 hour = 60 minutes\n" +
                    "\n" +
                    "* 1 day = 24 hours\n" +
                    "\n" +
                    "* 1 year = 365 days");

        }


    }
}



