package com.green.videoKDT;

import java.util.Scanner;
import java.io.IOException;

public class GreenOnline25_IO {
    public static void main(String[] args) throws IOException {
        /*
        Scanner scan=new Scanner(System.in);
        //System.out.print("Name: ");
        String name=scan.next();
        //System.out.print("Phone number: ");
        String phone=scan.next();
        //System.out.print("Age: ");
        int age=scan.nextInt();
        //System.out.print("Height: ");
        float height=scan.nextFloat();
        //System.out.print("Gender: ");
        char gender=scan.next().charAt(0);

        System.out.println("name: "+name);
        System.out.println("phone: "+phone);
        System.out.println("age: "+age);
        System.out.println("height: "+height);
        System.out.println("gender: "+gender);

        scan.close();
        //구분자:공백 탭 (\t),\n =토큰
        */
        //System.out.print("Enter one character: ");
        System.out.print("문자를 입력하세요.: ");
        int x;
        try{
            while((x=System.in.read())!=-1){
                //문자가 입력되지 않을 경우 -1을 띄움 즉 입력을 계속하는동안 이란 의미
                System.out.print((char)x);
            }//int값을 받음
            //try catch 지우면 에러
            //입력과 출력에서 오류발생 위험이 크기 때문에 예외처리를 하라고 빨간줄
            //System.out.println("You entered "+x);//int로 저장됨
            //System.out.println("You entered"+(char)x);//문자로 변환
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
