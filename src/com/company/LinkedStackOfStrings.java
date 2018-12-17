package com.company;

public class LinkedStackOfStrings<Item> {
    private Node first = null;
    private class Node{
        Item item;
        Node next;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void push(Item item){
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
    }

    public Item pop(){
        Item val = first.item;
        first = first.next;
        return val;
    }
}
