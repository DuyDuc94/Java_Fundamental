import java.util.Scanner;

public class Ws1o1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.next();        //Lấy kí tự cho tới khi gặp kí tự phân cách: space, enter
        String name = sc.nextLine();    //Lấy kí tự cho tới khi gặp enter.
        System.out.println(name);
    }
}
