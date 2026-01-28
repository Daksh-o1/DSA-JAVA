public class matrix_operations {
    public static void main(String[] args) {
        int [][] matrixA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int [][] matrixB = {
            {9, 8, 7}, 
            {6, 5, 4},
            {3, 2, 1}
        };

        int rows = matrixA.length;
        int column = matrixA[0].length;
        int [][] sumMatrix = new int[rows][column];
        int [][] subMatrix = new int[rows][column];
        int [][] multiMatrix = new int[rows][column];

        // Addition of matrix
        for(int i =0; i<rows; i++){
            for(int j = 0; j<column;j++){
                sumMatrix[i][j] = matrixA[i][j]+matrixB[i][j];
                subMatrix[i][j] = matrixA[i][j]-matrixB[i][j];
            }
        }
        // Correct Matrix Multiplication
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                multiMatrix[i][j] = 0;
                for (int k = 0; k < column; k++) {
                    multiMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        // printing the matrix
        System.out.println("Matrix Addition:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
       
        System.out.println("Matrix Subtration:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(subMatrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matrix Multiplication:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(multiMatrix[i][j] + " ");
            }
            System.out.println();
        }        

    }
}
