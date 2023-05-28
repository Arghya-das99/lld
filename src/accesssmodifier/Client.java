package accesssmodifier;

public class Client {
    public static void main(String[] args){



        Box b1 = new Box();

        Box.printMe();
        System.out.println(b1.height);
        System.out.println(b1.getAge());

    }
}
