import java.util.Random;

public class Dice {
    private int value;

    public Dice() {
        throwDice();
    }

    public int getValue() {
        return value;
    }

    public void throwDice() {
        this.value = new Random().nextInt(6) + 1;
    }
}
