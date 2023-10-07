import java.util.*;
public class Program_5
 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("FIRST DATE" );
        System.out.println("Enter the day of thr first date");
        int day1 = sc.nextInt();
        System.out.println("Enter the month of the first date");
        int month1 = sc.nextInt();
        System.out.println("Enter the year of the first date");
        int year1 = sc.nextInt();
        System.out.println("SECOND DATE");
        System.out.println("Enter the day of the second date");
        int day2 = sc.nextInt();
        System.out.println("Enter the month of the second date");
        int month2 = sc.nextInt();
        System.out.println("Enter the year of the second date");
        int year2 = sc.nextInt();

        int differenceInDays = calculateDifferenceInDays(day1, month1, year1, day2, month2, year2);
        System.out.println("Difference between the dates: " + differenceInDays + " days");
    }

    public static int calculateDifferenceInDays(int day1, int month1, int year1, int day2, int month2, int year2) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Check for leap years
        if (isLeapYear(year1))
            daysInMonth[1] = 29;

        int totalDays1 = year1 * 365 + day1;

        for (int i = 0; i < month1 - 1; i++)
            totalDays1 += daysInMonth[i];

        // Account for leap year
        if (month1 > 2 && isLeapYear(year1))
            totalDays1 += 1;

        int totalDays2 = year2 * 365 + day2;

        for (int i = 0; i < month2 - 1; i++)
            totalDays2 += daysInMonth[i];

        // Account for leap year
        if (month2 > 2 && isLeapYear(year2))
            totalDays2 += 1;

        return Math.abs(totalDays2 - totalDays1);
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
