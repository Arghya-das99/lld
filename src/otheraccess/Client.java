package otheraccess;

import accesssmodifier.Box;
// if the class declaration in the same package we don't need to import it.
//But here it is in different package, so it should be imported.
public class Client {
    public  static  void main(String[] args){
        Box b1 = new Box();
//        System.out.println(b1.height);
        System.out.println(b1.width);

    }
}
