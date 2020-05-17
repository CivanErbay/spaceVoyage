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
        System.out.println("You and your crew enter " + myShip.name);
        System.out.println("After starting the engine your navigator asks for the direction: ");
        System.out.println("My captain: In which space system you want to jump? Arcturus Nebula or Beta Astoria?");

        //Fight
       /* boolean fightResult = GameMethods.isWinFight(myShip,GameMethods.enemyShip);
        System.out.println(fightResult ? "You won the battle successfully" : "You lost the battle");*/


    }

}


