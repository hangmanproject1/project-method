
import java.util.*;
public class Hangman
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        Intro(console);
        Main(console);
    }
    
    public static void Intro(Scanner input)
    {
        Scanner input2 = new Scanner(System.in);
        String[] array1 = {"word", "cattywampus", "diphthong", "Jack Lame"};
        String[] array2 = new String[word1.length()];
        int randomWord = (int)(3 * Math.random());
        for (int i = 0; i <= array1[randomWord].length() - 1; i++)
        {
            array2[i] = word1.substring(i, i + 1);
        }
        
        for (int i = 0; i <= word1.length() - 1; i++)
        {
            System.out.print(array2[i] + " ");
        }
    }
    
    public static void Main(Scanner input2)
    {
        Scanner input3 = new Scanner(System.in);
        String top = ("  _ _");
        String noose = (" |   |");
        String head = (" |");
        String body = (" |");
        String legs = (" |");
        String bottom = ("- - -");
        
    }
}
