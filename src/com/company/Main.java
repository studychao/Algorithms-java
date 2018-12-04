package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        int N = StdIn.readInt();
        UF uf = new UF(N);
        while (!StdIn.isEmpty())
        {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (!uf.connected(q,p))
            {
                uf.union(p,q);
                StdOut.println(p + " " + q);
            }
        }
    }
}
