package com.green.videoKDT;

public class GreenOnline12_ClassInstance {
    public static void main(String[] args){
        Dog happy=new Dog();//객체 생성
        //Dog 객체를 담기 위한 변수= Dog형(=Class명과 이름이 같아야 함)
        Dog bella=new Dog();//객체를 저장할 수 있는 기억공간 할당

        happy.name="Happy";//객체 안의 name age는 초기화 X
        happy.age=3;

        bella.name="Bella";
        bella.age=2;

        System.out.println("나는 강아지를 두 마리 키웁니다.");
        System.out.println("한 마리는 이름이 "+happy.name+"이고,"+happy.age+"살입니다.");
        System.out.println("한 마리는 이름이 "+bella.name+"이고,"+bella.age+"살입니다.");

    }
}
class Dog{
    String name;
    int age;
}
