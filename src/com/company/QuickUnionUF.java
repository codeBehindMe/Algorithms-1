package com.company;

/**
 * Created by tillera on 9/05/2017.
 */
public class QuickUnionUF {
    private int[] id; // array to hold the ids of the integers.

    public QuickUnionUF(int N) {
        id = new int[N];

        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    private int Root(int i){
        // chase the root of the item.
        while(id[i] != i) i = id[i];
        return i;
    }

    public boolean Connected(int p, int q) {
        return Root(p) == Root(q);
    }

    public void Union(int p, int q){
        int j = Root(p);
        int k = Root(q);

        id[j] = k;
    }
}
