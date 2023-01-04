package day9;

public class MyClass {
    public void Method1(){
        System.out.println("Method1이 실행됩니다.");
    }

    public void Method2(int x){ // 정수를 받아들임
        System.out.println(x + "를 이용한 m2 실행");
    }

    public int Method3(){ // 정수를 리턴
        System.out.println("Method3이 실행됩니다.");
        return 10;
    }

    public void Method4(int x, int y){ // 리턴 x, 정수 2개 받아들임
        System.out.println(x + y + " Method4이 실행됩니다.");
    }

    public int Method5(int x){ // 정수값 리턴, 정수 1개 받아들임
        System.out.println(x + "Method5이 실행됩니다.");
        return x;
    }
}
