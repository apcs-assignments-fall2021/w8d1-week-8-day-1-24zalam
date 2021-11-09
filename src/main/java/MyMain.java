import java.util.Scanner;

public class MyMain {

    // Generates a random number between 10 and 20, inclusive
    public static int randomTeen() {
  return (int) (Math.random() * 11) + 10;


    }






    public static void main(String[] args) {
        int a = Mathey.pow(5, 2);
        int b = Mathey.pow(12, 2);
        int c=a+b;
        System.out.println(c);



        System.out.println("Mathey.max tests");
        System.out.println(Mathey.max(1, 2)); // 2
        //Check and returns the bigger double between x and y
        System.out.println(Mathey.max(2.8, 1.8)); // 2.8
         //Checks and returns the biggest int value of x, y, and z
        System.out.println(Mathey.max(2, 1,5)); //5
        //Checks and returns the biggest int value of w, x, y, and z
        System.out.println(Mathey.max(2, 1,5,9)); //9.0
        //Takes two integers and returns a random number between both numbers
        System.out.println(Mathey.randomInteger(1, 7)); //4
        //Takes one integer and returns a random number between 0 and the integer
        System.out.println(Mathey.randomInteger( 7));

        // (How to write tests example on pow function)

        // What was the problem?
        /* Write a method that takes **two integers** and calculates the exponent
         * that you get by raising the first integer to the second integer
         * you may assume that both integers are positive
         * Ex. pow(2, 5) => 32
         *     pow(3, 4) => 81
         */

        // What do I want pow(x,y) to do?
        //    I want pow(x,y) to return x^y as an integer, where x and y are both integers
        // What do I not want pow(x,y) to do?
        //    Anythign else.
        //    I don't want pow(x,y) to return any number not equal to x^y, or any other datatype (not an int)

        // Test cases:
        System.out.println("pow");
        System.out.println(Mathey.pow(0,0)); // 1

        System.out.println(Mathey.pow(1,0)); // 1

        System.out.println(Mathey.pow(2,0));// 1

        System.out.println(Mathey.pow(0,0));// 1

        System.out.println(Mathey.pow(0,1));// 0

        System.out.println(Mathey.pow(0,2));// 0


        System.out.println(Mathey.pow(1,1));//1

        System.out.println(Mathey.pow(2,1));//2

        System.out.println(Mathey.pow(3,1));//3

        System.out.println(Mathey.pow(1,1));//1

        System.out.println(Mathey.pow(1,2));//1

        System.out.println(Mathey.pow(1,3));//1


        System.out.println(Mathey.pow(1,2));//1

        System.out.println(Mathey.pow(2,2));//4

        System.out.println(Mathey.pow(3,2));//9

        System.out.println(Mathey.pow(2,1));//2

        System.out.println(Mathey.pow(2,2));//4

        System.out.println(Mathey.pow(2,3));//8

        //Prints the abs value of the int
        System.out.println("abs");//2
        System.out.println(Mathey.abs(2));//2
        System.out.println(Mathey.abs(-2));//2
        System.out.println(Mathey.abs(0));//0

        //takes double and rounds double
        System.out.println("round");
        System.out.println(Mathey.round(2.0));//2
        System.out.println(Mathey.round(2.1)); //2
        System.out.println(Mathey.round(2.5));//3
        System.out.println(Mathey.round(2.9)); //3

        //returns the floor version of number
        System.out.println("floor");
        System.out.println(Mathey.floor(2.8)); //2
        System.out.println(Mathey.floor(3.999999999)); //3
        System.out.println(Mathey.floor(2.4545));
        System.out.println(Mathey.floor(0));


        //returns the ceil version of number
        System.out.println("ceil");
        System.out.println(Mathey.ceil(2.99999)); //3
        System.out.println(Mathey.ceil(3.0)); //3.9999
        System.out.println(Mathey.ceil(3.01)); //4.0
        System.out.println(Mathey.ceil(0)); //4.0

        //sqrt
        System.out.println("sqrt");
        System.out.println(Mathey.sqrt(5.0));
        System.out.println(Mathey.sqrt(2.99999));
        System.out.println(Mathey.sqrt(0));
        //System.out.println(Mathey.sqrt(-9));
        //System.out.println(Mathey.sqrt(-2.3456));



        // How to make tests?

        // Key idea:
        //   for testing, we always check to see that whenever we expect something to happen, the thing happens, AND
        //   whenever we don't epect the something to hhappen, that thing doesn't happen.

        // 1. Define your idea:
        // 2. Get a clear icdea of exactly waht we want to do. (use problem definitions, targets, ideas , etc)
        // 3. Get a calear idea of exactly what we don't want to do.

        // try to break your code

        //Goal for tests:
        //   Your code does exactly what you want it do, and never does anything you don't want it to, for ANY possible input to the code


            }

        

         // Uncomment this code later!

                 }





