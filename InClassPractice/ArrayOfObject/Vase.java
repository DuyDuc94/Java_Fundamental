
import java.util.Scanner;

/*
 * DuyDuc94.
 */
public class Vase extends Item{
    private int height;
    private String material;

    public Vase() {}

    public Vase( int value, String creator, int height, String material) {
        super();
        height =0;
        material ="";
    }

    public int getHeight() {
        return height;
    }
    public String getMaterial() {
        return material;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    
    @Override
    public void input(Scanner sc){
        super.input(sc);
        height =Integer.parseInt(sc.next());
        material =sc.next();
    }

    @Override
    public String toString() {
        return super.getValue() + " " + super.getCreator() + "  " + this.height + "    " + this.material;
    }  
}