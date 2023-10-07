import java.util.Scanner;
public class program_8 
{
    // Function to check if a number is prime
    public static boolean isPrime(int num) 
    {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) 
        {
            if (num % i == 0)
                return false;
        }
        return true;
    }
    // Function to rotate the digits of a number
    public static int rotateNumber(int num) 
    {
        int lastDigit = num % 10;
        int remainingDigits = num / 10;
        int placeValue = (int) Math.pow(10, String.valueOf(num).length() - 1);
        int rotatedNumber = lastDigit * placeValue + remainingDigits;
        return rotatedNumber;
    }

    // Function to check if a number is a circular prime
    public static boolean isCircularPrime(int num) 
    {
        int temp = num;
        int numDigits = String.valueOf(num).length();

        // Check if the number is prime and rotate its digits
        while (isPrime(temp)) 
        {
            temp = rotateNumber(temp);
            if (temp == num)
                return true;
        }
        return false;
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isCircularPrime(number)) 
        {
            System.out.println(number + " is a circular prime number.");
        } else 
        {
            System.out.println(number + " is not a circular prime number.");
        }
    }
}
