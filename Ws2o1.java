import java.util.Scanner;

/*Viết phương thức - method trong Java tính số tien trong tương lai FV theo số tien hiện tại PV, lãi suất I và số năm n như sau:    FV = PV(1+I) mũ n
Viết phương thức main đoc vao PV, I và n và in ra FV với 2 chữ số sau dấu chấm thập phân. */

public class Ws2o1 {

    static double FutureV(int PV, int I, int n){
        return  PV*Math.pow((1+I), n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int PV, I, n;
        PV = sc.nextInt();
        I = sc.nextInt();
        n = sc.nextInt();
        System.out.format("%.2f", FutureV(PV, I, n));
    }
}
