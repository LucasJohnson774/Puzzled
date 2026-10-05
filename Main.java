import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        System.out.println("Welcome to Puzzled");
        boolean game = true;
        Scanner scan = new Scanner(System.in);
        while(game){
        int points = 0;
        System.out.println("Enter 1 for Word Scramble, Enter 2 for the number puzzle, Enter 3 for the word puzzle, Enter 4 for the chalenge mode, and Enter 5 to exit");
        String play = scan.next();
        if(play.equals("1")){
            points = Puzzle.wordScramble(scan);
            System.out.println("You scored " + points);}
        else if (play.equals("2")){
            points = Puzzle.numberPuzzle(scan);
            System.out.println("You scored " + points);}
        else if (play.equals("3")){
            points = Puzzle.wordPuzzle(scan);
            System.out.println("You scored " + points);}
        else if (play.equals("4")){
            System.out.println("\nGame 1 word scramble\n");
            points = Puzzle.wordScramble(scan);
            System.out.println("\nGame 2 number puzzle\n");
            int points2 = Puzzle.numberPuzzle(scan);
            System.out.println("\nGame 3 word puzzle\n");
            int points3 = Puzzle.wordPuzzle(scan);
            System.out.println("You scored " + points + " on game 1");
            System.out.println("You scored " + points2 + " on game 2");
            System.out.println("You scored " + points3 + " on game 3");
            points = points + points2 + points3;
            System.out.println("So your overall score is " + points);
        }
        else if (play.equals("5"))
            game = false;
        else
            System.out.println("Option error enter 1,2,3 or 4 only");
        
        }
        scan.close();
    }
}