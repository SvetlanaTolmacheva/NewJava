package com.max.idea;

public class Array {

    public static void main(String[] args) {

        int[] n = {1, 2, 5, 6, 8};

        int n1 = n[0];
        int n2 = n[n.length - 1];

        n[0] = n2;
        n[n.length - 1] = n1;

        if (n.length%2 == 0) {
            System.out.println(n[0] + n[n.length / 2 - 1]);
        } else {
            System.out.println(n[0] + n[n.length / 2]);
        }

        }
}

