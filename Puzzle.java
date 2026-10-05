import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class Puzzle{
    public static int wordScramble(Scanner scan){
        Random random = new Random();
        String[] words = {"cheese", "orange", "python", "bookshelf", "photo","surfboard"};
        boolean gotWords = false;
        ArrayList<String> useWords = new ArrayList<>();
        while(gotWords == false){
            int pickWord = random.nextInt(6);
            if(!useWords.contains(words[pickWord])){
                useWords.add(words[pickWord]);
                if(useWords.size() == 3)
                    gotWords = true;
            }
        }
        
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

        

        return points;
    }

    public static int numberPuzzle(Scanner scan){
        Random random = new Random();
        ArrayList <String>  numPuz = new ArrayList<>();
        ArrayList <String> numAns = new ArrayList<>();
        String[] numPuzzles = {"3, 5, 9, 17, 33, ?", "4, 8, 6, 12, 10, 20, ?", "2, 10, 4, 15, 8, 20, 16, ?", "1, 2, 3, 6, 11, 20, ?", "1, 2, 5, 7, 11, 13, ?", "1,4,9,16,25,?" };
        String[] numAnswers = {"65", "18", "25", "37", "17", "36" };
        boolean gotNums = false;
                while(gotNums == false){
            int pickNum = random.nextInt(6);
            if(!numPuz.contains(numPuzzles[pickNum])){
                numPuz.add(numPuzzles[pickNum]);
                numAns.add(numAnswers[pickNum]);
                if(numPuz.size() == 3)
                    gotNums = true;
            }
        }
        int points = 0;
        System.out.println("Figure out the next number in the sequence");
        for(int i = 0; i < 3; i++){
            System.out.println(numPuz.get(i));
            String an = scan.next();
            if(an.equals(numAns.get(i)))
                points++;
            
        }
        return points;
    }

    public static int wordPuzzle(Scanner scan){
        Random random = new Random();
        String[] wordPuzzles = {"If a bat and a ball cost $1.10 and the bat cost $1 more than the ball how much does the ball cost?  Put ans in dollars exp .3 or .02", "If a farmer has 17 sheep and all but 9 die how many does he have left?", "If there are three apples and you take away 2 how many apples do you have?", "How many months have 28 days?", "If a doctor gives you three pills and says to take one every thirty minutes how many minutes will they last?", "How many times can you subtrack 10 from 100"};
        String[] correct = {".05", "9", "2", "12","60", "1"};
        ArrayList <String>  wordPrin = new ArrayList<>();
        ArrayList <String> wordAn = new ArrayList<>();
                boolean gotWord = false;
                while(gotWord == false){
            int pick = random.nextInt(6);
            if(!wordPrin.contains(wordPuzzles[pick])){
                wordPrin.add(wordPuzzles[pick]);
                wordAn.add(correct[pick]);
                if(wordPrin.size() == 3)
                    gotWord = true;
            }
        }
        System.out.println("Welcome to the word puzzle game");
        System.out.println("Answer each question with a single word or number");
        int points = 0;
        for(int i = 0; i < 3; i++){
            System.out.println(wordPrin.get(i));
            String ans = scan.next();
            if(ans.equals(wordAn.get(i)))
                points++;
            
        }
        return points;
    }



}