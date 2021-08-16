public class AfterPos {
    public static void main(String[] args) {
        int position=0;
        int diceRollNo=0;
        while (position != 100) {
            diceRollNo++;
            int diceRoll=1+(int)Math.floor(Math.random()*10)%6;
            System.out.println("Dice Rolled:"+diceRoll);

            int checkOption=(int)Math.floor(Math.random()*10)%3;
            if (checkOption == 0) {
                System.out.println("No Play");
            }
            else if (checkOption == 1) {
                System.out.println("Ladder Comes");
                if(position+diceRoll<=100)
                {
                    position+=diceRoll;
                }
                else if(position+diceRoll>100)
                {
                    continue;
                }
            }
            else {
                System.out.println("Snake Comes");
                if((position-diceRoll)<0)
                {
                    position=0;
                }
                else
                {
                    position-=diceRoll;
                }
            }
            System.out.println(diceRollNo);
            System.out.println("Player Position After Dice Roll "+ position);
        }
        System.out.println("Number Of Dice Roll To Win " + diceRollNo);

    }
}
