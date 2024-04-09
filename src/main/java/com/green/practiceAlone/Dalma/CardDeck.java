package com.green.practiceAlone.Dalma;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    protected List<Card> cards;
    String[] shape={"Heart","Diamond","Spade","Clover"};
    boolean color=false;
    public CardDeck(){
        cards=new ArrayList();
        for(int i=0;i<shape.length;i++){
            for(int j=1;j<=13;j++){
                String numberStr=switch(j){
                    case 1->"A";
                    case 11->"J";
                    case 12->"Q";
                    case 13->"K";
                    default->String.valueOf(j);
                };if(shape[i]=="Spade"||shape[i]=="Clover"){color=true;};
                Card card=new Card(shape[i],numberStr,color);
                cards.add(card);
            }//카드 출력에서 막힘
        }
    }
}
class CardDeckTest{
    public static void main(String[] args){
    CardDeck cd=new CardDeck();
    System.out.println(cd);
    }
}
