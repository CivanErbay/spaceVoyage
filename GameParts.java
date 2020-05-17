import java.util.Scanner;

public class GameParts {
    public static int getP1() {
        System.out.println("Year 2448:");
        System.out.println("You are the captain of a famous scouting unit, which is responsible for the mapping of new space sectors in the infinite depths of the universe ");
        System.out.println("Right now you are on the way back from a successful mission in the outer rim. You are awaiting a huge reward back at the headquarters of the federal alliance on planet earth. ");
        System.out.println("While on the journey back, one of your officers is asking for your attention. He reports an strange observation in the Arcturues Nebula Section - usually a very calm but very well known place not far from your actual position");
        System.out.println("'Sir, I receive very uncommon signals from this section.. it seems like an entire area has disappeared there.'");
        System.out.println("As the Commander of Royal-Scouts, the most demanded and renowned scouting unit of the federal alliance, it is your actual duty to check these kind of uncertainties, as soon you face them... ");
        System.out.println("On the other hand a huge reward awaits you at the headquarter: the brand new Ship of the Falcon-Class has been released and your superior has promised you the spaceship when you return. ");
        System.out.println("Ship data: Name: 'Millenium Falcon' Health: 500 Power: 200 Speed: 200");
        System.out.println("But keep in mind that it's your duty to check uncertainties..");
        System.out.println("Which direction you choose? You want to check the Arcturus Nebula-Sector (type '1') or keep the course back home and order your officer to keep silent(type '2')?");
        Scanner p1Empty = new Scanner(System.in);
        return p1Empty.nextInt();
    }
    public static int getP1_1() {
        System.out.println("You arrive in Arcturus Nebula and you are still facing the huge gap in the space.. as soon as you get closer your chief-scientist realized that there are strange partikels all around");
        System.out.println("Do you want to take a take a sample and leave this place ('1') or do you want to get deeper in this void? ('2')");
        Scanner p1_1Empty = new Scanner(System.in);
        return p1_1Empty.nextInt();
    }
}
