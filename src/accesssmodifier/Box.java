package accesssmodifier;

public class Box {

    static void printMe(){
        System.out.println("Hi I am a box.");
    }
    public int width = 1;

    // private access modifier helps to access only in the class
    private int age = 10;

    // No access modifier -> default -> Package private means
    // only use in package
    int height = 2;
    public int breadth = 3;

    int getAge(){
        return age;
    }

}
