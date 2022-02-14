import java.util.ArrayList;
import java.util.List;

public class Player {
    private int numGames;
    private int numberOfWinRounds;
    private int numberOfLoseRounds;
    private Dice dice1;
    private Dice dice2;


    public Dice getDice1() {
        return dice1;
    }

    public Dice getDice2() {
        return dice2;
    }

    public void throwDice1(Dice dice1){
        this.dice1 = dice1;
    }
    public void throwDice2(Dice dice2){
        this.dice2 = dice2;
    }

    public Player() {
        this.numberOfWinRounds = 0;
        this.numberOfLoseRounds = 0;
    }

    public int getNumberOfWinRounds() {
        return numberOfWinRounds;
    }
    public void resultRounds(Boolean result){
        if(result){
            this.numberOfWinRounds++;
        }
        else {
            this.numberOfLoseRounds++;
        }
        numGames++;
    }

    public void setNumberOfWinRounds(int numberOfWinRounds) {
        this.numberOfWinRounds = numberOfWinRounds;
    }

    public int getNumberOfLoseRounds() {
        return numberOfLoseRounds;
    }

    public void setNumberOfLoseRounds(int numberOfLoseRounds) {
        this.numberOfLoseRounds = numberOfLoseRounds;
    }

    public int getNumGames() {
        return numGames;
    }

    @Override
    public String toString() {
        return "The player: " +
                "The number of games played are " + numGames +
                ", the number of games we won are " + numberOfWinRounds +
                ", the number of games we lose are " + numberOfLoseRounds;
    }




}
