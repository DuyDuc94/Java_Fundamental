//Solve quadratic equations (use if, else if and else). Phuong trinh Bac hai.

import java.util.Scanner;

public class Ws2o8 {

    static void quadraticEquations(int a, int b, int c){
        double delta = Math.pow(b, 2) - 4*a*c;
        double x1, x2;
        if(delta<0) System.out.println("The equation has no real root.");
        else if(delta>0){
            x1 = (-b - Math.sqrt(delta)) / 2*a; x2 = (-b + Math.sqrt(delta)) / 2*a;
            System.out.format("%.2f %.2f", x1, x2);
        }else{
            x1 = x2 = (-b) / 2*a;
            System.out.format("%.2f %.2f", x1, x2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        quadraticEquations(a, b, c);
    }
}
