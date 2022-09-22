import java.util.Scanner;

//Compute the average of three numbers.

public class Ws2o6 {
    static double averageNum(int... arr){
        int sum =0, count =0;
        for(int x : arr){
            sum += x;
            count += 1;
        }
        return sum/count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.format("%.2f", averageNum(a, b, c));
    }
}
