package com.green.videoKDT;

public class GreenOnline24_Exception {
    public static void main(String[] args) {
        /*
        int a=5, b=0, c;
        c=a/b;
        System.out.println("c: "+c);
        java.lang.ArithmeticException 오류
         */

        int a = 5, b = 0, c;
        try {
            c = a / b;
            System.out.println("c: " + c);
        } catch (ArithmeticException e) {//e 변수이름 아무거나 상관 없으나 대체로 e를 씀
            System.out.println("0으로 나눌 수 없습니다.");
        }

        /*
        int[] n={1,3,5,6,10};
        for(int i=0;i<=5;i++){
            System.out.printf("n[%d]=%d\n",i,n[i]);
        java.lang.ArrayIndexOutOfBoundsException
        }*/
        int i = 0;
        int[] n = {1, 3, 5, 6, 10};
        try {
            for (i = 0; i <= 5; i++) {
                System.out.printf("n[%d]=%d\n", i, n[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            //System.out.println(i + "는 없는 인덱스입니다.");
            System.out.println(e.getMessage());
            //e.printStackTrace();
        } catch (Exception e) {
            System.out.println("오류가 발생하였습니다");//오류의 최상위 클래스 하단에 위치
        }

        MyException me = new MyException(10);
        try {
            System.out.println("before throw MyException");
            throw me;
        } catch (MyException e){System.out.println(e);}
        System.out.println("main ENDs");
    }
}
class MyException extends Exception{
    int x;
    MyException(int x){this.x=x;}
    public String toString(){
        return "I am " + x +" in MyException class";
    }
}