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
        if (num1 > num2) {
            int tmp = num1;
            num1 = num2;
            num2 = tmp;
        }
    }
}
