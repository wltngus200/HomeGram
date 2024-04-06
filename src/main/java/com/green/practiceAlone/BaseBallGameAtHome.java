package com.green.practiceAlone;

import java.util.Scanner;

public class BaseBallGameAtHome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        NoOverlap noover = new NoOverlap();

        int user, answer;

        do{
            answer = (int) (Math.random() * 1000);//각 자리가 모두 다르고 세자리수
        }while(!(answer > 100 && noover.overlap(answer)));
        System.out.println("정답: " + answer);//임시

        System.out.println();

        do{
            System.out.print("3자리 정수를 입력해주세요.");
            user=scan.nextInt();
            if(user>999||user<100){
                System.out.println("범위가 너무 크거나 작습니다.");
            }else if(!noover.overlap(user)) {
                System.out.println("중복없이 입력해주세요.");
            }else{break;}
        } while (!(user > 100 && noover.overlap(user)));
        System.out.println("입력값: " + user);//임시
    }

}

class NoOverlap{
    boolean overlap(int num){
        int val_1 = num % 10;
        int val_2 = (num % 100) / 10;
        int val_3 = num / 100;
        return (val_1!=val_2 && val_2!=val_3 && val_3!=val_1);
        //각 자리가 다 다른 값
    }
}
