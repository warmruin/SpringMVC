package com.jewel.controller;

import com.jewel.dao.SerializableTest.Person;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        try (//创建一个ObjectOutputStream输出流
             ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.txt"))) {
            //将对象序列化到文件s
            Person person = new Person("9龙", 23);
            oos.writeObject(person);


            //todo 序列化教程 https://www.cnblogs.com/9dragon/p/10901448.html
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
