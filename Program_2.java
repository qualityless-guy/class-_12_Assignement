import java.util.Scanner;

public class Program_2
 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date in DD/MM/YYYY format: ");
        String input = scanner.nextLine();
        scanner.close();

        int day = Integer.parseInt(input.substring(0, 2));
        int month = Integer.parseInt(input.substring(3, 5));
        int year = Integer.parseInt(input.substring(6));

        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Check for leap year
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            daysInMonth[2] = 29;
        }

        int nthDay = day;
        for (int i = 1; i < month; i++) {
            nthDay += daysInMonth[i];
        }

        System.out.println("The nth day of the year is: " + nthDay);
    }
}