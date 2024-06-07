package datastructures;

import java.util.LinkedList;

public class steque<T> {
    private LinkedList<T> list;

    public steque() {
        list = new LinkedList<>();
    }

    // Method to add an element to the front of the steque
    public void push(T item) {
        list.addFirst(item);
    }

    // Method to add an element to the rear of the steque
    public void enqueue(T item) {
        list.addLast(item);
    }

    // Method to remove and return the element from the front of the steque
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Steque is empty");
        }
        return list.removeFirst();
    }

    // Method to check if the steque is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Method to get the size of the steque
    public int size() {
        return list.size();
    }

    public static void main(String[] args) {
        steque<Integer> steque = new steque<>();
        steque.push(1);
        steque.push(2);
        steque.enqueue(3);
        
        System.out.println("Size of the steque: " + steque.size());
        
        System.out.println("Popping elements from the steque:");
        while (!steque.isEmpty()) {
            System.out.println("Popped: " + steque.pop());
        }
    }
}

