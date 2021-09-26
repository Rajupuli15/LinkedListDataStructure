package com.bridgelabz.linkedlistdemo;


import java.util.Scanner;

/* linked list learning problem
 * create a node class and perform compute on the linked list
 */
    public class MyNodeDelete40LinkedList {
        Scanner scanner = new Scanner(System.in); // Import Scanner class
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
        // create the add method the give the value linked list
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
        //create a method to insert neNode after certain position in the linked list
        public void searchInsertNode(int data) {
            Node lmn = head;
            System.out.println("Enter the data need to add");
            Node newNode = new Node(scanner.nextInt());
            //ptr traverse till given node data after that need to inser the newnode in the linkedlist
            while(lmn.data != data)
            {
                lmn = lmn.next;
            }
            //newNode point to ptr.next
            newNode.next = lmn.next;
            lmn.next = newNode;           //lmn Next now point to the newNode
        }
        //pop method to pop the node in the linked list
        public void popNode(int data){
            Node lmn = head;
            Node last = head;
            while(lmn.data != data){
                last =lmn;
                lmn = lmn.next;
            }
            //last node point to the prt next node
            last.next = lmn.next;
            lmn = null;
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
            System.out.println();
        }
        public static void main(String args[]) {
            System.out.println("welcome to linked list");
            //create object and give to the method
            MyNodeDelete40LinkedList linkedList = new MyNodeDelete40LinkedList();
            linkedList.addNode(56);
            linkedList.addNode(30);
            linkedList.addNode(70);
            System.out.println("Enter the node after need to remove the data the linked list");
            linkedList.searchInsertNode(30);
            display();
            System.out.println("Enter the node to the pop");
            linkedList.popNode(40);
            display();
        }
    }


