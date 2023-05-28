package constructors;

public class Main {
    public static void main(String[] args){

        Performance p1 = new Performance();
        Student s1 = new Student("Arghya",10, 100,p1);
        Student s2 = new Student(s1);

//        System.out.println(s2.name);
        System.out.println(s1.performance.marks);

        s2.performance.marks = 100;

        System.out.println(s1.performance.marks);


    }
}
