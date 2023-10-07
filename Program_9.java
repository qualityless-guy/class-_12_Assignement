import java.util.*;
public class Program_9
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a setence containing 3 to 100 characters");
        String st=sc.nextLine(); //taking the input from the user 
        System.out.println("Enter the value by which the encryption has to be done");
        int n = sc.nextInt(); // take the number input by which the encryption has to be done 
        int len=st.length(); //calculating th length of the given string 
        char ch, changed_ch;
        int ASCII_eq, converted_ASCII;
        if(len<3||len>100) // checking the given condition 
        System.out.println("The given sentence is invalid for the operation");
        else
        {
            System.out.println("The caesar cipher form of encryption of the given string is");
            for(int i=0;i<len;i++)
            {
                ch=st.charAt(i); // extracting the characters from the given string 
                ASCII_eq= (int)ch;
                converted_ASCII = ASCII_eq + n;
                if(converted_ASCII>90 || converted_ASCII>122) // to convert 'Z' to 'A' and 'z' to 'a' if encountered
                {
                converted_ASCII-= 26;
                System.out.print((char)converted_ASCII);
                }
                else
                {
                    System.out.print((char)converted_ASCII);
                }
            }
        }
    }
}