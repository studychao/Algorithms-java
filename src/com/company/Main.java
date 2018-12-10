package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        WeightedQuickUnion a = new WeightedQuickUnion(5);
        System.out.print(a.id[0]);
        System.out.print(a.id[4]);
        System.out.print(a.id[3]);
        a.union(0,4);
        a.union(3,4);
        a.union(4,2);
        System.out.print(a.root(0));
    }
}
