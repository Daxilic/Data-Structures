package datastructures;

import java.util.LinkedList;

public class FIFO_queue<T> {
    private LinkedList<T> queue;

    public FIFO_queue() {
        queue = new LinkedList<>();
    }

    // Method to add an element to the queue
    public void enqueue(T item) {
        queue.addLast(item);
    }

    // Method to remove and return the element from the front of the queue
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.removeFirst();
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Method to get the size of the queue
    public int size() {
        return queue.size();
    }

    public static void main(String[] args) {
    	FIFO_queue<Integer> queue = new FIFO_queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        
        System.out.println("Size of the queue: " + queue.size());
        
        System.out.println("Dequeueing elements:");
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }
}

