package Week1;

import java.util.Scanner;

/**
 * This class contains Week1.QuickFindAlgorithm and its illustration to check union and connection operation.
 */

public class QuickFindAlgorithm {
    int[] id;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of object : ");
        int N = sc.nextInt();

        QuickFindAlgorithm obj = new QuickFindAlgorithm(N);
        obj.union(2,5);
        obj.union(0,2);
        System.out.println("2 and 5 = " + obj.isConnected(2,5));
        System.out.println("0 and 5 = " + obj.isConnected(0,5));
    }

    public QuickFindAlgorithm(int n){
        id = new int[n];

        for(int i = 0; i < id.length; i++){
            id[i] = i;
        }
        for (int p : id){
            System.out.println("Value = " + p);
        }
    }

    public void union(int p, int q){
        int pid = id[p];
        int qid = id[q];
        //pid = qid;
        //System.out.println("Pid = " + pid + " Qid =" + qid);

        for(int i = 0; i < id.length; i++){
            if(pid == id[i]){
                id[i] = qid;
            }
        }
    }

    public boolean isConnected(int p, int q){
        if(id[p] == id[q])
            return true;
        else
            return false;
    }

}
