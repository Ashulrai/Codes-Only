import java.util.Scanner;

public class nestedfoorloop {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the first Number : ");
            int a = sc.nextInt();
            System.out.println("Enter the second Number : ");
            int b = sc.nextInt();
            

            for(int i=1; i<=a; i++){
                for(int j=1; j<=b; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}