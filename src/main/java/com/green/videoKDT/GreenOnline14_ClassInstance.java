package com.green.videoKDT;

public class GreenOnline14_ClassInstance {
    public static void main(String[] args){
        Data d1=new Data();
        Data d2=new Data();

        d1.print();
        d2.print();

    //-----------data 메소드 관련--------------

        Book b1=new Book("피터팬",10000);
        Book b2=new Book("알라딘",15000);//인수

        System.out.println(b1.title+", "+b1.price);
        System.out.println(b2.title+", "+b2.price);

    //-----------this.xxx(변수) 관련--------------

    }
}
class Data{
    int value;//인스턴스 변수
    static int count;//클래스 변수
    void print(){
        System.out.println("value: "+value++);//0 0 객체마다 초기화+출력 후 +1
        System.out.println("count: "+count++);//0 1 모든 객체가 공유하는 함수
    }
        }
class Book{
    String title;
    int price;//인스턴스 변수 b1,2의 괄호안 인수를 받음

    Book(String title, int price){//괄호 안=매개변수
        this.title=title;
        this.price=price;
    //인스턴스 변수   매개변수
        //두가지가 동일하기 때문에 구분하기 위해 this를 붙인다 p.295
    }
}
class novel{
    String title;
    int price;
    novel(){};//생성자 1
    novel(String title){//생성자 2
        this.title=title;
    }
    novel(String title, int price){//생성자 3
        this.title=title;//생성자 2와 겹침
        // → this(title)로 변경 단, 첫 줄 1회만 가능
        this.price=price;
    }
}
