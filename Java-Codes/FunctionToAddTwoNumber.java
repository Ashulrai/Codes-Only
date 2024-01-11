import java.util.Scanner;
public class FunctionToAddTwoNumber {
    public static int AddTwoNumbers(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the first Number : ");
            int a = sc.nextInt();
            System.out.print("Enter the second number : ");
            int b = sc.nextInt();
            int sum = AddTwoNumbers(a, b);
            System.out.print("Sum of Two numbers : " + sum);
        }
    }
}