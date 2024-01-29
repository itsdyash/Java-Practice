//Guess the number Game.
import java.util.Random;
import java.util.Scanner;
class Game{
    Random ran = new Random();
    Scanner sc = new Scanner(System.in);
    int input,x;
    private int noOfGuesses,chances;
    String tries;
    void setnoOfGuesses(){
        noOfGuesses =1;
    }
    int getnoOfGuesses(){

        return noOfGuesses;
    }
    void setnoOfchances(){
        chances = 1;
    }
    int getnoOfChances(){

        return chances;
    }
    Game(){
         x = ran.nextInt(100);
    }
    int takeuserinput(){
        System.out.println("Enter the number : ");
        input = sc.nextInt();
        return input;
    }
    void iscorrectnumber(){
        if (input>x){
            System.out.println("Number is larger");
            gameon();

        }
        else{
            System.out.println("Number is smaller");
            gameon();
        }
    }
    void gameon(){
        takeuserinput();
        System.out.println("Your number : "+ input);
            if(input==x){
                System.out.println("you won HOORAY!!!!!!");
                System.out.println("Your number of Guesses are :" + getnoOfGuesses());
                chance();
            }
            else{
                noOfGuesses++;
                iscorrectnumber();
            }
    }
    void chance(){
        System.out.println("Want to play one more Chance... If yes type \"yes\"... If no type \"no\"");
        tries = sc.next();
        switch (tries) {
            case "yes" -> {
                x = ran.nextInt(100);
                chances++;
                gameon();
            }
            case "no" -> {
                System.out.println(".....Game is over.....");
            }
        }
    }
}
public class guessTheNumber {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        Game game = new Game();
        System.out.println(".....GUESS THE NUMBER.....");
        //System.out.println(game.x);
        game.setnoOfGuesses();
        game.setnoOfchances();
        game.gameon();
        System.out.println("Your Total number of chances are : "+game.getnoOfChances());
    }
}