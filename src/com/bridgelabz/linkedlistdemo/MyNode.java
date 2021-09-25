package com.bridgelabz.linkedlistdemo;

public class MyNode<K> {
    private K key;
    private MyNode next;

    public MyNode(K key){
        this.key = key;
        this.next = null;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Data Structure Problems");
    }
}