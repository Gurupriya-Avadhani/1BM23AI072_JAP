package Gurupriya_Avadhani;

public class program_1b {
    public static void main(String[] args) {
        int size = 8;  // Size of the chessboard (8x8)
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // Check if the sum of the current row and column is even or odd
                if ((i + j) % 2 == 0) {
                    System.out.print("w ");  // Print * for even sum (black square)
                } else {
                    System.out.print("b ");  // Print space for odd sum (white square)
                }
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}