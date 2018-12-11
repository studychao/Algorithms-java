/* *****************************************************************************
 *  Name:
 *  Date:
 *  Description:
 **************************************************************************** */

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
public class PercolationStats {
    private double[] opensites;
    private int trials;
    public PercolationStats(int n, int trials){
        this.trials = trials;
        opensites = new double[trials];
        for ( int i = 0; i<trials ; i++){

            Percolation a = new Percolation(n);
            while (!a.percolates()){
                int row = StdRandom.uniform(1,n+1);
                int col = StdRandom.uniform(1,n+1);
                if (!a.isOpen(row,col)) {
                    a.open(row, col);
                }
            }
            opensites[i] = (double)a.numberOfOpenSites()/(n*n);
        }

    }
    public double mean(){
        return StdStats.mean(opensites);
    }
    public double stddev(){
        return StdStats.stddev(opensites);
    }
    public double confidenceLo(){
        return mean()-1.96*Math.sqrt(stddev())/Math.sqrt(trials);

    }
    public double confidenceHi(){
        return mean()+1.96*Math.sqrt(stddev())/Math.sqrt(trials);

    }
    public static void main(String[] args) {
        PercolationStats a = new PercolationStats(200,100);
        System.out.print("means=                    " + a.mean());
        System.out.print("\nstddev=                 " + a.stddev());
        System.out.print("\n95% confidence interval=["+a.confidenceLo()+","+a.confidenceHi()+"]");


    }
}
