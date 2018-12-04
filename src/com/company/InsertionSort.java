package com.company;
import java.util.*;

public class InsertionSort {
    public int[] InsertionSortA(int[] a){
        for (int j = 1; a.length > j; j++)
        {
            int key = a[j];
            int i = j - 1;
            while (i>=0 && a[i]>key)
            {
                a[i+1] = a[i];
                i=i-1;
            }
            a[i+1] = key;
        }
        return a;
    }

    public int[] InsertionSortB(int[] a){
        for (int j = 1; a.length > j; j++)
        {
            int key = a[j];
            int i = j - 1;
            while (i>=0 && a[i]<key)
            {
                a[i+1] = a[i];
                i=i-1;
            }
            a[i+1] = key;
        }
        return a;
    }
}
