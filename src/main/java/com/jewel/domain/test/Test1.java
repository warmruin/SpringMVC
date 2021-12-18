package com.jewel.domain.test;

/**
 * test1
 * java方法重载的例子
 * 1.方法名一定相同
 * 2。参数列表不同。个数不同，类型不同，顺序不同。
 * 3.修饰符和返回值类型可以相同也可以不同。
 * @author Cris
 * @date 2021/12/18
 */
public class Test1 {

    public void out(){
        System.out.println("参数"+null);
    }
    //参数数目不同
    public void out(Integer n){
        System.out.println("参数"+n.getClass().getName());
    }

    //参数类型不同
    public void out(String string){
        System.out.println("参数"+string.getClass().getName());
    }

    public void out(Integer n ,String string){
        System.out.println("参数"+n.getClass().getName()+","+string.getClass().getName());
    }
    //参数顺序不同
    public void out(String string,Integer n){
        System.out.println("参数"+string.getClass().getName()+","+n.getClass().getName());
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.out();
        test1.out(1);
        test1.out("string");
        test1.out(1,"string");
        test1.out("string",1);
    }

}
