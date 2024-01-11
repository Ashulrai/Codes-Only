public class inverted180rotatedpyramid {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n; i++){
            //inner loop for space 
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // inner loop to print stars 
            for(int j=1; j<=i; j++){
                System.out.print(j+"*");
            }
            System.out.println();
        }
    }
}
