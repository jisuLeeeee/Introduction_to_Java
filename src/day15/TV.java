package day15;

public interface TV {
    public int MIN_VOLUME = 0; // 상수 정의
    public int MAX_VOLUME = 100;

    public void turnOn(); // 추상 메소드 정의
    public void turnOff();
    public void changeVolume(int volume);
    public void changeChannel(int channel);

}
