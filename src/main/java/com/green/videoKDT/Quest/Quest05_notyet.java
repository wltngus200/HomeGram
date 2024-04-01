package com.green.videoKDT.Quest;

public class Quest05_notyet {
    public static void main(String[] args){
        Whale w = new Whale();
        w.setName("고래");
        w.setAge(5);
        //System.out.print(w);
        //w.setSwim(true);
        System.out.println("이름 : "+w.getName());
        System.out.println("나이 : "+w.getAge());
        System.out.println("수영여부 : "+w.getAge());
    }
}
class Animal{
    //public class Animal{//퍼블릭 해야됨?
        private int age;
        private String name,sex;
        public void setAge(int n){
            age = n;
        }
        public void setName(String n){
            name = n;
        }
        public void setSex(String n){
            sex = n;
        }
        public int getAge(){
            return age;
        }
        public String getName(){
            return name;
        }
        public String getSex(){
            return sex;
        }
}
class Whale extends Animal{
    boolean swim;
    boolean getSwim(){
        return swim;
    }
    boolean setSwim(){
        return swim;
    }
}