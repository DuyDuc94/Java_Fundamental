
import java.util.Scanner;

/*
 * DuyDuc94.
 */
public class Validation {
    public static final Scanner sc = new Scanner(System.in);
    private static final String VALID_PHONE = "[0-9]{3}[-][0-9]{3}[-][0-9]{4}";
    
    public static String checkInputString(){
        String result;
        while (true) {            
            result = sc.nextLine().trim();
            if(result.isEmpty()){
                System.err.println("Not empty");
                System.out.print("Stop");
            }else return result;
        } 
    }
    
    public static String checkInputPhone(){
        String result;
        while (true) {            
            result = checkInputString();
            if(result.matches(VALID_PHONE)) return result;
            System.out.println("Please input Phone flow\n" + "• 123-456-7890 \n");
            System.out.print("Stop");
        }
    }
}
