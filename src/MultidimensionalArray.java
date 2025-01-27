public class MultidimensionalArray {
    public static void main(String[] args) {
        // Array Multidemennsi
        int[][] nomorku = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
        // System.out.println(nomorku[1][2]);

        // nomorku [1][2] = 9; //mengubah values array
        // System.out.println(nomorku[1][2]);

        // perulangan for
        for (int i = 0; i < nomorku.length; i++) {
            for (int j = 0; j < nomorku[i].length; j++) {
                System.out.print(nomorku[i][j]);
            }
        }
        // perulangan for each
        for (int[] row : nomorku) {
            for (int i : row) {
                System.out.print(i);
            }
        }
    }
}
