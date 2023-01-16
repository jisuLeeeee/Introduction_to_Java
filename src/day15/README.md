# 자바 입문 강의

---

> 인터페이스와 다른 형식의 클래스
>
- 인터페이스 만들기
    - 인터페이스 ⇒ 서로 관계가 없는 물체들이 상호작용 하기위해서 사용하는 장치나 시스템
    - 객체의 기능들을 정의
    - 추상 메소드와 상수를 정의할 수 있음
    - abstract, fianl 키워드를 사용하지 않아도 컴파일 시 자동으로 변경됨
    - implements 키워드를 사용해서 인터페이스를 구현하는 클래스를 생성
    - 인터페이스가 가지고 있는 메소드를 하나라도 구현하지 않는다면 해당 클래스는 추상 클래스가 되고, 추상클래스는 인스턴스화 할 수 없음

        ```java
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
        ```

    - 참조변수의 타입으로 인터페이스를 사용할 수 있음