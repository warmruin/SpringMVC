package com.jewel.dao.SerializableTest;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Serializable {

    private String name;
    private int age;
    //不提供无参构造器


    /**
     *  有参构造器
     *
     * @param name 的名字
     * @param age  年龄
     */
    public Person(String name, int age) {

        System.out.println("反序列化，你调用我了吗？");
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
