package com.green.videoKDT;

public class GreenOnline19_abstract {
    public static void main(String[] args){
        Child1 ren=new Child1();//객체생성
        ren.show();//부모의 일반 메소드
        ren.call();
        ren.print();
    }
}
class Child1 extends Parent {//parent의 메서드를 재정의하라고 빨간줄
    void call(){
        System.out.println("I'm child1 call");
    }
    void print(){
        System.out.println("I'm child print");
    }
}
abstract class Parent{//객체생성 불가
    void show(){
        System.out.println("I'm parent show");
    }
    abstract void call();//추상 메서드

}
