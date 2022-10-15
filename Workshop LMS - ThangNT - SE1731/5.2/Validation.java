
import java.util.Scanner;

/*
 * DuyDuc94.
 */
public class Validation {
    private final static Scanner sc = new Scanner(System.in);
    
    public static String checkInputString() {
        sc.nextLine();
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            }else {
                return result;
            }
        }
    }
    
    public static double checkInputDouble() {
        while (true) {            
            double result = Double.parseDouble(sc.nextLine());
            //if(//...){}
            return result;
        }
    }
}
