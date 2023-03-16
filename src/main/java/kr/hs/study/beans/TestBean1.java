package kr.hs.study.beans;

public class TestBean1 {
    TestBean1(){
        System.out.println("TestBean1의 기본생성자");
    }
    public void init_method() {     //생성자 실행 후에 자동으로 호출되어 실행
        System.out.println("TestBean1의 init method");
    }
    public void destroy_method(){   //객체가 소멸일때 자동으로 호출
        System.out.println("TestBean1의 destroy method");
    }

}
