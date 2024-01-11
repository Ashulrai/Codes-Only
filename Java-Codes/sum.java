import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the first number : ");
            int a = sc.nextInt(); 
            System.out.print("enter the second number : ");
            int b = sc.nextInt();
            int sum = a + b ;
            System.out.println("The sum of all given number is : " + sum);
           
        }
    }
}
