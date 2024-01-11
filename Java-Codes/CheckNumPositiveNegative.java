import java.util.Scanner;

public class CheckNumPositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("positive number !!");
        } else if (num <= 0) {
            System.out.println(" Zero or Negative number !!");
        }
        sc.close();
    }
}