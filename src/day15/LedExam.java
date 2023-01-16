package day15;

public class LedExam {
    public static void main(String[] args) {
        TV tv = new LedTV(); // 참조변수 타입으로 인터페이스 사용 가능
        tv.turnOn();
        tv.changeChannel(8);
        tv.changeVolume(39);
        tv.turnOff();
    }

}
