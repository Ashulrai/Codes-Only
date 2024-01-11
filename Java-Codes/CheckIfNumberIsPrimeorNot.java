import java.util.Scanner;
public class CheckIfNumberIsPrimeorNot {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the Number : ");
            int n= sc.nextInt();

            boolean IsPrime = true;
            for(int i=2 ; i<=n/2; i++){
                if (n % i == 0) {
                    IsPrime = false;
                    break;
            }
            }
   if (IsPrime) {
            if (n == 1) {
                System.out.println("Not a Prime Nor Composite !!");
            }else{
                System.out.println("Is a Prime Number !!");
            }
   }else{
            System.out.println("Not a Prime Number !!");
            }
        }
    }
    
}
 