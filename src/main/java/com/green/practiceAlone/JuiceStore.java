package com.green.practiceAlone;

import java.util.ArrayList;
import java.util.List;

public class JuiceStore {
    public static void main(String[] args){
        Juice orange = new Juice("orange", 15, 100, true);
        Juice latte = new Juice("latte", 10, 120, false);
        Juice sport = new Juice("sport", 12, 90, true);
        System.out.println(orange);
        System.out.println(latte);
        System.out.println(sport);
    }
}
class Juice{
    List<Juice> juice;
    private String juice_name;
    private int amount;
    private int price;
    private boolean ice;//true=ice, false=hot

    Juice(String juice_name, int amount, int price, boolean ice){
        this.juice_name=juice_name;
        this.amount=amount;
        this.price=price;
        this.ice=ice;

    }
    @Override
    public String toString(){
        String menu=String.format("-----------\nname: %s \namount: %d\nprice: %d\ntemperature: %s\n-----------\n",
                juice_name,amount,price,(ice?"ice":"hot"));
        return menu;
    }
}
