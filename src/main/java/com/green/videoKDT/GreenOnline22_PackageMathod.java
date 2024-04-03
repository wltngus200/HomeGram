package com.green.videoKDT;

public class GreenOnline22_PackageMathod {
    public static void main(String[] args){
        StringBuffer sb1=new StringBuffer("Good Morning");
        sb1.append('!');
        sb1.append("Alice!");
        System.out.println(sb1);
        StringBuffer sb2=new StringBuffer("water");
        StringBuffer sb3=new StringBuffer("wafer");
        System.out.println("sb2.charAt(2) :" +sb2.charAt(2));
        System.out.println("sb2.compareTo(sb3): " +sb2.compareTo(sb3));
        StringBuffer sb4=new StringBuffer("Java Programing Language");
        sb4.delete(5,8);//5에서 8까지(8이 포함되지 않음)
        System.out.println("sb4.delete(5,8): "+sb4);
        StringBuffer sb5=new StringBuffer("Hello World");
        sb5.insert(5,',');
        System.out.println("sb5: "+sb5);
        System.out.println("sb5.substring(7): "+sb5.substring(7));
        System.out.println("sb5: "+sb5);
        System.out.println("sb5.capacity( ): "+sb5.capacity());
        sb5.trimToSize();//공백을 제외한 실제 크기
        System.out.println("after trim: "+sb5.capacity());
    }
}
