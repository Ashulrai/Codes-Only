import java.util.Scanner;

public class ALLevenNumberTillN {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter The Number : ");
            int N = sc.nextInt();
            for (int i = 1; i <= N; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
