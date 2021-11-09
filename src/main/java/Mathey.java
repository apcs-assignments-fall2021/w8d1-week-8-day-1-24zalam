public class Mathey {






    /* Write your own version of the Math.max method
     * Your method should be called max
     * This method should take **two integers** and return the larger integer
     * Ex. max(1, 2) => 2

     * You will need to practice writing the method signature below!
     * public static ...
     */
   public static int max(int x, int y) {
       if (x > y) {
           return x;
       }
       return y;
   }


    /* Write another method called max that takes **two doubles**
     * Ex. max(1.2, 4.0) => 4.0
     */
   public static double max(double x, double y) {
   if (x>y) {
       return x;
   }
   return y;
   }





    /* Write another method called max that takes **three integers**
     * Ex. max(1, 4, 2) => 4
     */
    public static int max(int x, int y, int z) {
        if(x>y && x>z) {
            return(x);
        }
        if(y>x && y>z) {
            return(y);
        }
        if(z>x && z>y) {
            return(z);
        }
        else {
            return(x);
        }
    }



    /* Write another method called max that takes **four doubles**
     * Ex. max(1.0, 4.25, 1.3, 2.1) => 4.25
     */
    public static double max(double w, double x, double y, double z) {
        if(w>x && w>y && w>z) {
            return(w);
        }
        if(x>y && x>z && x>w) {
            return(x);
        }
        if(y>x && y>z && y>w) {
            return(y);
        }
        if(z>x && z>y && z>w) {
            return(z);
        }
        else {
            return(x);
        }
    }




    /* Write a method that takes **two integers** and generates a random
     * integer between the first integer and the second integer, inclusive
     * you may assume that the first integer is smaller than the second
     * You may use Math.random() here, but you can't use any other Math methods!
     * Ex. randomInteger(1, 4) => 3
     *     randomInteger(1, 4) => 2
     *     randomInteger(1, 4) => 4
     */
    public static int randomInteger(int x, int y) {
        return ((int)(Math.random()*(y-x)+1)+(x));

    }




    /* Write a method that takes **one integer** and generates a random
     * integer between 0 and the integer, inclusive
     * you may assume that the integer is greater than 0
     * Ex. randomInteger(5) => 3
     *     randomInteger(5) => 5
     *     randomInteger(5) => 0
     */
    public static int randomInteger(int x) {
        return (int)((Math.random())*(x+1));



    }






    // YOU MAY WORK ON THE FOLLOWING METHODS IF YOU FINISH EARLY

    /* Write a method that takes **two integers** and calculates the exponent
     * that you get by raising the first integer to the second integer
     * you may assume that both integers are positive
     * Ex. pow(2, 5) => 32
     *     pow(3, 4) => 81
     */
    //returns x^y
    public static int pow(int x, int y) {
        int result = 1;
        for(int z=1; z<=y; z++) {
        result*=x;

        }
        return result;
    }



    /* Write a method that takes **one integer** and returns the
     * absolute value of that integer
     * Ex. abs(2) => 2
     *     abs(-2) => 2
     */
   public static int abs(int x) {
       if (x < 0) {
           return (x * -1);
       } else {
           return x;
       }

   }



       /* Write a method that takes **one double** and returns the
        * integer value that you get by rounding that double
        * You may assume that the integer is positive
        * Ex. round(2.4) => 2
        *     round(2.5) => 3
        */
       public static double round (double x){
           if (x % 1 >= 0.5) {
               return ((int)(x+1));
           }
           return (int)(x);
       }






           /* Write a method that takes **one double** and returns the
            * floor of that value
            * The floor is defined as the **largest** integer that is **less than**
            * or equal to some value
            * You may assume that the integer is positive
            * Ex. floor(2.4) => 2
            *     floor(2.999999999999) => 2
            */
           public static double floor (double x){
               return (int)(x);
           }





           /* Write a method that takes **one double** and returns the
            * ceiling of that value
            * The ceiling is defined as the **smallest** integer that is **greater than**
            * or equal to some value
            * You may assume that the integer is positive
            * Ex. ceil(2.99999) => 3
            *     ceil(3.01) => 4
            */
            // we may define the ceiling of a number, x, as ceil(x) = y, where y is the smallest integer greater than or equal to x
            //                                              ceil(x) = the smallest integer greater than or equal to x


           public static int ceil ( double num) {
           return (int)(num + 0.99999);

}




           /* Calculates the square root iteratively, using the Babylonian method
            * This method has been provided for you
            */
           public static double sqrt ( double x){
               double x1 = 5;
               double prev = 0;

               while (Math.abs(prev - x1) > 0.0001) {
                   prev = x1;
                   x1 = (x1 + x / x1) / 2;
               }

               return x1;
           }
       }

