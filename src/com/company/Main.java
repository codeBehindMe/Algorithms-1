package com.company;


public class Main {

    public static void main(String[] args) {
        QuickFindUF myQuickFind = new QuickFindUF(100);
        System.out.println(myQuickFind.connected(1,2));
        myQuickFind.union(1,20);
        System.out.println(myQuickFind.connected(1,20));
    }
}