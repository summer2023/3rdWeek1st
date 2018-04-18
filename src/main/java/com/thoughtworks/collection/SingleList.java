package com.thoughtworks.collection;

import java.util.List;

public class SingleList<T> implements SingleLink<T> {
    protected Node<T> head;

    class Node<T>{
        private T data;
        private Node next;

        public Node(T data, Node next) {
            this.data=data;
            this.next=next;
        }

        public Node() {

        }
    }


    public SingleList(){
        this.head = new Node<T>();
    }


    public SingleList(List<T> element) {
        this();
        Node<T> p=this.head;
        for(int i=0;i<element.size();i++) {
            addTailPointer(element.get(i));
        }
    }

    @Override
    public T getHeaderData() {
        return null;
    }

    @Override
    public T getTailData() {
        return null;
    }

    @Override
    public int size() {
        int i=0;
        Node<T> p=this.head.next;
        while(p!=null){
            i++;
            p=p.next;
        }
        return i;
    }

    @Override
    public boolean isEmpty() {
        return this.head.next==null;
    }

    @Override
    public boolean deleteFirst() {
        return false;
    }

    @Override
    public boolean deleteLast() {
        return false;
    }

    @Override
    public void addHeadPointer(T item) {

    }

    @Override
    public void addTailPointer(T item) {
        Node<T> p=this.head.next;
        Node<T> rear=p;
        while(p!=null){
            p=p.next;
        }
        rear.next=p.next;
        p.next=rear;
        rear.data=item;
    }

    @Override
    public T getNode(int index) {
        if (index > 0) {
            Node<T> p=this.head.next;
            for(int j=0;p!=null&&j<index;j++) {
                p=p.next;
            }
            if (p != null) {
                return p.data;
            }
        }
        return null;
    }
}
