import java.util.Scanner;

public class Ws2o4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Function 1");
                break;
            case 2:
                System.out.println("Function 2");
                break;
            case 3:
                System.out.println("Function 3");
                break;
            default:
                System.out.println("Invalid selection");
                break;
        }
    }
}
