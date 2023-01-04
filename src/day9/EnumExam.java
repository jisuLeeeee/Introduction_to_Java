package day9;

public class EnumExam {
    public static final String MALE="MALE";
    public static final String FEMALE="FEMALE";
    public static void main(String[] args) {
        String gender1;
        gender1 = EnumExam.MALE;
        gender1 = EnumExam.FEMALE;

        gender1 = "boy";// gender1의 type이 String 이기 때문에 문제X
        //실행할 때 원했던 MALE,FEMALE 이 아닌 다른 값이 들어와서 문제 발생

        Gender gender2;
        gender2 = Gender.MALE;
        gender2 = Gender.FEMALE;

        //gender2 = "boy;" // 에러
    }
}
enum Gender{
    MALE, FEMALE; //MALE이나 FEMALE만 대입이 가능, 다른 값은 저장할 수가 없음
}