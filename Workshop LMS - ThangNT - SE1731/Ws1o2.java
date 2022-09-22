import java.util.Scanner;

//Nhập vào bán kính hình tròn => In ra chu vi, diện tích của hình tròn( lấy tới chữ số thập phân thứ 2).

//Lấy hằng số PI: Math.PI
//format định dạng như C. %.2f: lấy tới chữ số thập phân thứ 2.

public class Ws1o2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double area = Math.PI *(radius*radius);
        double perimeter = Math.PI *2*radius;
        System.out.format("%.2f %.2f", area, perimeter);
    }
}