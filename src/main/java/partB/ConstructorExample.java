package partB;

public class ConstructorExample { //creates parent class
    int x = 2; //creates int x equal to 2

    public  ConstructorExample() { //a constructor that only makes x equal 5
        x = 5;
    }

    public static void main(String[] args) { //creates main class
       ConstructorExample myClass = new  ConstructorExample(); //instantiates a object
        System.out.println(myClass.x); //prints out the value x from the object
    } //closes main class
} //closes parent class
