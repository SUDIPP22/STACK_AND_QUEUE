package com.bridgelabz;

public class MyLinkedList {
    public INode head;
    public INode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    /* This method is used to add the elements to the linked list */
    public void add(INode newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    /* This method is used to append the elements to the linked list */
    public void append(INode myNode) {
        if (this.head == null) {
            this.head = myNode;
        }
        if (this.tail == null) {
            this.tail = myNode;
        } else {
            this.tail.setNext(myNode);
            this.tail = myNode;
        }
    }

    /* This method is used to insert the element in between two nodes */
    public void insert(INode myNode, INode newNode) {
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    /* This method is used for deleting the first node */
    public INode pop() {
        INode tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    /* This method is used for deleting the last node */
    public void popLast() {
        INode tempNode = head;
        while (!tempNode.getNext().equals(tail)) {
            tempNode = tempNode.getNext();
        }
        this.tail=tempNode;
        tempNode.setNext(null);
    }

    /* This method is used for searching position of a node element in the list */
    public void searchMyNode() {
        INode tempNode = head;
        int position = 0;
        while (tempNode != null) {
            position++;
            if (tempNode.getKey().equals(30)) {
                System.out.println("Your Node With Key value 30 is present at position " +position+ " in the list");
            }
            tempNode = tempNode.getNext();
        }
    }

    /* This method is used for inserting a new key value at particular position  */
    public void insert(int key, int position) {
        MyNode newNode = new MyNode(key);
        MyNode nodeAtPreviousIndex = (MyNode) head;
        for (int i = 0; i < position - 1; i++) {
            nodeAtPreviousIndex = (MyNode) nodeAtPreviousIndex.next;
        }
        newNode.next = nodeAtPreviousIndex.next;
        nodeAtPreviousIndex.next = newNode;
        System.out.println("After inserting a new node with key value " + key + " at position " + position + " : ");
    }

    /* This method is used for removing a key at particular position */
    public void remove(int position) {
        MyNode tempNode = (MyNode) head;
        MyNode currentNode = (MyNode) head;
        for (int i = 0; i < position; i++) {
            tempNode = currentNode;
            currentNode = (MyNode) currentNode.next;
        }
        tempNode.next = currentNode.next;
    }

    /* This method is used for displaying the output */
    public void printMyNodes() {
        StringBuilder myNodes = new StringBuilder("My Nodes : ");
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            myNodes.append(tempNode.getKey());
            if (!tempNode.equals(tail)) myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }
}
