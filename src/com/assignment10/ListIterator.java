package com.assignment10;

public class ListIterator<T> {
    private SList<T> sList;

    public ListIterator(SList<T> sList) {
        this.sList = sList;
    }

    public SList insert(T value) {
        node new_node = new node(value);
        new_node.next = null;

        if (sList.head == null) {
            sList.head = new_node;
        } else {
            node last = sList.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }

        return sList;
    }


    public SList<T> Delete(T key) {
        node currNode = sList.head;
        node prev = null;

        if (currNode != null && currNode.data == key) {
            sList.head = currNode.next; // Changed head

            System.out.println(key + " found and deleted");
            return sList;
        }

        while (currNode != null && currNode.data != key) {
            prev = currNode;
            currNode = currNode.next;
        }
        if (currNode != null) {
            prev.next = currNode.next;
            System.out.println(key + " found and deleted");
        }

        if (currNode == null) {
            System.out.println(key + " not found");
        }

        return sList;
    }



    @Override
    public String toString() {
        String result = "";
        node currNode = sList.head;

        while (currNode != null) {
            result += currNode.data + " ";
            currNode = currNode.next;

        }
        return result;
    }

}
