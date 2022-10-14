
import java.util.Scanner;

/*
 * DuyDuc94.
 */
public class Statue extends Item{
    private int weight;
    private String colour;

    public Statue() {}

    public Statue(int value, String creator, int weight, String colour) {
        super();
        weight =0;
        colour ="";
    }

    public int getWeight() {
        return weight;
    }
    public String getColour() {
        return colour;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public void input(Scanner sc){
        super.input(sc);
        weight =Integer.parseInt(sc.next());
        colour =sc.next();
    }

    @Override
    public String toString() {
        return super.getValue() + " " + super.getCreator() + "  " + weight + "    " + colour;
    }
}
