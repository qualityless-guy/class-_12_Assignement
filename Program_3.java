import java.util.*;
public class Program_3
 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nth day and the year in order to print the date");
        
        int nthDay = sc.nextInt(); // Replace with the input nth day
        int year = sc.nextInt(); // Replace with the input year

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int month = 1;
        int day = nthDay;

        if (year % 4 == 0) {
            daysInMonth[1] = 29; // Leap year
        }

        for (int days : daysInMonth) {
            if (day > days) {
                day -= days;
                month++;
            } else {
                break;
            }
        }

        System.out.println("Date: " + month + "/" + day + "/" + year);
    }
}