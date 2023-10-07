import java.util.Scanner;

public class Program_4 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a date in DD/MM/YYYY format: ");
        String inputDate = scanner.nextLine();
        System.out.print("Enter the number of days to add: ");
        int n = scanner.nextInt();

        int day = Integer.parseInt(inputDate.substring(0, 2));
        int month = Integer.parseInt(inputDate.substring(3, 5));
        int year = Integer.parseInt(inputDate.substring(6));

        // Check if the given date is valid
        if (!isValidDate(day, month, year)) {
            System.out.println("Invalid date!");
            return;
        }

        // Add n days to the date
        for (int i = 0; i < n; i++) {
            day++;
            if (day > daysInMonth(month, year)) {
                day = 1;
                month++;
                if (month > 12) {
                    month = 1;
                    year++;
                }
            }
        }

        String outputDate = formatDayMonth(day) + "/" + formatDayMonth(month) + "/" + year;
        System.out.println("Date after " + n + " days: " + outputDate);
    }

    // Check if a given date is valid
    private static boolean isValidDate(int day, int month, int year) {
        if (year < 0 || month < 1 || month > 12 || day < 1 || day > daysInMonth(month, year)) {
            return false;
        }
        return true;
    }

    // Get the number of days in a month
    private static int daysInMonth(int month, int year) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Check for leap year
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }

        return days[month - 1];
    }

    // Check if a given year is a leap year
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Format day or month with leading zero if necessary
    private static String formatDayMonth(int value) {
        return (value < 10) ? "0" + value : String.valueOf(value);
    }
}