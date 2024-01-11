import java.util.Scanner;

public class functions {
    public static void PrintMyName(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name = sc.nextLine();
        System.out.println(name);
        sc.close();
    }
}
