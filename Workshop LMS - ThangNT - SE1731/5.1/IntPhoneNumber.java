
import java.util.Scanner;

/*
 * DuyDuc94.
 */

class IntPhoneNumber extends PhoneNumber{
    private String countryCode;

    public IntPhoneNumber() {
        super();
    }
    public IntPhoneNumber(int areaCode, String number){
        super(areaCode, number);
    }
    public IntPhoneNumber(int areaCode, String number, String countryCode) {
        super(areaCode, number);
        this.countryCode = countryCode;
    }

    public String getCountryCode() {
        return countryCode;
    }
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public String toString() {
        return countryCode + " - " + super.toString();
    }
    
    @Override
    public IntPhoneNumber inputData(Scanner sc){
//        System.out.println("Enter country code: ");
        String ctC = Validation.sc.nextLine();//Validation.checkInputPhone();
        PhoneNumber result = super.inputData(sc);
        IntPhoneNumber result1 = new IntPhoneNumber(result.getAreaCode(), result.getNumber(), ctC);
        return result1;
    }
    
    @Override
    public void display(){
        super.display();
        System.out.println("Country code: " + this.countryCode);
    }
}
