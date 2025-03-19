/* Student Name: Samarth Mathur
* Student ID: 	000-700-958
* NetID: smathur3
* Program Name: MatrixCalc
* Description: We ask the user values for a matrix and a vector to create a resultant vector
*/


import java.util.Scanner;
class MatrixCalc {
    
    //initalize vector and matrix variables and create arrays
    private final static int VECTOR_SIZE = 3;
    private final static int MATRIX_SIZE = VECTOR_SIZE * VECTOR_SIZE;
    public static void main(String[] args) {
        double [] matrix = new double [MATRIX_SIZE];
        double [] vector = new double [VECTOR_SIZE];
        /* TODO: Create a new array of doubles called matrix that can store MATRIX_SIZE
                 number of values.
                 Then create a new array of doubles called vector that can store VECTOR_SIZE
                 number of values. */
        Scanner s = new Scanner(System.in);
        System.out.format("Enter %d matrix values: ", MATRIX_SIZE);
        
        // create a for loop for matrix size and vector size 
        for (int i = 0; i < MATRIX_SIZE; i++) {
            matrix[i] = s.nextDouble();
        }
        /* TODO: Use a for loop to input MATRIX_SIZE number of doubles and store it into the
                 matrix. The first value should go into matrix[0], second into matrix[1] and so
                 forth. NOTE: You MUST use a for loop to accomplish this. */
        System.out.format("Enter %d vector values: ", VECTOR_SIZE);  
        for (int i = 0; i < VECTOR_SIZE; i++) {
            vector[i] = s.nextDouble();
        }
        /* TODO: Use a for loop to input VECTOR_SIZE number of doubles and store it into the
                 vector. The first value should go into vector[0], second into vector[1] and so
                 forth. NOTE: You MUST use a for loop to accomplish this. */
        s.close();

        // use the multiply method for solving the result
        double[] result = multiply(matrix, vector);
        /* TODO: Call the multiply method and pass it the matrix first and then the vector. 
                 Store the result in another array called result. 
                 NOTE: multiply returns the array,
                 so do NOT create it and then get it from multiply. */
        System.out.print("Result = [");
        printVector(result);
        System.out.println("]");
    }


    private static void printVector(double[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
                System.out.format("%.3f ", arr[i]);

        }
        System.out.format("%.3f ", arr[arr.length - 1]);

        

        
        /* TODO: Print the array 'arr'. You will need a for loop for this.
                 Take note that there are spaces between each value and that
                 there is NO space after the last value printed! */
    }

    // function is to print the result values that were calculated and store number of values the user inputs
    private static double[] multiply(double[] matrix, double[] vector) {
        double[] result = new double[VECTOR_SIZE];

        for (int row = 0; row < VECTOR_SIZE; row++) {
            result[row] = 0;
            for (int col = 0; col < VECTOR_SIZE; col++) {
                result[row] += matrix[row * VECTOR_SIZE + col] * vector[col];
            }
        }

        return result;
        /* TODO: Create a new array called result that stores VECTOR_SIZE number
                 of values. This will be the result you return. */
        /* TODO: Calculate result. There are VECTOR_SIZE number of values in the
                 result. You will need TWO for loops. The *outer* for loop
                 will loop through each row, whereas the *inner* for loop
                 will loop through each column. */
        /* TODO: Return the result out of the method. */
    }
}