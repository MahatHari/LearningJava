/**
 * ThreeDMatrix follwing program creates a 3 by 4 by 5, three dimensional array
 * then loads each element with the product of its indexes displays these
 * products
 */
public class ThreeDMatrix {

    public static void main(String[] args) {
        int threeDMatrix[][][] = new int[3][4][5];
        int i, j, k = 0;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++) {
                    threeDMatrix[i][j][k] = i * j * k;
                }
            }
        }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++) {
                    System.out.print(threeDMatrix[i][j][k] + "  ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
