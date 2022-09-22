/*Write a Rectangle class to represent rectangles, with two data fields (width, height) and four methods
(input data, display data, calculate and return area, calculate and return perimeter). Write another class
to test all methods of the Rectangle class. */

import java.util.Scanner;

class Rectangle {
    private static Scanner sc = new Scanner(System.in);
    private double width, height;
    
    public double caculateArea(double width, double height){
        return width*height;
    }
    public double caculatePerimeter(double width, double height){
        return (width+height)*2;
    }
    public void display(){
        System.out.println("Area of rectangle is: " + caculateArea(width, height));
        System.out.println("Perimeter of rectangle is: " + caculatePerimeter(width, height));
    }
    public void input() {
        //System.out.println("enter width");
        width = sc.nextDouble();
        // System.out.println("enter height");
        height = sc.nextDouble();
    }
}

public class Ws3o3{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.input();
        rectangle.display();
    }
}

