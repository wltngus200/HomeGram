package com.green.videoKDT;

public class GreenOnline30_Lamda {
    public static void main(String[] args){
        Test<Integer> x=(n,m) -> n<m;//인터페이스 변수에 람다식 대입
        if(x.test(3,5))//람다식의 실행+참이라면
            System.out.println("3 is less than 5");//하드코딩 3,5 가 아니더라도 2,5 라도 참이면 이 문구 출력
        System.out.println();

        Test<String> z=(a,b) -> a.equals(b);
        String str="JAVA";
        if(z.test(str,"JAVA"))
            System.out.println("same String");
        else System.out.println("different String");

        Cards card;
        System.out.println("Print out all cards");
        System.out.println("-------------------");
        Cards all[]=Cards.values();
        for(Cards tmp:all) // (배열 안에 들어있는 종류: 배열이름)
            System.out.println(tmp);
        System.out.println("-------------------");
        card=Cards.valueOf("Clover");
        System.out.println("card is "+card);

        Cards cd1, cd2, cd3;
        for(Cards c: Cards.values())
            System.out.println(c+":"+c.ordinal());//순서반환
        cd1=Cards.Heart;
        cd2=Cards.Clover;
        cd3=Cards.Heart;
        if(cd1.compareTo(cd2)<0)
            System.out.println("cd1<cd2");
        else System.out.println("cd1>cd2");
        if(cd1.compareTo(cd3)==0)
            System.out.println("cd1==cd3");
        else System.out.println("cd1!=cd3");

    }
}


enum Cards{Heart, Clover, Spade, Diamond}


interface Test<T>{
    boolean test(T n, T m);
}
