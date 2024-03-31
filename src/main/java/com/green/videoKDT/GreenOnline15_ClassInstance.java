package com.green.videoKDT;

public class GreenOnline15_ClassInstance {
    public static void main(String[] args) {//메인 메소드도 static
        Circle c1=new Circle(10.0);
        Circle c2=new Circle(100.0);

        System.out.println("static 변수 PI: "+Circle.PI);//클래스 이름.변수명

        System.out.println("area of c1: "+c1.area());
        System.out.println("perimeter of c1: "+c1.perimeter());
        System.out.println("area of c2: "+c2.area());
        System.out.println("perimeter of c2: "+c2.perimeter());

        //--------------------static 변수 활용--------------------

        Person p1=new Person();
        Person p2=new Person();
        //인스턴스 변수를 그냥 쓸 수 없기 때문에
        Person.printCount();//클래스명.메소드명()
        p1.printCount();//인스턴스명.메소드명()도 가능
        p2.printCount();

        //-------------static은 객체를 생성하지 않고 사용-------------

        Book2 bk=new Book2("JAVA",27000);
        bk.printBook2();
        //bk.price=27000;
        bk.setPrice(27000);
        bk.setTitle("Good JAVA");
        System.out.println("title: "+bk.getTitle());
        System.out.println("price: "+bk.getPrice());
    }
}

class Circle{
    static double PI=3.141592;//하나의 변수 생성->여러 객체에서 공유
    double radius; //반지름

    Circle(double radius){
        this.radius=radius;
    }
    double area(){//넓이
        return this.radius*this.radius*PI;
    }
    double perimeter(){//원주
        return 2*PI*this.radius;
    }
}
class Person{
    static int count;
    String name;
    Person(){
        count++;
    }
    static void printCount(){
        System.out.println("count: "+count);
        //static으로 선언한 메소드 = static 메소드와 변수만 이용가능
        //System.out.println("name: "+name);
        //static은 정적이 아닌 필드를 참조할 수 없다
    }
}
class Book2{
    private String title;//프라이빗이 선언되어 있지만 외부에서도 사용하는 법
    private int price;

    public String getTitle(){//외부에서 볼 수 있는 퍼블릭이라 선언된 메서드를 활용
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }


    Book2(){}
    Book2(String title, int price){
        this.title=title;
        this.price=price;
    }
    void printBook2(){
        System.out.println("title: "+title);//같은 클래스 내부라서 사용 가능
        System.out.println("price: "+price);
    }
}
