package eu.senla.task;

public class Main {
    public static final int MATRIX_SIZE = 10;
    public static final int ELEMENT_SIZE = 6;
    public static final int FILING_COUNTER = 3;

    public static void main(String[] args) {
       Matrix matrix = new Matrix(MATRIX_SIZE, ELEMENT_SIZE,FILING_COUNTER);
        System.out.println(matrix);

        String[] mainDiag =matrix.getMainDiag();

        StringBuilder stringBuilder = new StringBuilder();
        Double[] doubleArrays = new Double[(int)Math.ceil(MATRIX_SIZE*1.0/FILING_COUNTER)];
        int counter = 0;
        for (int i = 0; i < mainDiag.length; i++) {
            if(StringUtil.isNumber(mainDiag[i])){
                Double value = Double.parseDouble(mainDiag[i]);
                if (value >= 0.7){
                    value = Math.ceil(value);
                }else{
                    value = Math.floor(value);
                }
                doubleArrays[counter++ ] = value;
            }else{
                stringBuilder.append(mainDiag[i].substring(1,4));
                stringBuilder.append(",");
            }
        }
        System.out.println(stringBuilder.toString());
        for (Double element : doubleArrays){
            System.out.print(element + "_");
        }

    }

    }

