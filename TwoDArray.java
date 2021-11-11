/**
 * TwoDArray
 */
public class TwoDArray {

    public static void main(String[] args) {
        int twoD[][] = new int[4][5];
        int i, j, k = 0; // 3 variable i j k of type int
        // following code assigns value to towD array
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                twoD[i][j] = k;
                k++;
            }
        }

        /** Using indention to print from outer loop */
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++)
                System.out.print(twoD[i][j] + " ");
            System.out.println();
        }
    }
}