package com.green.practiceAlone.Dalma;

import java.util.List;

public class Card {
    private final String shape;
    private final String number;
    private final boolean color;//t=black f=red

    //카드가 가지는 속성들 모양 색 번호 각각의 객체마다 고유한 성질을 가진다.
    Card(String shape, String number, boolean color) {
        this.shape = shape;
        this.number = number;
        this.color = color;
        //초기화를 하면서 속성들에 어떠한 값을 넣을 지 정할 수 있다
        //>>카드덱 클래스(파일)
    }
    public String getShape(){
        return this.shape;
    }
    public String getNumber(){
        return this.number;
    }
    public boolean getColor(){
        return this.color;
    }


    public int checknum(){
        return switch(this.number){
            case "A"->1;
            case "K"->13;
            case "Q"->12;
            case "J"->11;
            default->Integer.parseInt(number);
        };
    }

    @Override
    public String toString() {
        return String.format("(%s) %s %s", (color ? "black" : "red"), shape, number);
    }//카드라는 객체를 출력할 때 이렇게 보여달라.
}
class CardTest{
    public static void main(String[] args){
        Card card=new Card("Clover","A",true);
        System.out.println(card);
    }
}