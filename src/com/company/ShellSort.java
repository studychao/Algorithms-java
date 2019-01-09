package com.company;

public class ShellSort {
    public static void sort(Comparable[] a)
    {
        int N = a.length;
        int h = 1;
        while (h < N/3) h=h*3+1;
    while (h>=1) {
        for (int i = 0; i < N; i++) {
            for (int j = i; j >= h && less(a[j], a[j - h]); j = j - h) {
                    exch(a, j, j - h);

            }
        }
        h = h/3;
    }
    }

    private static boolean less( Comparable v, Comparable w)
    {
        return v.compareTo(w)<0;
    }
    private static void exch (Comparable[] a, int i , int j)
    {
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
    public static void main(String[] args){
        Integer[] a = {487,69999,3,99,32,123482,0};
        sort(a);
        for (int i : a) {
            System.out.println(i);
        }

    }
}
