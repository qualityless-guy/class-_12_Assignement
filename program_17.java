public class program_17
{
    public static void main(String[] args) 
    {
        int count = 0;
        int number = 1;

        while (count < 10) 
        {
            if (isHappyNumber(number)) 
            {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }

    public static boolean isHappyNumber(int num) 
    {
        int sum = num;
        while (sum != 1 && sum != 4) 
        {
            int temp = sum;
            sum = 0;
            while (temp != 0) 
            {
                int digit = temp % 10;
                sum += digit * digit;
                temp /= 10;
            }
        }
        return sum == 1;
    }
}
