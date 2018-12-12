package com.company;

public class BinarySearch {
    public static int BinarySearch(int[] a,int key){
        int lo=0,hi=a.length-1,mid;
        while(lo<=hi){
            mid = (lo + hi)/2;
            if(a[mid]>key){
                hi = mid -1;
            }
            else if(a[mid]<key){
                lo = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
