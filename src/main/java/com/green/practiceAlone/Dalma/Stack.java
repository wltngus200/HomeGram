package com.green.practiceAlone.Dalma;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    static private List<Card> cards;
    static private List<List<Card>> cardspot;
    static private final int ROW=7;

    static void Stack(){

    }
    void dealer(){
        CardDeck cd=new CardDeck();
        cardspot=new ArrayList<>();
        for(int i=1;i<=ROW;i++){
            cards=new ArrayList<>();
            for(int j=0;j<i;j++) {
                cards.add(cd.drawCard());
            }cardspot.add(cards);
        }
        for(int i=0;i<ROW;i++) {
            for (int j = 0; j<ROW; j++) {
                //마지막 거라면 표시하고 아니라면 X로 대체 if문
            }
        }
    }
}

class StackTest{
    public static void main(String[] args){
        Stack st=new Stack();
        st.dealer();
    }
}




