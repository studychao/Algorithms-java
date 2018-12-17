package com.company;

import java.util.Iterator;
import java.util.ListIterator;

public class ResizingfStrings<Item> implements Iterable<Item>{
        private Item[] s;
        private int N = 0;
        public ResizingfStrings(){
            s = (Item[])new Object[1];
        }

        public void resize(int capacity){
            Item[] copy = (Item[]) new Object[capacity];
            for (int i = 0;i<N;i++){
                copy[i] = s[i];
            }
            s = copy;
        }
        public boolean isEmpty(){
            return N == 0;
        }
        public void push (Item item){
            if (N == s.length){
                resize(s.length*2);
            }
            s[N++] = item;
        }
        public Item pop(){
            System.out.print("\n the length is "+ s.length + N);
            Item item = s[--N];
            s[N] = null;
            if (N>0 && N == s.length/4){
                System.out.print("try" + N +s.length/4);
                resize(s.length/2);
            }
            return item;
        }

        public Iterator<Item> iterator(){
            return new ListIterator();
        }

        private  class ListIterator implements Iterator<Item>{
            private int i = N;

            public boolean hasNext(){
                return (i > 0);
            }
            public void remove(){
                ;
            }
            public Item next(){
                return (s[--i]);
            }

        }
}
