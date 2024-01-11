public class GFG2 {
    public static void main(String[] args) {

        for (int k = 0; k < 20; k = k + 2)

        {

            if (k % 3 == 1)

                System.out.print(k + " ");

        }

    }
}
/*
 * Explanation
 * 
 * for loop starts from 0 to 20 and increments with 2 at each iteration.
 * k = 0 % 3 = 0
 * 
 * k = 2 % 3 = 2
 * 
 * k = 4 % 3 = 1 // prints 4
 * 
 * k = 6 % 3 = 0
 * 
 * k = 8 % 3 = 2
 * 
 * k = 10 % 3 = 1 // prints 10
 * 
 * k = 12 % 3 = 0
 * 
 * k = 14 % 3 = 2
 * 
 * k = 16 % 3 = 1 // prints 16
 * 
 * k = 18 % 3 = 0
 * 
 * So, Output is 4 10 16
 */