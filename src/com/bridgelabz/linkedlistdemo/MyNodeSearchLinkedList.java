package com.bridgelabz.linkedlistdemo;

/* linked list learning problem
 * create a node class and perform compute on the linked list
 */
public class MyNodeSearchLinkedList {

    static Node head;

    // create a node for linked list
    static class Node{
        int data;
        Node next;
        Node(int d){
            data =d;
            next = null;
        }
    }

    // add the method to give the value linked list
    public void addNode(int data) {
        Node newNode = new Node(data);
        newNode.next = null;
        if (this.head == null) {
            head = newNode;
        }
        else {
            Node last = this.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }

    }

    public void searchNode(int data){
        Node node = head;
        int length=0;
        while(node.data != data) {
            node = node.next;
            length++;
        }
        if(node.data == data){
            System.out.println("node"+node.data+"present position"+length);
        }
    }

    // display data limked list
    public static void display(){
        if(head == null){
            System.out.println("linked list no value");
        }
        Node node = head;
        while (node.next != null){
            System.out.println("->"+node.data); // lambda operator
            node = node.next;
        }
        if(node.next == null){
            System.out.println("->"+node.data);
        }
    }
    public static void mail(String args[]) {
        System.out.println("Welcome to linked list");

        MyNodeSearchLinkedList linkedList = new MyNodeSearchLinkedList();
        linkedList.addNode(56);
        linkedList.addNode(30);
        linkedList.addNode(70);
        display();
        System.out.println();
        linkedList.searchNode(30);

    }

}
