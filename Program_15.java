import java.util.Scanner;

public class Program_15 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        // Input matrix elements
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Sort non-boundary matrix elements in ascending order
        for (int i = 1; i < rows - 1; i++) 
        {
            for (int j = 1; j < columns - 1; j++) 
            {
                for (int k = 1; k < rows - 1; k++) 
                {
                    for (int l = 1; l < columns - 1; l++) 
                    {
                        if (matrix[k][l] > matrix[i][j]) 
                        {
                            int temp = matrix[i][j];
                            matrix[i][j] = matrix[k][l];
                            matrix[k][l] = temp;
                        }
                    }
                }
            }
        }

        // Print the sorted matrix
        System.out.println("Sorted Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
