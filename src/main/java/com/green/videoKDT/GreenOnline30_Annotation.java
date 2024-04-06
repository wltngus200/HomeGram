package com.green.videoKDT;

public class GreenOnline30_Annotation {
    public static void main(String[] args) {
        Test2 t=new Test2("hello");
        System.out.println(t.getMsg());

        C c=new C();
        c.show();
        c.show(100);
    }
}
class p{
    void show(){
        System.out.println("I am parent show");
    }
    void show(int data){
        System.out.println("I am parent show=data: "+data);
    }
}

class C extends p{
    @Override
    void show(int data){
        System.out.println("I am child show=data: "+data);
    }
}

class Test2{
    private String msg;
    Test2(String m){
        msg=m;

    }

    @Deprecated//getMsg를 더이상 쓰지 않겠다
    String getMsg(){
        return msg;
    }
}
