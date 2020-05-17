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
        System.out.println("Year 2448:");
        System.out.println("You are the captain of a famous scouting unit, which is responsible for the mapping of new space sectors in the infinite depths of the universe ");
        System.out.println("You and your crew enter " + myShip.name);
        System.out.println("After starting the engine your navigator asks for the direction: ");
        System.out.println("My captain: In which space system you want to jump? Arcturus Nebula('1') or Beta Astoria('2')?");
        Scanner p1Empty = new Scanner(System.in);
        int p1 = p1Empty.nextInt();
        System.out.println(p1 == 1 ? "Your ship the " + myShip.name + "jumps to Arcturus Nebula.": "Your ship the " + myShip.name + "jumps to Beta Astoria."
        );

        //Journey-P1.1 - Arcturus
        System.out.println("You and your crew arrived savely in Arcturus Nebula");
        System.out.println("");
        //Journey-P1.2 - Beta

        //Fight
       /* boolean fightResult = GameMethods.isWinFight(myShip,GameMethods.enemyShip);
        System.out.println(fightResult ? "You won the battle successfully" : "You lost the battle");*/


    }

}


