import java.util.Scanner;

public class conditional {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // int Age = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();

            /*
             * if (Age >= 18 ) {
             * System.out.println("You Are Adult");
             * } else {
             * System.out.println("You Are Kid");
             * }
             */
            /*
             * if (X % 2 == 0 ) {
             * System.out.println("Even");
             * } else {
             * System.out.println("Odd");
             * }
             */
            if (A == B) {
                System.out.println("A is equals to B");
            } else {
                if (A > B) {
                    System.out.println("A is Greater then B");
                } else {
                    System.out.println("A is Lesser then B ");
                }
            }
        }

    }

}