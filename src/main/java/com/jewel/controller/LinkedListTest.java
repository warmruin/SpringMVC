package com.jewel.controller;

import java.util.LinkedList;

public class LinkedListTest {

  public static void main(String[] args) {
    //

      LinkedList<String> list=new LinkedList<String>();
      list.add("1");
      list.add("2");
      list.add("3");

    System.out.println("链表的第一个元素是："+list.getFirst());
    System.out.println("链表的第二个元素是："+list.getLast());
  }
}
