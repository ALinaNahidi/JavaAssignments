package com.assignment10;

public class SList<T> {
    node<T> head;
    private int length=0;
    public node<T> getHead() {
        return head;
    }

    public void setHead(node<T> head) {
        this.head = head;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}


class node<T>{
    T data;
    node<T> next;

    node(T data){
        this.data=data;
        this.next=null;
    }
}