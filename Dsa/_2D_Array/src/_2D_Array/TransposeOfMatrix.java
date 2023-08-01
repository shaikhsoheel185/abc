package _2D_Array;
// Given a 2D integer array n*n matrix, return the transpose of matrix.
// The transpose of a matrix is the matrix flipped over its main diagonal,
// switching the matrix's row and column indices.

// Solution:
//TC: O(n*n)
//SC: O(1)
public class TransposeOfMatrix {

    public static int [][]  Transpose (int [][] m) {

        for (int i=0; i< m.length-1; i++) {
            for (int j=i; j<m[0].length-1; j++) {

                // Swap

                int temp = m[i][j];
                m[i][j]  = m[j][i];
                m[j][i]  = temp;

            }
        }

        return m;
    }

    public static void main(String[] args) { 
        int [][] mat = {

                { 1,   2,  3,  4},
                { 6,   7,  8,  9},
                { 11, 12, 13, 14},
                { 16, 17, 18, 19},

        };

        int [][] q = TransposeOfMatrix.Transpose(mat);

        for (int i=0; i< q.length; i++) {
            for ( int j=0; j< q[0].length; j++) {
                System.out.print(q[i][j] + " => ");
            }
        }
    }
}
