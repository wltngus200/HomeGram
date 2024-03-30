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
        int[] numArr=new int[num2-num1];
        for(int i=0;i<=numArr.length;i++){
            numArr[i]=num1++;
            sum+=num1++;
        }//배열을 쓰면 []가 나오는 것도 그렇고
        //수식이 복잡해지는 것도 그렇고
        //근데 숫자,숫자,도 if들어가야되고....
        //뭐지?
        System.out.print("결과: ");
        System.out.println(Arrays.toString(numArr));
        System.out.printf("합계: %d\n",sum);
    }
}
