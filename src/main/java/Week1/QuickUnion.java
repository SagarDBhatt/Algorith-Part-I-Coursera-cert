package Week1;

import java.util.Scanner;

public class QuickUnion {

    /**
     * Set id of each object to itself. (N array access)
     */
    private int[] id;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the object size = ");
        int n = sc.nextInt();

        QuickUnion obj = new QuickUnion(n);
        obj.union(2,4);
        System.out.println(obj.isConnected(2,4));
        System.out.println(obj.root(2) + " -- " + obj.root(3));
        System.out.println(obj.isConnected(2,3));
    }

    /**
     * Creating int array with given size
     * @param n : provide the size of array
     */
    public QuickUnion(int n){
        id = new int[n];
        for(int i = 0; i < n; i++)
            id[i] = i;
    }

    public int root(int n){
        while(n != id[n]) {
            n = id[n];
        }
        return n;
    }

    public void union(int p, int q){
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }

    public boolean isConnected(int p, int q){
        if (root(p) == root(q))
            return true;
        else
            return false;
    }
}
