import java.util.Scanner;
public class FunctionToCheckNumberIsPrimeOrNot {
    public static int PrimeNumber(int a) {
        int Prime = a;
        return Prime;
    }

    public static void main(String[] args, int a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Not a Prime Number !!");
        } else {
            System.out.println("Its a Prime Number !!!" + PrimeNumber(a));
        }
        sc.close();
    }
}
