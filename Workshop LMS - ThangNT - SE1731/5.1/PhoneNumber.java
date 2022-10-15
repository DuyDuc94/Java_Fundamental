
import java.util.Scanner;

/*
 * DuyDuc94.
 */

public class PhoneNumber{
    private int areaCode;
    private String number;

    public PhoneNumber() {}

    public PhoneNumber(int areaCode, String number) {
        this.areaCode = areaCode;
        this.number = number;
    }

    public int getAreaCode() {
        return areaCode;
    }
    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    
    @Override
    public String toString() {
        return areaCode + " - " + number;
    }
    
    public PhoneNumber inputData(Scanner sc){
//        System.out.println("Enter area code: ");
        int areaCode_local = Validation.sc.nextInt();
//        System.out.println("Enter number: ");
        Validation.sc.nextLine();
        String number_local = Validation.sc.nextLine();//Validation.checkInputPhone();
        PhoneNumber result = new PhoneNumber(areaCode_local, number_local);
        return result;
    }
    
    public void display(){
        System.out.println("Area code: " + areaCode);
        System.out.println("Phone number: " + number);
    }
}