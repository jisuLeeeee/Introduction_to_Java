package day11;

public class MethodOverloadExam {
    public static void main(String[] args) {
        Myclass2 m = new Myclass2();

        System.out.println(m.plus(4, 5));
        System.out.println(m.plus(4, 6, 7));
        System.out.println(m.plus("hello ", "world"));
    }
}
