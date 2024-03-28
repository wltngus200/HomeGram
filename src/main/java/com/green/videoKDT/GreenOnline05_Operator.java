package com.green.videoKDT;

public class GreenOnline05_Operator {
    public static void main(String[] args){
        int a=20, b=7, c=30, d=2;
        boolean y=a>b+c&&d<8;
        /*
        y=20>7+30&&2<8;
        y=20>37&&2<8;
        y=false&&2<8;
        y=false&&true;
        y=false;
         */
        System.out.println("y= "+y);
        //연산자의 우선 순위 산술>>관계(비교)>>논리>>할당(대입)
    }
}
