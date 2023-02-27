package day22;

public class MyCarTest {
    public static void main(String[] args) {
        Calculator cal = new MyCal();
        cal.plus(3, 4);
        int i = cal.exec(5, 6);
        System.out.println(i);

        Calculator.exec2(3, 4);
    }
}
