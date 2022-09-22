import java.util.Scanner;

//Write a Java program to find the number of even and odd integers in a given array of integers.


class Ws2o5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int odd=0, even=0;
        for(int x : arr){
            if(x%2==1) odd+=1;
            else even+=1;
        }
        System.out.println(even + " " + odd);
    }
}