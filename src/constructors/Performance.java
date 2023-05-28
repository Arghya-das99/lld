package constructors;

public class Performance {
    public int marks = 98;
    public double psp = 91.7;


    public Performance() {
        this.marks = 98;
        this.psp = 91.7;
    }

    public Performance(Performance performance) {
        this.marks = performance.marks;
        this.psp = performance.psp;
    }
}