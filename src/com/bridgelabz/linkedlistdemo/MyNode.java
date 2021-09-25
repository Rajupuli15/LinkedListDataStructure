package com.bridgelabz.linkedlistdemo;

import jdk.dynalink.beans.StaticClass;

/* linked list demo
Create a node class on the linked list
 */
public class MyNode {
    Node head;

    // create a node for the linked list

    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }


    public static void main(String[] args) {
        System.out.println("Welcome to Data Structure Problems");
        MyNode linkedList = new MyNode();

    }
}
