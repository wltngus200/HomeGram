package com.green.videoKDT.Quest;

public class Quest05_AnimalTest {
    public static void main(String[] args) {
        Whale w = new Whale();
        w.setName("고래");
        w.setAge(5);
        w.setSwim(true);
        System.out.println("이름 : " + w.getName());
        System.out.println("나이 : " + w.getAge());
        System.out.println("수영여부 : " + w.getSwim());

        System.out.println("----------------");
        //방법 1
        Whale whale=new Whale();
        whale.setName("dolphin");
        whale.setAge(4);
        whale.setSwim(false);
        System.out.printf("이름: %s\n나이: %d\n수영여부: %s\n",
                whale.getName(),whale.getAge(),(whale.getSwim()?"O":"X"));
        System.out.println("----------------");
        //방법 2
        System.out.println(w);
        System.out.println(whale);
    }
}
