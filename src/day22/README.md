---

- 인터페이스의 default 메소드
    - Java 8의 등장으로 인터페이스가 default 키워드로 선언되면 메소드가 구현될 수 있음
        - 이를 구현하는 클래스는 default 메소드 오버라이딩 가능
        - 인터페이스가 변경이 되면 인터페이스를 구현하는 모든 클래스들이 해당 메소드를 구현해야하는데 이러한 문제 해결을 위해 인터페이스에 메소드를 구현해 놓을 수 있도록 함

        ```java
        public interface Calculator {
                public int plus(int i, int j);
                default int exec(int i, int j){      //default로 선언함으로 메소드를 구현할 수 있다.
                    return i + j;
                }
            }
        
        //Calculator인터페이스를 구현한 MyCalculator클래스
            public class MyCalculator implements Calculator {
        
                @Override
                public int plus(int i, int j) {
                    return i + j;
                }
            }
        
        public class MyCalculatorExam {
                public static void main(String[] args){
                    Calculator cal = new MyCalculator();
                    int value = cal.exec(5, 10);
                    System.out.println(value); // 15
                }
            }
        ```


- 내부클래스 ⇒ 클래스 안에 선언된 클래스
    1. 클래스 안 필드를 선언하는 위치에 선언되는 경우 중첩클래스 혹은 인스턴스 클래스라고 함

    ```java
    public class InnerExam1{
            class Cal{
                int value = 0;
                public void plus(){
                    value++;
                }
            }
    
            public static void main(String args[]){
                InnerExam1 t = new InnerExam1();
                **InnerExam1.Cal cal = t.new Cal();**
                cal.plus();
                System.out.println(cal.value); // 1
    
            }
        }
    ```

    1. 내부 클래스가 static으로 정의된 경우 정적 중첩 클래스 또는 static 클래스라고 함

    ```java
    public class InnerExam2 {
        static class Cal{
            int value = 0;
            public void plus(){
                value++;
            }
        }
    
        public static void main(String[] args) {
            InnerExam2.Cal cal = new InnerExam2.Cal();
            cal.plus();
            System.out.println(cal.value);
        }
    }
    ```

    1. 메소드 안에 클래스를 선언한 경우 지역 중첩 클래스 또는 지역 클래스라고 함

    ```java
    public class InnerExam3 {
        public void exec(){
            class Cal{
                int value = 0;
                public void plus(){
                    value++;
                }
            }
            Cal cal = new Cal();
            cal.plus();
            System.out.println(cal.value);
        }
        public static void main(String[] args) {
            InnerExam3 t = new InnerExam3();
            t.exec();
        }
    }
    ```

    1. 익명클래스
    - 익명클래스를 만드는 이유는 Action을 상속받는 클래스를 만들 필요가 없을 경우 즉, 다른 클래스에서 Action을 상속받는 클래스가 사용되지 않는 경우

    ```java
    public abstract class Action{ // 추상클래스
            public abstract void exec();
        }
    
    public class ActionExam{
            public static void main(String args[]){
                // 추상클래스 Aciton을 구현한 MyAction 클래스가 있는 경우
    	    //Action action = new MyAction();
                //action.exec();
    	
                //MyAction을 사용하지 않고 Action을 상속받는 익명클래스를 만듬
                Action action = new Action(){ // action은 참조변수
                    public void exec(){
                        System.out.println("exec");
                    }
                };
                action.exec();
            }
        }
    ```