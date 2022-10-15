/*
 * DuyDuc94.
 */
class PhoneNumberDriver{
    public static void main(String[] args) {
        // TODO code application logic here
        PhoneNumber[] phoneList = new PhoneNumber[1];
        int i = 0;
        Validation.sc.nextInt();
//        System.out.println("Type of phone number - 1. Local phone;" + " - 2. Inter phone - 0. Exit");
        int typeOfPhone = Validation.sc.nextInt();
        Validation.sc.nextLine();
        if(typeOfPhone ==1){
            PhoneNumber phone = new PhoneNumber();
            phoneList[i] = phone.inputData(Validation.sc);
            System.out.println("Add local phone number successfully!");
            phoneList[i].display();
            i++;
        } else if(typeOfPhone ==2){
            IntPhoneNumber phone = new IntPhoneNumber();
            phoneList[i] = phone.inputData(Validation.sc);
            System.out.println("Add inter phone number successfully!");
            phoneList[i].display();
            i++;
        }else if(typeOfPhone ==0){
//            return;
        }
        
//        System.out.println("List of phone number");
//        for (int j = 0; j < i; j++) {
//            phoneList[j].display();
//        }
    }
}