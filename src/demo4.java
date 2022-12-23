public class demo4 {
    public static void main(String[] args) {
        int[][] array1 = new int[2][3];
        array1[0][0] = 1;
        array1[0][1] = 2;
        array1[0][2] = 3;
        array1[1][0] = 4;
        array1[1][1] = 5;
        array1[1][2] = 6;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }

    }
}
