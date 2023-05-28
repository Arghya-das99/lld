package constructors;

public class Student {
    String name;
    private int id;
    private int totalProblemSolved;

    Performance performance;



    // Parametrized constructor
    Student(String name, int id, int totalProblemSolved,Performance performance){
        this.name = name;
        this.id = id;
        this.totalProblemSolved = totalProblemSolved;
        this.performance = performance;
    }

    // Copy Constructor
    Student(Student other){
        this.name = other.name;
        this.id = other.id;
        this.totalProblemSolved = other.totalProblemSolved;
        // For shallow copy --> this.performance = other.performance

        //for deep copy --> this.Performance = new Performance(other.performance)
        this.performance = new Performance(other.performance);
    }
}
