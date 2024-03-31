package com.green.practiceAlone;
public class ClassStuding {
    public static void main(String[] args){
        //가입신청서 양식대로 제출
        Club c1=new Club("kim",981225,202405181);
        Club c2=new Club("lee",940314,202806291);
        Club c3=new Club("son",880201,201109172);
        //class라는 신청서를 쓰고 회원이 된다

        String[] member={"kim","lee","son"};
        int today=1225;//멤버 이름과 오늘 날짜를 자동적으로 생성하고 싶다
        //회원들이 기입한 생년월일에서 날짜부분만 %로 추출해서 오늘 날짜와 비교
        //오늘과 같으면 생일 축하합니다. 그걸 회원이 1000명이라도 가능하게 for문으로
        System.out.print(c1.partyday());
        System.out.print(c1.partyday()==today);
        for(int i=0;i<member.length;i++) {
            if (c1.partyday()==today) {
                //kim.party해야 생일 날짜만
                //이 부분을 각 멤버 별로 설정해서
                System.out.printf("happy birthday! %s\n", member[i]);
            }
        }
    }
}
class Club{//멤버 리스트 양식을 별도의 장부에 관리한다고 생각
    private String name;
    private int birthday;
    private long stu_id;

    //생성자//
    Club(String name,int birthday, long stu_id) {//가입신청서 양식(필수)
        this.name = name;//이 란에는 이걸 쓰세요
        this.birthday = birthday;
        this.stu_id = stu_id;
    }
    String getName(){//회원 실적+신상 조회?
        return name;
    }
    long getStu_id(){
        return stu_id;
    }
    int getBirthday(){
        return birthday;
    }
    int partyday(){
        int party=birthday%10000;
        return party;
    }
}

