package partA;

public class PlayerTest {
    public static void setFields(Player player, String name, String height, int years) {
        player.name = name;
        player.height = height;
        player.years = years;
    }

    public static void main(String[] args) {
        Player player = new Player("LeBron James", "6'9", 22);
        System.out.println("The GOAT " + player.name + " standing at " + player.height + ", been doin it for " + player.years + " years!");
        player.think();
        System.out.println();

        setFields(player, "Michael Jordan", "6'6", 15);
        System.out.println("Player name: " + player.name);
        System.out.println("Player height: " + player.height);
        System.out.println("Player years in the league: " + player.years);
    }
}
