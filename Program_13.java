import java.util.Scanner;
public class Program_13
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows in the matrix: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns in the matrix: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the elements of the matrix:");

        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < columns; j++) 
            {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Lower Triangular Matrix:");

        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < columns; j++) 
            {
                if (i >= j) 
                {
                    System.out.print(matrix[i][j] + " ");
                } else 
                {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
