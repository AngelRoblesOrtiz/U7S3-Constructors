package partB;

public class Constructor {
    String name;

    public Constructor() {
        System.out.println("The constructor is being called:");
        name = "Angel";
    }


    public static void main(String[] args) {
        Constructor item = new Constructor();
        System.out.println("The name is " + item.name);
    }
}
