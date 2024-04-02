package com.green.java.userbookpkg;

public class UseBook {
    public static void main(String[] args) {
        com.green.java.bookpkg.Book bk = new com.green.java.bookpkg.Book(101, "JAVA", 25000);//북이라는 자료형을 이해할 수 없다(다른 패키지의 클래스)
        bk.printBookInfo();
    }
}
