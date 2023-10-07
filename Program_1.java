import java.util.Scanner;
public class Program_1
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (DD/MM/YYYY): ");
        String input = scanner.nextLine();
        scanner.close();

        boolean isValid = validateDate(input);
        if (isValid) {
            System.out.println("Valid date!");
        } else {
            System.out.println("Invalid date!");
        }
    }

    public static boolean validateDate(String date) 
    {
        // Check if the date string matches the expected format
        if (!date.matches("\\d{2}/\\d{2}/\\d{4}")) 
        {
            return false;
        }

        // Extract day, month, and year from the date string
        String[] parts = date.split("/");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        // Check if the year is a leap year
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Validate the month
        if (month < 1 || month > 12) {
            return false;
        }

        // Validate the day
        int maxDay = 31;
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            maxDay = 30;
        } else if (month == 2) {
            maxDay = isLeapYear ? 29 : 28;
        }
        return day >= 1 && day <= maxDay;
    }
}