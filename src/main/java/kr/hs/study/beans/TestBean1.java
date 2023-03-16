package kr.hs.study.beans;

public class TestBean1 {
    TestBean1(){
        System.out.println("TestBean1의 기본생성자");
    }
    public void init_method() {
        System.out.println("TestBean1의 init method");
    }
    public void destroy_method(){
        System.out.println("TestBean1의 destroy method");
    }

}
