import java.util.*;
public class program_16
 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lower limit of the range");
        int startRange = sc.nextInt(); // Starting range
        System.out.println("Enter the upper limit of the range");
        int endRange = sc.nextInt(); // Ending range
        
        // Loop through the numbers within the range
        for (int i = startRange; i <= endRange; i++) 
        {
            int triangularNumber = calculateTriangularNumber(i);

            // Check if the triangular number is within the range
            if (triangularNumber >= startRange && triangularNumber <= endRange) {
                System.out.println(triangularNumber);
            }
        }
    }

    // Method to calculate the triangular number for a given input
    public static int calculateTriangularNumber(int n) {
        return (n * (n + 1)) / 2;
    }
}
