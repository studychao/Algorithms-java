package com.company;

public class Main {

    public static void main(String[] args) {
        ResizingfStrings a = new ResizingfStrings();
        a.push("chao");
        a.push("gonna");
        a.push("study every day");
        System.out.print(a.pop());
        System.out.print(a.pop());
        System.out.print(a.pop());
        System.out.print(a.isEmpty());
    }
}
