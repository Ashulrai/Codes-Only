public class invertedpramid {
    public static void main(String[] args) {
        int a = 6;
        for(int i=a; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println();
    }
}
