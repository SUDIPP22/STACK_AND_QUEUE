package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * This is the Test class which is used for checking the test cases.
 */
public class MyStackTest {

    /**
     * This is the first test case where Stack is created by using push method and
     * this operation is done by using LinkedList and
     * Final Sequence will be 56->30->70
     */
    @Test
    public void given3NumbersWhenAddedToStackShouldHaveLastAddedToNode() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.printStack();
        INode peak = myStack.peak();
        Assertions.assertEquals(myThirdNode, peak);
    }

    /**
     * This is the second test case where Stack is created by using push method,
     * top element is removed by pop method and
     * this operation is done by using LinkedList so that
     * Final Sequence will be from 56->30->70 to 30->70
     */
    @Test
    void given3NumbersInStackWhenPopedShouldMatchWithLastAddedNode() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        INode pop = myStack.pop();
        myStack.printStack();
        Assertions.assertEquals(myThirdNode, pop);
    }
}