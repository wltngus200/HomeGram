package com.green.videoKDT.Quest;

import java.util.Scanner;

public class Quest02_SumAvg {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int sum=0;
        int time=0;
        while(true){
            System.out.print("정수를 입력하세요. (종료>>0) ");
            int input=scan.nextInt();
            if(input==0) {
                break;
            } else {
                sum+=input;
                time+=1;
            }
        }System.out.printf("합계는 %d입니다. 평균은 %d입니다.\n",sum,sum/time);

    }
}
