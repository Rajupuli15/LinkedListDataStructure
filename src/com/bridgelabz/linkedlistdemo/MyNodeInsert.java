package com.bridgelabz.linkedlistdemo;


    /* linked list learing problem
     * create a node class and perform compute on the linked list
     */
    public class MyNodeInsert {
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
        static void insertAtMid(int x)
        {

            if (head == null)
                head = new Node(x);
            else {
                // Create a new node
                Node newNode = new Node(x);

                Node lmn = head;
                int len = 0;

                // calculate length of the linked list
                //, i.e, the number of nodes
                while (lmn != null) {
                    len++;
                    lmn = lmn.next;
                }

                // 'count' the number of nodes after which
                // the new node is to be inserted
                int count = ((len % 2) == 0) ? (len / 2) :
                        (len + 1) / 2;
                lmn = head;


                // the new node is to be inserted
                while (count-- > 1)
                    lmn = lmn.next;

                // insert the newNode
                // the required links
                newNode.next = lmn.next;
                lmn.next = newNode;
            }
        }

        //display the data in linked list
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
            head = null;
            head = new Node(56);
            head.next = new Node(70);
        /* MyNodeInsert linkedList = new MyNodeInsert();
        linkedList.addNode(56);
        linkedList.addNode(70);
        System.out.println("welcome to linked list"); */
            insertAtMid(30);
            display();

        }
    }


