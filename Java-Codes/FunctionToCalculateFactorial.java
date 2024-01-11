import java.util.Scanner;

public class FunctionToCalculateFactorial {
    public static void PrintFactorial(int facto) {
        System.out.println(facto);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Number : ");
            int facto = sc.nextInt();
            for (int i = facto; i >= 1; i--) {
                facto = facto * i;
            }
            System.out.println("The factorial is " + facto);
        }

    }

}
