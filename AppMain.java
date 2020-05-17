import java.util.Scanner;

public class AppMain {

    public static void main(String[] args) {

        //Ships "created"
        GameMethods.makeShips();
        //Ship Presentation
        GameMethods.shipShow();

        //User SpaceShip decision
        System.out.println("Type 1 (Ace) or 2 (Bull) or 3 (Guerilla)");
        Scanner in = new Scanner(System.in);
        int shipIndex = in.nextInt();

        //Assignment of the Ship
        SpaceShip myShip = GameMethods.pickShip(shipIndex-1);
        System.out.println(myShip);

        //Journey-P1-D1
        int p1 = GameParts.getP1();
        System.out.println(p1 == 1 ? "Your ship the " + myShip.name + " changes the direction to Arcturus Nebula.": "Your ship the " + myShip.name + "continues to go home."
        );

        if (p1 == 1) {
            //Journey-P1.1 - Arcturus
            int p1_1 = GameParts.getP1_1();

            if(p1_1 == 1) {
                System.out.println("The Scientific Department of your Crew takes a sample and start with the investigation. Meanwhile the chief-scientist demands from you to wait for the first results before going back home again. It could be substance which is harmful for the earth population.");
            }
            if(p1_1 == 2) {
                System.out.println("You can deeper into the void and suddenly a foreign ship appears of your radars. It seems to be a mercenary ship which is in search of something valuable.");
                System.out.println("As soon as you get closer.. it suddenly opens fire");
                boolean fightResult = GameMethods.isWinFight(myShip, GameMethods.mandalorian);
                System.out.println(fightResult ? "You won the battle successfully" : "You lost the battle");
                boolean isAlive = fightResult;
                if (isAlive) {
                    System.out.println("You survived this battle and can continue your journey");
                }
                else {
                    System.out.println("Your journey ends tragically..");
                }
            }
        }

        if (p1 == 2) {
            //Journey-P1.2 - Beta
            System.out.println("While heading home, your officer is concerned about the command to keep silent");
        }
        //Fight
       /* boolean fightResult = GameMethods.isWinFight(myShip,GameMethods.enemyShip);
        System.out.println(fightResult ? "You won the battle successfully" : "You lost the battle");*/


    }




}


