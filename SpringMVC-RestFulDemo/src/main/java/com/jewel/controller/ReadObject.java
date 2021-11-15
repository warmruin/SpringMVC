package com.jewel.controller;

import com.jewel.dao.SerializableTest.Person;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {


        try {
            //创建一个ObjectInputStream输入流
            ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream("object.txt"));
            Person brady=(Person)inputStream.readObject();
            System.out.println(brady);
        }
        catch(Exception e){
            e.printStackTrace();
        }


    }
}
