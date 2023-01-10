package day12;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class AccessObjExam extends AccessObj{
    public static void main(String[] args) {
        AccessObj obj = new AccessObj();
        System.out.println(obj.p);
        System.out.println(obj.p2);//AccessObj가 만약 다른 패키지면 접근 가능(But, 상속받지 않으면 접근 불가능)
        System.out.println(obj.k); //AccessObj가 만약 다른 패키지면 접근 불가능
        //System.out.println(obj.i); //private
    }

}
