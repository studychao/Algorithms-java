package com.company;

public class mergesort {
    static int CUTOFF =7;
    public static void merge(Comparable[] a,Comparable[] aux,int lo, int mid, int hi)
    {
        for (int k = lo;k<= hi;k++)
        {
            aux[k] = a[k];
        }
        int j = mid+1;
        int m = lo;
        for (int i = lo;i<= hi; i++)
        {
            if (m>mid)
                a[i] = aux[j++];
            else if (j>hi)
                a[i] = aux [m++];
            else if (less(aux[j],aux[m]))
                a[i] = aux [j++];
            else
                a[i] = aux [m++];
        }
    }

    public static void sort(Comparable[] a,Comparable[] aux,int lo,int hi)
    {
        if (hi<=lo + CUTOFF -1) {
            Insertion.sort(a);
            return;
        }
        int mid = lo + (hi-lo)/2;
        sort (a,aux,lo,mid);
        sort (a,aux,mid+1,hi);
        merge (a,aux,lo,mid,hi);
    }

    public static void sort(Comparable[] a)
    {
       Comparable[] aux = new Comparable[a.length];
        sort (a,aux,0,a.length-1);
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
        Integer[] a = {2,3,9,2,1,0,2,1,3,55,331,4292,2,131232,21};
        sort(a);
        for (int i : a) {
            System.out.println(i);
        }

    }
}
