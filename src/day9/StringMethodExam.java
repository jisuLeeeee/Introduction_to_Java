package day9;

public class StringMethodExam {
    public static void main(String[] args) {
        //String str = new String("hello");
        String str = "hello";

        System.out.println(str.length()); // str이 참조하는 문자열의 길이를 구해서 int 타입으로 리턴

        System.out.println(str.concat(" world")); // 문자열과 문자열을 결합해주는 메소드,
        System.out.println(str); // 기존의 값 hello 출력
        str = str.concat(" world"); // 기존의 str 변수가 참조하는 객체를 hello -> hello world로 바꿈
        System.out.println(str); // hello world 출력

        System.out.println(str.substring(3));
    }
}
