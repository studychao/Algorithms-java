package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        FixedCapacityOfStrings a = new FixedCapacityOfStrings(10);
        a.push("chao");
        a.push("gonna");
        a.push("study every day");
        System.out.print(a.pop());
        System.out.print(a.pop());
        System.out.print(a.pop());
        System.out.print(a.isEmpty());
    }
}
