package day23;

public class ExceptionExam {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        try {
            int k = i / j; // Exception 발생
            System.out.println(k);
        } catch (ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다. " + e.toString());
        }
    }
}
