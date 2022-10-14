
import java.util.Scanner;

/*
 * DuyDuc94.
 */
public class Item {
    protected int value;
    protected String creator;

    public Item(){}
    
    //Không cho phép nhập kiểu (x,y)
    public Item(int value, String creator) {
        value =0;
        creator ="";
    }

    public int getValue() {
        return value;
    }
    public String getCreator() {
        return creator;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public void setCreator(String creator) {
        this.creator = creator;
    }
    
    public void input(Scanner sc){
        value =Integer.parseInt(sc.next());
        creator =sc.next();
    }

    @Override
    public String toString() {
        return value + " " + creator;
    }
}