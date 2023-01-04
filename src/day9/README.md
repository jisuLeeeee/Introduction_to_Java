# 자바입문강의

---

> **파트4. 클래스와 객체**
>
- 객체지향 언어 ⇒ 프로그램을 구성하는 요소는 객체이며 이것이 상호작용 하도록 프로그래밍 한다.
- ****자바는 객체를 만들기 위해 반드시 클래스를 먼저 만들어야 함, 클래스는 객체를 만들기 위한 일종의 틀****

    ```java
    public class CarExam{
    	public static void main(String[] args) {
    			Car c1 = new Car(); // 생성자를 이용해서 메모리에 객체 만듬
    			Car c2 = new Car(); // 메모리에 만들어진 객체 = 인스턴스
    			// c1, c2는 객체를 참조하는 변수
    	}
    }
    ```

- 참조타입 ⇒ 기본형 타입(논리, 문자, 정수, 실수)을 제외한 모든 타입

    ```java
    String str = new String("hello"); 
    // str이 String 인스턴스를 참조, 메모리의 위치값 저장
    ```

- String 클래스 ⇒ 문자열을 표현하는 클래스, new 연산자를 이용하지 않고 인스턴스르 만들 수 있음

    ```java
    String str1 = "hello";
    String str2 = "hello"; 
    // str1과 str2는 같은 인스턴스를 가리킴
    
    String str3 = new String("hello"); 
    String str4 = new String("hello");
    // new연산자를 이용하여 인스턴스를 만들면 인스턴스는 무조건 새롭게 만들어짐
    // str3 과 str4는 서로 다른 인스턴스를 참조
    
    if(str1 == str2){  // 같은 인스턴스를 참조하므로 결과는 true 
            System.out.println("str1과 str2는 같은 레퍼런스입니다.");
    }
    
    if(str1 == str3){  // str1과 str3은 서로 다른 인스턴스를 참조하므로 결과는 false 
            System.out.println("str1과 str3는 같은 레퍼런스입니다.");
    }
    
        if(str3 == str4){  // str3과 str4는 서로 다른 인스턴스를 참조하므로 결과는 false 
            System.out.println("str3과 str4는 같은 레퍼런스입니다.");
    }
    ```

    - String이 인스턴스가 될때 가지고 있던 값을 나중에 수정할 수 없음
    - 메소드를 호출한다 하더라도 String은 내부의 값이 변하지 않음

    ```java
    String str5 = "hello world";
    String str6 = str5.substring(3); // lo world
    ```

- 필드(field) 선언 ⇒ 속성
    - [CarExam.java]에서 [Car.java] 클래스를 객체로 만들고 car 객체의 속성을 참조해서 변수의 값을 저장해봄

- 메소드 ⇒ 입력값(매개변수 or 인자)을 받아서 결과값(리턴값)를 도출, 클래스안에 선언
    - 인자(Argument) : 함수 호추 시 전달되는 값
    - 매개변수(Parameter) : 전달된 인자를 받아들이는 변수
    - [MyClass.java]에 만든 메소드들을 [MyClassExam.java]에서 사용

- String클래스의 메소드
    - .length(), .concat(), .substring() [StringMethodExam.java]
- 변수의 scope와 static [VariableScopeExam.java]
    - static한 메서드(main 메소드같은)에서는 static 하지 않은 필드를 사용할 수 없음
    - static을 사용하면 클래스가 인스턴스화 하지 않아도 사용할 수 있음
    - 클래스 변수는 레퍼런스.변수명 하고 사용하기 보다는 **클래스명.변수명 으로 사용**하는것이 더 바람직
    - static하게 선언된 변수는 값을 저장할 수 있는 공간이 하나만 생성
- 열거형(enum) ⇒ 특정 값만 가져야 한다면 열거형을 사용하는 것이 좋음
    - 열거타입을 이용하여 변수를 선언할 때 변수타입으로 사용할 수 있음