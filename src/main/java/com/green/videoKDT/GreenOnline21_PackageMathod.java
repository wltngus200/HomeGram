package com.green.videoKDT;

public class GreenOnline21_PackageMathod {
    public static void main(String[] args){
        Thing th1=new Thing("desk",5);
        Thing th2=new Thing("desk",5);
        if(th1.equals(th2)) System.out.println("same thing");
        else System.out.println("different thing");
    }
}
class Thing extends Object{
    private String name;
    private int count;

    Thing(){}
    Thing(String name, int count){
        this.name=name;
        this.count=count;
    }
    void print(){
        System.out.println("name: "+name);
        System.out.println("count: "+count);
    }

    public boolean equals(Object obj){//이 부분이 없다면 다르다는 것으로 나옴(오버라이딩이기 때문)
        if(this.name.equals(((Thing)obj).name)&&this.count==((Thing)obj).count){
            return true;
        }else{return false;}
    }
}
