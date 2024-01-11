import java.util.Scanner;
public class FunctionToCalculateProduct {
    public static int CalculateProduct(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();
        int product = CalculateProduct(a, b);
        System.out.println("The Product of Two Numbers is : " + product);
        sc.close();
    }

}
