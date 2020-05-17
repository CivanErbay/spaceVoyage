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

        //Journey-P1
        int p1 = GameParts.getP1();
        System.out.println(p1 == 1 ? "Your ship the " + myShip.name + " changes the direction to Arcturus Nebula.": "Your ship the " + myShip.name + "continues to go home."
        );

        if (p1 == 1) {
            //Journey-P1.1 - Arcturus
            int p1_1 = GameParts.getP1_1();

            if(p1_1 == 1) {
                GameParts.p1_1();
            }
            if(p1_1 == 2) {
                boolean isAlive = GameParts.p1_1_1(myShip);
                if (isAlive) {
                    GameParts.p1_1_1_1(myShip);
                }
                else {
                    System.out.println("Your journey ends tragically..");
                    System.out.println("Game Over");
                }
            }
        }

        if (p1 == 2) {
            //Journey-P1.2 Planet Earth
            System.out.println("While heading home, your officer is concerned about the command to keep silent");

        }
        //Fight
       /* boolean fightResult = GameMethods.isWinFight(myShip,GameMethods.enemyShip);
        System.out.println(fightResult ? "You won the battle successfully" : "You lost the battle");*/


    }




}


