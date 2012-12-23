public class Matrix {
    public static double determinant(double[][] mat) {
        double result = 0;

        if (mat.length == 1) {
            result = mat[0][0];
            return result;
        }

        if (mat.length == 2) {
            result = mat[0][0] * mat[1][1] - mat[0][1] * mat[1][0];
            return result;
        }

        for (int i = 0; i < mat[0].length; i++) {
            double temp[][] = new double[mat.length - 1][mat[0].length - 1];

            for (int j = 1; j < mat.length; j++) {
                System.arraycopy(mat[j], 0, temp[j - 1], 0, i);
                System.arraycopy(mat[j], i + 1, temp[j - 1], i, mat[0].length
                        - i - 1);
            }

            result += mat[0][i] * Math.pow(-1, i) * determinant(temp);
        }

        return result;
    }
}
