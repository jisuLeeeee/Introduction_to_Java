package day9;

public class MyClassExam {
    public static void main(String[] args) {
        MyClass myclass = new MyClass();

        myclass.Method1();   //MyClass에서 정의해 놓은 메소드 Method1() 를 호출한다.

        myclass.Method2(10);

        int value = myclass.Method3();
        System.out.println("Method3 이 리턴한 " + value + " 입니다.");

        myclass.Method4(10, 100);
        int value2 = myclass.Method5(55);
        System.out.println("M5가 리턴한 값 : " + value2);
    }
}
