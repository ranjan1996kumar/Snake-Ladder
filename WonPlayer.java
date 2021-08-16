public class WonPlayer {
    public static void main(String[] args){
        int person1_pos=0 , person2_pos = 0 , flag=0 ;
        int diceNo=0;
        while (person1_pos != 20 && person2_pos!=20) {
            //System.out.println("flag:"+flag);
            diceNo++;
            int diceRoll=1+(int)Math.floor(Math.random() * 10) % 6;
            System.out.println("Dice Rolled:"+diceRoll);

            if(flag == 0) {
                int checkOption=(int)Math.floor(Math.random() * 10) % 3;
                if (checkOption == 0) {
                    System.out.println("No Play");
                }
                else if (checkOption == 1) {
                    flag = 1 ;
                    System.out.println("Ladder Comes");
                    if(person1_pos+diceRoll<=20)
                    {
                        person1_pos+=diceRoll;

                    }
                    else if(person1_pos+diceRoll>20)
                    {
                        continue;
                    }
                }
                else {
                    System.out.println("Snake Comes");
                    if((person1_pos-diceRoll)<0)
                    {
                        person1_pos=0;
                    }
                    else
                    {
                        person1_pos-=diceRoll;
                    }
                }
                System.out.println(diceNo);
                System.out.println("Player person1_position After Dice Roll "+ person1_pos +" "+ person2_pos);
                if(person1_pos==20) {
                    System.out.println("persom one win first");
                }
            }

            else {

                int checkOption=(int)Math.floor(Math.random()*10)%3;
                if (checkOption == 0) {
                    System.out.println("No Play");
                }
                else if (checkOption == 1) {
                    flag = 0;
                    System.out.println("Ladder Comes");
                    if( person2_pos+diceRoll<=20)
                    {
                        person2_pos+=diceRoll;

                    }
                    else if( person2_pos+diceRoll>20)
                    {
                        continue;
                    }
                }
                else {
                    System.out.println("Snake Comes");
                    if(( person2_pos-diceRoll)<0)
                    {
                        person2_pos=0;
                    }
                    else
                    {
                        person2_pos-=diceRoll;
                    }
                }
                System.out.println(diceNo);
                System.out.println("Player Position After Dice Roll "+ person1_pos +" "+ person2_pos);
                if( person2_pos==20) {
                    System.out.println("person two win first");
                }

            }
            if (flag == 0) {
                flag=1;
            }else {
                flag = 0;
            }
        }

        System.out.println("Number Of Dice Roll To Win " + diceNo);

    }

    }
