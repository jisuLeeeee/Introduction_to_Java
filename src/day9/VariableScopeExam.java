package day9;

public class VariableScopeExam {
    int globalScope = 10;
    static int staticVal = 7;

    public void scopeTest(int value){
        int localScope = 20;

        System.out.println(globalScope);
        System.out.println(localScope);
        System.out.println(value);
    }

    public void scopeTest2(int value2){
        System.out.println(globalScope);
        //System.out.println(localScope); 에러
        //System.out.println(value); 에러
        System.out.println(value2);
    }
    public static void main(String[] args) {

        //System.out.println(globalScope);
        //System.out.println(localScope);
        //System.out.println(value);
        System.out.println(staticVal); // 사용가능

        VariableScopeExam v1 = new VariableScopeExam();
        VariableScopeExam v2 = new VariableScopeExam();

        v1.globalScope = 20;
        v2.globalScope = 30;

        System.out.println(v1.globalScope); // 20
        System.out.println(v2.globalScope); // 30

        v1.staticVal = 10;
        v2.staticVal = 20;

        System.out.println(v1.staticVal);  //20
        System.out.println(v2.staticVal);  //20
        // static 필드는 값을 저장할 수 있는 공간이 1개 뿐, 값을 공유
    }
}
