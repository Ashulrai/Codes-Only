import java.util.Scanner;

public class profirLoss {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the Cost of Product : ");
        int cp = Sc.nextInt();
        System.out.print("Enter the Selling Price : ");
        int sp = Sc.nextInt();
        int ans;
        if (cp < sp) {
            ans = sp - cp;
            System.out.println("Profit of : " + ans);
        } else if (cp > sp) {
            ans = sp - cp;
            System.out.println("Loss of :" + ans);
        } else {
            System.out.println("No loss or Profit!!");
        }
        Sc.close();
    }
}
