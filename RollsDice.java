import java.util.Random;
public class RollsDice{
    public static void main(String[] args) {
            int position=0;
            int diceRoll=1+(int)Math.floor(Math.random()*10)%6;
            System.out.println("Dice Rolled:"+diceRoll);
        }

    }