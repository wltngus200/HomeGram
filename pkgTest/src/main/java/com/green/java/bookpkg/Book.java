package com.green.java.bookpkg;

public class Book {
    private int code;
    private String title;
    private int price;//인스턴스 변수 private로 외부에서 접근 하지 못 함

    public Book(){}//생성자

    public Book(int code, String title, int price){
        this.code=code;
        this.title=title;
        this.price=price;
    }
    public int getCode(){return code;}//외부에서 값을 읽기 위한 메소드
    public String getTitle(){return title;}
    public int getPrice(){return price;}
    public void printBookInfo(){//나의 변수를 출력해주는 역할
        System.out.println("code: "+code);
        System.out.println("title: "+title);
        System.out.println("price: "+price);
    }
}
