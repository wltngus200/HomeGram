package com.green.videoKDT;

import java.util.concurrent.ThreadPoolExecutor;

public class GreenOnline29_Thread {
    public static void main(String[] args) {
        /*Thread th=new ChildThread();
        th.start();
        int i=1;
        do{
            System.out.print("*");
            i++;
        }while (th.isAlive());
        //별의 개수는 만든 스레드가 일을 얼마나 빨리 끝내냐에 따라 달림
        //메인으로 끝난다=별이 마지막에 찍힌다*/

        //2번째
        Thread th = new ChildThread2();
        th.start();
        for (int i = 1; i <= 26; i++) {
            System.out.print(i);
            try {
                th.join();//내가 만든 스레드가 끝나길 기다림/끝나야 시작
            } catch (InterruptedException ex) {
                System.out.println("main thread interrupted");//join문 예외처리
            }

        }System.out.println("main thread ending");//메인 스레드가 늦게 끝남 ending이 마지막
    }
}//클래스는 역순
class ChildThread2 extends Thread{
    public void run(){
        for(char ch='A';ch<='Z';ch++){
            System.out.print(ch);
        }
    }
}

class ChildThread extends Thread{
    public void run(){//첫번째
        for(char ch='A';ch<='Z';ch++){
            System.out.print(ch);
        }
    }
}