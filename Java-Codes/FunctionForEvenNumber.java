import java.util.Scanner;

public class FunctionForEvenNumber {
    public static int EvenOrNot(int a) {
        System.out.println(a);
        return a;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int a = input.nextInt();
        if (a % 2 == 0) {
            System.out.println(EvenOrNot(a) + " " + "Its an Even Number !!");
        } else {
            System.out.println("Its an Odd Number !!");
        }
        input.close();
    }
}
