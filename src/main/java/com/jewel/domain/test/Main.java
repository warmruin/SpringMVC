package com.jewel.domain.test;

public class Main {
    public static void main(String[] args) {
        OverridingTest2 test2 = new OverridingTest2();
        test2.run();

        OverridingTest1 test1 = new OverridingTest1();
        test1.run();
    }
}
