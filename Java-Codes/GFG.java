public class GFG {

    public static void main(String[] args)

    {

        int x = 0;

        int y = 0;

        for (int z = 0; z < 5; z++)

        {

            if ((++x > 2) || (++y > 2))

            {

                x++;

            }

        }

        System.out.println(x + " " + y);

    }

}
// Explation of above program
// By applying short circuit technique :
/*
 * z = 0: x = 1, y = 1, if condition false
 * z = 1: x = 2, y = 2, if condition false
 * z = 2: x = 3, if condition true and due
 * to short circuiting ++y is not evaluated,
 * x++ // x = 4
 * z = 3: x = 5, again if condition is true,
 * x++ // x = 6
 * z = 4: x = 7, condition true, x++ // x = 8
 */