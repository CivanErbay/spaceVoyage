import java.util.ArrayList;
import java.util.List;

public class GameMethods {

    public static List<SpaceShip> spaceShips = new ArrayList<>();
    public static SpaceShip tie = new SpaceShip("Tie",200, 100, 100);
    public static SpaceShip bowser = new SpaceShip( "Bowser", 300, 100, 100);
    public static SpaceShip mandalorian = new SpaceShip( "Mandalorian", 200, 200, 100);
    public static SpaceShip vader = new SpaceShip( "Vader", 300, 300, 100);
    public static SpaceShip falcon = new SpaceShip("Millenium", 300, 350, 200 );

    public static void makeShips() {
        spaceShips.add(new SpaceShip("Ace",250, 150,100));
        spaceShips.add(new SpaceShip("Bull",300, 100, 100));
        spaceShips.add(new SpaceShip("Guerilla", 250, 100, 200));

    }


    public static SpaceShip pickShip(int index) {
        return spaceShips.get(index);
    }

    public static void shipShow () {
        System.out.println("Far, far away in another galaxy, there was a spaceship captain and his crew facing an uncertain future... ");
        System.out.println("Oh Captain, my Captain.. Which ship do you pick for your journey? - Choose wisely");
        for (SpaceShip ship : spaceShips) {
        System.out.print("Name: " + ship.name + " ");
        System.out.print("Armor: "+ ship.health + " ");
        System.out.print("Power "+ ship.power + " ");
        System.out.println("Speed " + ship.speed + " ");
        }
    }


    public static boolean isWinFight (SpaceShip myShip, SpaceShip enemyShip) {
//yShip.health > 0 ||
        boolean isWin = false;
        int count = 1;
        while (enemyShip.health > 0) {
            int myAttack = (int) ( myShip.power*Math.random());
            int enemyAttack = (int) (enemyShip.power*Math.random());
            enemyShip.health = enemyShip.health - myAttack;
            myShip.health = myShip.health - enemyAttack;
            System.out.println("Runde: " + count);
            System.out.println("Your plasma cannons fire and deal" + myAttack + " damage");
            System.out.println("Your enemy has " + enemyShip.health +" HP left");
            System.out.println("The enemy opens fire and deals "+ enemyAttack + " damage");
            System.out.println("Your ship has " + myShip.health +" HP left");
            if (myShip.health < 0)
            {
                isWin = false ;
                break;
            }
            if
            (enemyShip.health < 0)
            {
                isWin = true;
                break;
            }
            count++;
            }
        return isWin;
    };




}
