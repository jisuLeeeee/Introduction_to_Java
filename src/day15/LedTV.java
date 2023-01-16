package day15;

public class LedTV implements TV{ // 인터페이스 TV를 구현하는 클래스
    @Override
    public void turnOn() {
        System.out.println("켜다");
    }

    @Override
    public void turnOff() {
        System.out.println("끄다");
    }

    @Override
    public void changeVolume(int volume) {
        System.out.println("볼륨을 조정하다");
    }

    @Override
    public void changeChannel(int channel) {
        System.out.println("channel을 바꾸다");
    }
}
