import java.util.*;
public class program_11
{
    static int ASCII_count(String word) //function to extract the ASCII value and to calculate the sum
    {
        char ch; int len,sum=0;
        int length=word.length(); // calculating the length of the given string 
        for(int i=0;i<length;i++)
        {
            ch=word.charAt(i);
            sum+= (int)ch; // storing the sum of the ASCII values
        }
        return sum; //returning the value of the sorted ASCII sum to the main function 
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence"); //taking a sentence as input fromm the user 
        String st= sc.nextLine();
        String parts[]=st.split(" ");
        int len=parts.length;
        String temp;
        for(int i=0;i<len;i++)
        {
            for (int j=i+1;j<len;j++)
            {
                if(ASCII_count(parts[i])<ASCII_count(parts[j])) // checking the length of the two words and then sorting accordingly 
                {
                    temp=parts[i];
                    parts[i]=parts[j];
                    parts[j]=temp;
                }
            }
        }
        for(int i=0;i<len;i++)
        {
            System.out.print(parts[i]+" "); //printing the final array after sorting 
        }
    }
}