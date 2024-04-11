package com.green.practiceAlone.Dalma;

import java.util.ArrayList;
import java.util.List;

public class KindCard {
    List<Card> onekind=new ArrayList<>();
    final int DEFUALT_NUM =0;

    public void atok(Card card){
        Card c=card;

        if(onekind.size()+1==c.checknum()){//카드가 가진 숫자가 길이보다 1크면=순서가 맞으면
            if(onekind.size()== DEFUALT_NUM){//아무것도 없다면
                onekind.add(c);//이 때 추가되는 건 A
                System.out.println(onekind);
            } else if(c.getShape().equals(onekind.get(DEFUALT_NUM).getShape())){//카드가 가진 무늬가 이미 놓인 카드와 같으면
                onekind.add(c);
                System.out.println(onekind);
            }
        } else {
            System.out.println("잘못된 카드입니다.");
        }
    }//new ArrayList로 A값밖에 넣을 수 없는 문제 수정
    //0이라는 수를 디폴트 넘버라는 변수로 초기화 해 리터럴을 쓰지 않음
    //첫 값으로 2를 넣는 시도를 할 때, 리스트의 크기는 0인데 앞의 것과 같은 것을 갖고 있는지 물어봄.
    void showCard(){
        for(Card c:onekind){
            System.out.println(c);
        }
    }
}
class KindCardTest{
    public static void main(String[] args){
        Card c1=new Card("Clover","A",true);
        Card c2=new Card("Clover","2",true);
        Card c3=new Card("Clover","3",true);
        Card c4=new Card("Spade","3",true);
        Card c5=new Card("Heart","A",false);

        KindCard kc=new KindCard();
        List<Card> onekind=new ArrayList<>();

        kc.atok(c2);//첫 값으로 2를 넣었을 때
        kc.atok(c1);//첫 값으로 A를 넣었을 때
        kc.atok(c3);//모양은 같지만 숫자가 맞지 않을 때
        kc.atok(c2);//모양도 같고 바로 다음 숫자일 때
        kc.atok(c3);//모양은 같지만 숫자가 맞지 않을 때
        kc.atok(c4);//숫자는 다음 숫자지만 모양이 다를 때
        kc.atok(c5);//모양도 숫자도 맞지 않는 값을 넣을 때
    }
}
