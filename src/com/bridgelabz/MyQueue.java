package com.bridgelabz;

/**
 * Purpose - To create methods for Queue operation
 */
public class MyQueue {
    private final MyLinkedList myLinkedList;

    public MyQueue() {
        this.myLinkedList = new MyLinkedList();
    }

    /**
     * This method is used to add the elements to the Queue
     * So 56 will be added first then 30 and
     * then 70 to make 56 on top of the Queue
     * @param newNode This is the first parameter
     */
    public void enqueue(INode newNode) {
        myLinkedList.append(newNode);
    }

    /* This method is used for display the output */
    public void printQueue() {
        myLinkedList.printMyNodes();
    }
}
