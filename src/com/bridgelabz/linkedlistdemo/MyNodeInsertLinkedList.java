package com.bridgelabz.linkedlistdemo;

import java.util.Scanner;

/* linked list learning problem
 * create a node class and perform compute on the linked list
 */
    public class MyNodeInsertLinkedList {
        Scanner scanner = new Scanner(System.in); // import scanner
        static Node head;
        //create a node for the linked list
        static class Node{
            int data;
            Node next;
            Node(int d){
                data = d;
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

        public void searchInsertNode(int data) {
            Node ptr = head;
            System.out.println("Enter the data need to add");
            Node newNode = new Node(scanner.nextInt());

            while(ptr.data != data)
            {
                ptr = ptr.next;
            }
            //newNode point to ptr.next
            newNode.next = ptr.next;
            ptr.next = newNode;     //ptr.next now point to the new node
        }
        //display the data to linked list
        public static void display(){
            if(head == null){
                System.out.println("linked list has no value");
            }
            Node node = head;
            while(node.next != null){
                System.out.print("->"+node.data);
                node = node.next;
            }
            if(node.next == null){
                System.out.print("->"+node.data);
            }
        }
        public static void main(String args[]) {
            System.out.println("welcome to linked list");

            MyNodeInsertLinkedList linkedList = new MyNodeInsertLinkedList();
            linkedList.addNode(56);
            linkedList.addNode(30);
            linkedList.addNode(70);
            display();
            System.out.println();
            linkedList.searchInsertNode(30);
            display();

        }
    }
