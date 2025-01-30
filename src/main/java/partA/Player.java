package partA;

public class Player {

    //Fields
    public String name;
    public String height;
    public int years;

    //Constructor
    public Player(String name, String height, int years) {
        this.name = name;
        this.height = height;
        this.years = years;
    }

    //Methods
    public void think(){
        System.out.println("I'll have my win.");
    }
}
