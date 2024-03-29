package com.green.videoKDT;

public class GreenOnline08_ForWhile {
    public static void main(String[] args){
        int a=0;
        while(a<10){
            a++;//증감의 위치 중요
            //if 아래로 가면 증감이 되지 않아 무한루프+4가 빠짐
            if(a%3==0){
                continue;
            }
            System.out.println(a);
        }
        int row, col;
        row=1;//줄
        while(row<=10){
            col=1;//칸
            while(col<=10){
                System.out.print(row*col+" ");
                col++;
            }row++;
            System.out.println();
        }
    }
}
