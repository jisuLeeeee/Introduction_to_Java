package day12;

public class DuckExam {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.sing(); // "꽥꽥"
        duck.fly(); // "날다"

        // Bird b = new Bird(); // 추상 클래스는 객체를 생성할 수 없음
    }
}
