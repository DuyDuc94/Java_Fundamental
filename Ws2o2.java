/* PASSWORD PROBLEM
Check whether a string is a valid password.
Password rules:
    A password must have at least ten characters.
    A password consists of only letters and digits.
    A password must contain at least two digits.*/
import java.util.Scanner;

public class Ws2o2 {

    static boolean validPass(String pass){
        int checkNum = 0;
        //Kiểm tra độ dài
        if(pass.length() < 10 || pass == null) return false;
        //Kiểm tra kí tự
        for(int i=0; i<pass.length(); i++){
            //Kiểm tra nếu không là số và chữ
            if(!Character.isLetterOrDigit(pass.charAt(i))) return false;
            //Dếm số trong pass
            if(Character.isDigit(pass.charAt(i))) checkNum += 1;
        }
        //Pass có ít hơn 2 digits
        if(checkNum<2) return false;
        //Nếu vượt qua test
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass = sc.nextLine();
        // System.out.println(validPass(pass));
        if(validPass(pass)) System.out.println("valid password");
        else System.out.println("invalid password");
    }
}
