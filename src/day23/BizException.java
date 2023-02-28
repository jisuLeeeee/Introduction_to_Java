package day23;

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
