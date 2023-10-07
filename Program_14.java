import java.util.*;
public class Program_14
 {
    
    // Function to check if a number is prime
    public static boolean isPrime(int number)
    {
        if (number <= 1)
        {
            return false;
        }
        
        for (int i = 2; i * i <= number; i++) 
        {
            if (number % i == 0)
            {
                return false;
            }
        }
        
        return true;
    }
    
    // Function to check if a number is an Adam number
    public static boolean isAdamNumber(int number)
    {
        int square = number * number;
        int reverseSquare = 0;
        
        while (square > 0) 
        {
            reverseSquare = reverseSquare * 10 + square % 10;
            square /= 10;
        }
        int reverseSquareRoot = (int) Math.sqrt(reverseSquare);
        
        return reverseSquareRoot * reverseSquareRoot == reverseSquare;
    }
    
    // Function to print all prime Adam numbers within a given range
    public static void printPrimeAdamNumbers(int start, int end) 
    {
        System.out.println("Prime Adam numbers between " + start + " and " + end + ":");
        
        for (int i = start; i <= end; i++) 
        {
            if (isPrime(i) && isAdamNumber(i)) 
            {
                System.out.println(i);
            }
        }
    }
    
    // Main method to test the program
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lower limit of the range");
        int start, end;
        start=sc.nextInt();
        System.out.println("Enter the upper limit of the range");
        end=sc.nextInt();
        printPrimeAdamNumbers(start, end);
    }
}
