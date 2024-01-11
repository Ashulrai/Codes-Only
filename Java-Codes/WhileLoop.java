public class WhileLoop {
    public static void main(String[] args) {
        int  a = 1;
        while (true) {
            System.out.println(a);
            a++;
            {
            if (a > 100 ) {
                break;
            }
            }
        }

    }
}
