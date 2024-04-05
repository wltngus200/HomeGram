package com.green.videoKDT;
public class GreenOnline27_Generics {
    public static void main(String[] args){
        Data2<Integer> d1= new Data2<Integer>(100);
        System.out.println(d1.getObj());
        d1.showType();

        Data2<String> d2= new Data2<String>("JAVA");
        System.out.println(d2.getObj());
        d2.showType();

        Data3<Integer> d=new Data3<Integer>(100);
        int result=d.calcMultiple(5);
        System.out.println(result);

        Data3<Double> e=new Data3<Double>(17.5);
        int result2=e.calcMultiple(5);
        System.out.println(result2);
    }
}
class Data2<T>{
    T obj;
    Data2(T ob){
        obj=ob;
    }
    T getObj(){
        return obj;
    }
    void showType(){
        System.out.println("Type of T: "+obj.getClass().getName());
    }
}
class Data3<T extends Number>{
    T obj;
    Data3(T ob){
        obj=ob;
    }
    int calcMultiple(int n){
        return obj.intValue()*n;
    }
}