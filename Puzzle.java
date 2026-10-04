import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
public class Puzzle{

    public static int wordScramble(){
        Random random = new Random();
        String[] words = {"cheese", "orange", "python", "bookshelf", "photobooth"};
        boolean gotWords = false;
        ArrayList<String> useWords = new ArrayList<>();
        while(gotWords == false){
            int pickWord = random.nextInt(5);
            if(!useWords.contains(words[pickWord])){
                useWords.add(words[pickWord]);
                if(useWords.size() == 3)
                    gotWords = true;
            }
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to word scramble");
        System.out.println("Unscrabble the letters and enter your answer as the word");
        boolean puzzleRun = true;
        int points = 0;
        int wordCount = 0;
        while(puzzleRun == true){
            char[] scramble = useWords.get(wordCount).toCharArray();
            for(int i =0; i < scramble.length; i++){
                int place = random.nextInt(scramble.length);
                char holder = scramble[i];
                scramble[i] = scramble[place];
                scramble[place] = holder;
                 }
            System.out.println("Your scramble is:");
            System.out.println(scramble);
            String answer = scan.next();
            if (answer.equals(useWords.get(wordCount)))
                points ++;
            if(wordCount != 2)
                wordCount++;
            else
                puzzleRun = false;
        }

        

        scan.close();
        return points;
    }
}