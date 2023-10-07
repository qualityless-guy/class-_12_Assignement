import java.util.Scanner; //importing scanner class in the program 
public class Program_6
 {
    public static void main(String[] args)//main function
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] words = input.split(" ");
        sortWordsByLength(words);

        System.out.println("Words arranged in ascending order of length:");
        for (String word : words) 
        {
            System.out.println(word);
        }
    }
    public static void sortWordsByLength(String[] words) 
    {
        for (int i = 0; i < words.length - 1; i++) //length checking condition
        {
            for (int j = i + 1; j < words.length; j++) //length checking condition for the second word
            {
                if (words[i].length() > words[j].length()) //checking the length of the words of the given sentence
                {
                    String temp = words[i]; //swapping the words 
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
    }
}
