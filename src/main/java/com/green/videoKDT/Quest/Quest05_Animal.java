package com.green.videoKDT.Quest;

public class Quest05_Animal {
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
class Whale extends Quest05_Animal{
    private boolean swim;

    public boolean getSwim(){
        return swim;
    }
    public void setSwim(boolean s){
        this.swim=s;
    }
   @Override
   public String toString() {
       String f=String.format("이름: %s \n나이: %d \n수영여부: %s\n",
               getName(), getAge(), (getSwim()?"O":"X"));
       return f;
   }
}
