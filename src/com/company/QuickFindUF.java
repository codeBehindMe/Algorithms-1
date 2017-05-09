package com.company;

public class QuickFindUF {
    private int[] id; // Array of integers

    //Constructor
    public QuickFindUF(int N) {
        id = new int[N]; // instantiate array with N Numbers
        // Iterate and assign id of each object to itself. (Nothing is connected)
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public boolean connected(int p, int q) { // Check if two items are connected.
        // Simply check if the id of p is equal to the id of q.
        return id[p] == id[q];
    }

    public void union(int p, int q) { // Union two numbers
        // Get the id of p
        int pid = id[p];
        // get the id of q
        int qid = id[q];
        // iterate through the whole id vector and change the entries with id of p to id of q
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) {
                id[i] = qid;
            }
        }
    }
}
