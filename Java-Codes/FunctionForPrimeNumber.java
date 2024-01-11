import java.util.Scanner;

public class FunctionForPrimeNumber {

    public static int PrintPrime(int a) {
        System.out.println(a);
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("Its Not a Prime Number !!");
        } else {
            System.out.println(PrintPrime(a) + " " + "Its a Prime Number ");
        }
        sc.close();
    }
}
