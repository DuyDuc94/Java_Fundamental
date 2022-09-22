//Sum values of an array.

import java.util.Scanner;

public class Ws2o9 {
    static double sumArray(int a[]){
        double sum =0;
        for(int x : a) sum += x;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];
        for(int i=0; i<size; i++) a[i] = sc.nextInt();
        System.out.format("%.2f", sumArray(a));
    }    
}
