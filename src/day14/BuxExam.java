package day14;

public class BuxExam {
    public static void main(String[] args) {
        //Bus bus = new Bus();
        //bus.run();

        Car c = new Bus();
        c.run();

        Bus bus = (Bus)c;
        bus.run(); // ppangppang() 호출
    }
}
