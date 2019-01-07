package com.company;

public class Main {

    public static void main(String[] args) {
        ResizingfStrings<String> a = new ResizingfStrings<>();
        a.push("chao");
        a.push("gonna");
        a.push("study every day");

       for (String s : a){
           System.out.print(s);
       }
    }
}
