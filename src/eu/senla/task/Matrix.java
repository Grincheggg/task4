package eu.senla.task;

public class Matrix {

    private static String[][] matrix;

    public Matrix(int matrixSize, int ElementSize, int filingCounter) {
        matrix = new String[matrixSize][matrixSize];
        int counter = 0;
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                if (counter % filingCounter == 0) {
                    matrix[i][j] = Double.toString(Math.random()).substring(0, ElementSize);
                } else {
                    matrix[i][j] = StringUtil.getRandomString(ElementSize);
                }
                counter++;
             }
        }


    }

    public String[]  getMainDiag(){
        String[] result = new String[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            result[i] =matrix[i][i];
                }
        return result;
            }





    public String[]  getNotMainDiag(){
        String[] result = new String[matrix.length];
        for (int i = matrix.length-1; i >=0; i--) {
            result[i] =matrix[i][matrix.length - i - 1];
        }
        return result;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++){
                builder.append(matrix[i][j] + " ");
            }
            builder.append("\r\n");
        }
        return builder.toString();
    }

}

/*  StringBuilder builder = new StringBuilder();
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++){
                    builder.append(matrix[i][j] + " ");
                }
                builder.append("\r\n");
            }
            return builder.toString();*/