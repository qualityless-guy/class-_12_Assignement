import java.util.Scanner;
public class Program_7
{
    public static void main(String[] args) //main function
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: "); //taking the sentence as input from the user 
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        // Sort the words based on the number of vowels using a bubble sort algorithm
        for (int i = 0; i < words.length - 1; i++) 
        {
            for (int j = 0; j < words.length - i - 1; j++) 
            {
                if (countVowels(words[j]) > countVowels(words[j + 1])) 
                {
                    // Swap words[j] and words[j + 1]
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }
        System.out.println("Words sorted by the number of vowels:");
        for (String word : words) 
        {
            System.out.println(word);
        }
    }
    private static int countVowels(String word) 
    {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < word.length(); i++) 
        {
            if (vowels.contains(String.valueOf(word.charAt(i)))) 
            {
                count++;
            }
        }
        return count;
    }
}
