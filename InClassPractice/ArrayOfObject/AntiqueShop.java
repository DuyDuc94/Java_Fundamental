import java.util.Scanner;

/*
 * DuyDuc94.
 */
public class AntiqueShop{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        ItemList obj =new ItemList();
        
//        System.out.println("1. add a new vase");
//        System.out.println("2. add a new statue");
//        System.out.println("3. add a new painting");
//        System.out.println("4. display all items");
//        System.out.println("5. find the items by the creator ");
//        System.out.println("6. update the item by its index");
//        System.out.println("7. remove the item by its index");
//        System.out.println("8. display the list of vase items ");
//        System.out.println("9. sorts items in ascending order based on their values ");
//        System.out.println("10. exit");
//        System.out.println("input your choice:");
        
        int choice =sc.nextInt();
        
        Item temp;
        temp =new Vase(); temp.input(sc); obj.addItem(temp);
        temp =new Statue(); temp.input(sc); obj.addItem(temp);
        temp =new Painting(); temp.input(sc); obj.addItem(temp);
        
        switch(choice){
            case 1:
                temp =new Vase();	
                temp.input(sc);
                if(obj.addItem(temp)) System.out.println("One vase added");
                obj.displayAll();
                break;
            case 2:
                temp = new Statue();
                temp.input(sc);
                if(obj.addItem(temp)) System.out.println("One statue added");
                obj.displayAll();
                break;
            case 3:
                temp = new Painting();
                temp.input(sc);
                if(obj.addItem(temp)) System.out.println("One painting added");
                obj.displayAll();
                break;
            case 4:
                obj.displayAll();
                break;
            case 5:
                sc.nextLine();
                System.out.println(obj.findItem(sc.nextLine()));
                break;
            case 6:
                sc.nextLine();
                obj.updateItem(sc.nextInt(), sc);
                System.out.println("One item updated");
                obj.displayAll();
                break;
            case 7:
                sc.nextLine();
                obj.removeItem(sc.nextInt());
                System.out.println("One item removed");
                obj.displayAll();
                break;
            case 8:
                sc.nextLine();
                String signature =sc.nextLine();
                System.out.println(obj.showObj(signature));;
                break;
            case 9:
                obj.sortValue();
                obj.displayAll();
                break;
            default:
                //...
                break;
        } //end switch
    } 
}//end AntiqueShop class