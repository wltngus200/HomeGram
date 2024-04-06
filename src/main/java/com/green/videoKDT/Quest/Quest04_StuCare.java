package com.green.videoKDT.Quest;

public class Quest04_StuCare {
    public static void main(String[] args){
        Member person=new Member(12345,"abcde","서울특별시 강남구 역삼동","student@school.com");
        person.result();
    }
}
class Member{
    int id;
    String pw;
    String address;
    String email;

    Member(int id,String pw,String address,String email){
        this.id=id;
        this.pw=pw;
        this.address=address;
        this.email=email;
    }
    void result(){
        System.out.println("학생 정보");
        System.out.println("----------------");
        System.out.printf("ID: %s\n",id);
        System.out.printf("PW: %s\n",pw);
        System.out.printf("Address: %s\n",address);
        System.out.printf("Email: %s\n",email);
    }
}
