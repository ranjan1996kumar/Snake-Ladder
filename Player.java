import java.util.Random;
public class Player {
    public static void main(String[] args) {
            int position=0;
            int diceRoll=1+(int)Math.floor(Math.random()*10)%6;
            System.out.println("Dice Rolled:"+diceRoll);
            int checkOption=(int)Math.floor(Math.random()*10)%3;
            if (checkOption == 0) {
                System.out.println("No Play");
            }
            else if (checkOption == 1) {
                System.out.println("Ladder Comes");
                position+=diceRoll;
            }
            else {
                System.out.println("Snake Comes");
                position-=diceRoll;
            }

        }


    }