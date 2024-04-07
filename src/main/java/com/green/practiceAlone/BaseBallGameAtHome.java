package com.green.practiceAlone;

import java.util.Scanner;

public class BaseBallGameAtHome {
    public static void main(String[] args) {
        int answer, user;//컴퓨터의 값, 사용자의 값
        int strike, ball;

        do {
            answer = (int) (Math.random() * 1000);//각 자리가 모두 다르고 세자리수
        } while (!(answer > 100 && overlap(answer)));

        int turn=10;
        while(true){
            user=input();
            if(user==answer){
                System.out.println("정답입니다.");
                break;
            } else{
                String user_copy=String.valueOf(user);
                String answer_copy=String.valueOf(answer);
                int i=0; strike=0; ball=0;
                for(;i<answer_copy.length();i++) {
                    int num = answer_copy.indexOf(user_copy.charAt(i));
                    if (num >= 0&&num == i) {strike++;}
                    else if (num >= 0) {ball++;}

                }turn--;
            }System.out.printf("%d: %d strike, %d ball, %d out\n",
                    user,strike,ball,(int)(Math.log10(user)+1)-(strike+ball));
            System.out.printf("%s[남은 턴: %d]\n","       ",turn);
        }System.out.printf("answer: %d",answer);
    }

    static int input() {
        Scanner scan=new Scanner(System.in);
        int num;
        do {
            System.out.print("3자리 정수를 입력해주세요.");
            num = scan.nextInt();
            if (num > 999 || num < 100) {
                System.out.println("범위가 너무 크거나 작습니다.");
            } else if (!overlap(num)) {
                System.out.println("중복없이 입력해주세요.");
            } else {
                break;
            }
        } while (!(num < 999 && num > 100 && overlap(num)));
        return num;
    }
    static boolean overlap(int num) {
        int val_1 = num % 10;
        int val_2 = (num % 100) / 10;
        int val_3 = num / 100;
        return (val_1 != val_2 && val_2 != val_3 && val_3 != val_1);
        //각 자리가 다 다른 값
    }
}
