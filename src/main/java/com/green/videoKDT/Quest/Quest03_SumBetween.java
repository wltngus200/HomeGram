package com.green.videoKDT.Quest;

import java.util.Arrays;
import java.util.Scanner;

public class Quest03_SumBetween {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자 입력: ");
        int num1 = scan.nextInt();
        System.out.print("숫자 입력: ");
        int num2 = scan.nextInt();
        int sum=0;
        if (num1 > num2) {
            int tmp = num1;
            num1 = num2;
            num2 = tmp;
        }
        int[] numArr=new int[(num2-num1)+1];
        for(int i=0;i<numArr.length;i++){
            sum+=num1;
            numArr[i]=num1++;
        }
        System.out.printf("결과: %s\n",Arrays.toString(numArr));
        System.out.printf("합계: %d\n",sum);
    }
}
