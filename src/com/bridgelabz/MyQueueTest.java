package com.bridgelabz;

import org.junit.jupiter.api.Test;

/**
 * This is the Test class which is used for checking the test cases.
 */
public class MyQueueTest {

    /**
     * This is the first test case where Queue is created by using enqueue method and
     * this operation is done by using LinkedList and
     * Final Sequence will be 56->30->70
     */
    @Test
    public void given3NumbersWhenAppendToQueueShouldHaveLastAddedToNode() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        myQueue.printQueue();
    }

    /**
     * This is the second test case where Queue is created by using enqueue method,
     * top element is removed by dequeue method and
     * this operation is done by using LinkedList so that
     * Final Sequence will be from 56->30->70 to 30->70
     */
    @Test
    void given3NumbersInQueueWhenDequeuedShouldMatchWithFirstAddedNode() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        myQueue.printQueue();
        INode dequeue = myQueue.dequeue();
        myQueue.printQueue();
    }
}