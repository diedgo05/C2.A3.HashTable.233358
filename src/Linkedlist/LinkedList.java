package Linkedlist;

import Business.Business;

public class LinkedList {
    private Node head;
    private int count;

    public LinkedList() {
        this.head = null;
        this.count = 0;
    }

    public void push(Business business) {
        Node node = new Node(business);

        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
        count++;
    }


    public Node getElementAt (int index) {
        if (index >= 0 && index < count) {
            Node node = head;
            for (int i = 0; i<index && node != null; i++) {
                node = node.next;
            }
            return node;
        }
        return null;
    }

    public int size(){
        return count;
    }


}
