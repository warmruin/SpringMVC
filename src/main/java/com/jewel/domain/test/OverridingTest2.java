package com.jewel.domain.test;

public class OverridingTest2 extends OverridingTest1{

    @Override
    public void run() {
        System.out.println("这是重写后的子类方法！");
    }
}
