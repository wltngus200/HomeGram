package com.green.practiceAlone.Dalma;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    String[] shape={"Heart","Diamond","Spade","Clover"};
    boolean color=false;// 카드객체와 중복. 어느 값이 들어갔는지 모르겠지만 둘 중 어느 쪽을 지워도 에러.
    private List<Card> cards;//카드라는 객체를 담는 리스트 생성 카드를 여러개 담는 것이 카드덱의 속성

    public CardDeck(){
        cards=new ArrayList<>();//선언해줘야 한다
        for(int i=0;i<shape.length;i++){
            for(int j=1;j<=13;j++){
                String numberStr=switch(j){
                    case 1->"A";
                    case 11->"J";
                    case 12->"Q";
                    case 13->"K";
                    default->String.valueOf(j);
                };if(shape[i]=="Spade"||shape[i]=="Clover"){color=true;};
                Card card=new Card(shape[i],numberStr,color);//for문 스코프 안에서만 살아있는 카드 객체
                cards.add(card);//그 값을 카드덱 cards에 저장 //cards는 카드덱 바깥에 있어서 살아남은
            }
        }
    }
    void showCards(){
        for(Card c:cards)
        System.out.println(c);
    }
    void suffle(){
        for(int i=0;i<cards.size();i++){
        int random=(int)(Math.random()*cards.size());
        Card tmp=cards.get(random);
        cards.remove(cards.get(random));
        cards.add(tmp);//발상은 좋았으나 골고루 섞이지 않음
        //cards.get(i)=tmp 는 빨간줄 왜???
        }
    }
}
class CardDeckTest{
    public static void main(String[] args){
    CardDeck cd=new CardDeck();
    //cd.showCards();
    cd.suffle();
    System.out.println("-----------------------");
    cd.showCards();
    }
}
