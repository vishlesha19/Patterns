//      *
//     * *
//    *   *
//   *     *
//  *********

public class HollowTriangle {
    public static void main(String args[]) {
        for (int i = 0; i < 5; i++) // row
        {
            // spcaes
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }

            // for *
            for (int k = 0; k <= 2 * i; k++) {
                if (k == 0 || k == 2 * i || i == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }
}
