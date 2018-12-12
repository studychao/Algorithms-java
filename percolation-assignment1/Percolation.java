/* *****************************************************************************
 *  Name:
 *  Date:
 *  Description:
 **************************************************************************** */


import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {
    private WeightedQuickUnionUF a;
    private boolean[] aray;
    private int n;
    public Percolation(int n){
       a = new WeightedQuickUnionUF(n*n+2);
       this.n=n;
       aray = new boolean[n*n+2];
       for (int i = 1; i< n*n+1 ; i++){
           aray[i] = false;
       }
       aray[0] = true;
       aray[n*n+1] = true;
    }

    private int array2dto1d(int row,int col){
        if (row <= 0 || row > n){
            throw new IndexOutOfBoundsException("row out of bound");
        }
        if (col <= 0 || col > n){
            throw new IndexOutOfBoundsException("col out of bound");
        }

        return ((row-1)*(n)+col);
    }
    public void open(int row,int col){
        aray[array2dto1d(row,col)] = true;
        if (row == 1) {
            a.union(0,array2dto1d(row,col));
        }
        if (row == n){
           a.union (n*n+1,array2dto1d(row,col)) ;
        }
        if (col!=1 && isOpen(row,col-1)){
            a.union(array2dto1d(row,col),array2dto1d(row,col-1));
        }
        if (row!=1 && isOpen(row-1,col)){
            a.union(array2dto1d(row,col),array2dto1d(row-1,col));
        }
        if (row!=n && isOpen(row+1,col)){
            a.union(array2dto1d(row,col),array2dto1d(row+1,col));
        }
        if (col!=n && isOpen(row,col+1)){
            a.union(array2dto1d(row,col),array2dto1d(row,col+1));
        }
    }
    public boolean isOpen(int row,int col){
        return aray[array2dto1d(row,col)];

    }
    public boolean isFull(int row,int col){
        return a.connected(0,array2dto1d(row,col));
    }
    public int numberOfOpenSites(){
        int count = 0;
        for (int i =1 ; i< n*n+1 ; i ++){
            if (aray[i] == true){
                count++;
            }
        }
        return count;
    }
    public boolean percolates(){
        return a.connected(0, n*n+1);

    }
    public static void main(String[] args) {
        Percolation a =new Percolation(3);
        a.open(1,3);
        System.out.print (a.isOpen(2,1));
        System.out.print (a.isOpen(1,3));
    }
}
