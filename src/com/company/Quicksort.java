package com.company;

public class Quicksort {
    public static Comparable partition(Comparable[] a,int lo, int hi)
    {
        int i = lo;
        int j = hi+1;
        while (true)
        {
            while (less(a[++i],a[lo])) {
                if (i == hi)
                    break;
            }
            while (less(a[lo],a[--j]))
            {
                if (j == lo) break;
            }

            if (i >= j) break;
            exch(a,i,j);
        }

        exch (a,j,lo);
        return j;
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
        Integer[] a = {4,2,3,9,2};
        partition(a,0,4);
        for (int i : a) {
            System.out.println(i);
        }

    }
}
