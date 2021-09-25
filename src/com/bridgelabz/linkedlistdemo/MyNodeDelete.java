package com.bridgelabz.linkedlistdemo;

/* linked list learing problem
 * create a node class and perform compute on the linked list
 */
    public class MyNodeDelete {
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
        //pop method  next node
        public static void pop(){
            Node temp =head;
            if(head == null) {
                System.out.println("linked list does not have data");
            }
            else {
                head = head.next;
            }
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
            //create object and give to the method

            MyNodeDelete linkedList = new MyNodeDelete();
            linkedList.addNode(56);
            linkedList.addNode(30);
            linkedList.addNode(70);
            display();
            System.out.println("linked list data");
            //pop method point the next node

            linkedList.pop();
            display();

        }
    }

