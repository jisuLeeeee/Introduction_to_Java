---

> **파트9.** **예외처리**
>
- **Exception** ⇒ 프로그램 실행 중 예기치 못한 사건을 예외라고 함
    - Java에서는 정수를 0으로 나눌 때 예외를 발생시킴

    ```java
    public class ExceptionExam {
        public static void main(String[] args) {
            int i = 10;
            int j = 0; 
            int k = i / j; // Exception 발생
            System.out.println(k);
        }
    }
    ```

    - **try-catch-finally**

    ```java
    public class ExceptionExam {
        public static void main(String[] args) {
            int i = 10;
            int j = 0;
            try{
                // 수행할 코드
    		int k = i / j; // 예외 발생 가능성이 있는 블록
    		System.out.println(k);
            } catch(ArithmeticException e){ // 예외클래스 변수명
                // 예외 처리 블록
                // 발생한 예외와 선언한 예외가 적합해야 실행
                // 예외클래스 변수명.toString() => 예외의 정보를 알려주는 메소드

                System.out.println("0으로 나눌 수 없습니다. " + e.toString());
                // 0으로 나눌 수 없습니다. java.lang.ArithmeticException: / by zero
            } finally{
                // 예외 발생 여부 상관없이 반드시 실행되는 블록
    			// 생략 가능
            }
        }
    }
    ```

    - 예외클래스 Exception ⇒ 모든 오류를 처리하는 예외클래스

- **Throws** ⇒ 예외가 발생했을 때 예외를 호출한 쪽에서 처리하도록 던져줌

    ```java
    public class ExceptionExam2 {
        public static void main(String[] args) {
            int i = 10;
            int j = 0;
            try {
                int k = divide(i, j);
                System.out.println(k);
            } catch (ArithmeticException e){
                System.out.println(e.toString());
            }
        }
        public static int divide (int i, int j) **throws ArithmeticException**{
            int k = i / j;
            return k;
        }
    }
    ```

- Exception 발생시키기 ⇒ 강제로 오류를 발생시키는 **throw**

    ```java
    public class ExceptionExam3 {
        public static void main(String[] args) {
            int i = 10;
            int j = 0;
            try {
                int k = divide(i, j);
                System.out.println(k);
            } catch (IllegalArgumentException e){ // 예외가 발생한 함수를 호출한 쪽에서 처리
                System.out.println(e.toString());
            }
    
        }
        public static int divide (int i, int j) throws IllegalArgumentException{
            if(j == 0){ // 2번째 매개변수가 0이면 안될 경우
                // System.out.println("2번째 매개변수는 0이면 안됩니다.")
                // return 0; => 결과 0이 출력되는데 이는 올바른 결과가 아님

                // new 연산자를 통하여 예외 클래스 객체 만들어서 예외 발생을 의미
                throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
            }
            int k = i / j;
            return k;
        }
    }
    ```


- **사용자 정의 Exception**
    - Exception 클래스를 상속 받아 정의한 checked Exception
        - 반드시 오류를 처리 해야만 하는 Exception
        - 예외 처리하지 않으면 컴파일 오류를 발생

    - RuntimeException 클래스를 상속 받아 정의한 unChecked Exception
        - 예외 처리하지 않아도 컴파일 시에는 오류를 발생시키지 않는다.

        ```java
        // RuntimeException을 상속받은 BizException객체
        public class BizException extends RuntimeException{
            public BizException(String msg){
                // 문자열로된 오류 메시지
                super(msg); // 부모 생성자 호출
            }
            public BizException(Exception ex){
                // 실제 발생할 예외
                super(ex); // 부모 생성자 호출
            }
        }
        
        // 업무를 처리하는 메소드를 가지고 있다고 가정
        public class BizService {
            public void bizMethod(int i) throws BizException{
                System.out.println("비즈니스 메소드 시작");
        
                if(i < 0)
                    throw new BizException("매개변수 i는 0 이상이어야 합니다.");
        
                System.out.println("비즈니스 메소드 종료");
            }
        }
        
        // BizService를 이용하는 BizExam클래스
        public class BizExam {
            public static void main(String[] args) {
                BizService biz = new BizService();
                biz.bizMethod(5);
                try{
                    biz.bizMethod(-3);
                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }
        }
        
        // 실행결과 
        /*비즈니스 메소드 시작
        비즈니스 메소드 종료
        비즈니스 메소드 시작
        day23.BizException: 매개변수 i는 0 이상이어야 합니다.
        	at day23.BizService.bizMethod(BizService.java:8)
        	at day23.BizExam.main(BizExam.java:8)*/
        ```


> ************************************파트10. 연습문제************************************
>
- 약수의 합
    - 자연수 n을 입력받아 n의 약수를 모두 더한 값을 리턴

    ```java
    class Solution {
      public int solution(int n){
          int answer = 0;
          
          for(int i=1; i<=n; i++){
              if(n % i == 0)
                  answer += i;
          }
          return answer;
      }
    }
    ```