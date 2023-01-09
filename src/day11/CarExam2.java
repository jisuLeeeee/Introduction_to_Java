package day11;

public class CarExam2 {
    public static void main(String[] args) {
        // Car c1 = new Car(); // 매개변수를 가진 생성자때문에 오류
        Car c1 = new Car("소방차");
        Car c2 = new Car("구급차");
        System.out.println(c1.name); // 소방차 출력
    }

}
