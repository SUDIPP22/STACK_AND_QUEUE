package com.bridgelabz;

/**
 * Purpose - To create methods for Stack operation
 */
public class MyStack {
    private final MyLinkedList myLinkedList;

    public MyStack() {
        this.myLinkedList = new MyLinkedList();
    }

    /** This method is used to add the elements to the Stack
     * So 70 will be added first then 30 and
     * then 56 to make 56 on top of the Stack
      * @param myNode This is the first parameter
     */
    public void push(INode myNode) {
        myLinkedList.add(myNode);
    }

    /* This method is used for display the output */
    public void printStack() {
        myLinkedList.printMyNodes();
    }

    /**
     * This method is used to verify first test case
     * @return returns the top element from the stack.
     */
    public INode peak() {
        return myLinkedList.head;
    }

    /**
     * This method is used to remove the top element from the Stack
     * @return returns the top element from the stack.
     */
    public INode pop() {
        return myLinkedList.pop();
    }
}
