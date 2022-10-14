
import java.util.Scanner;

/*
 * DuyDuc94.
 */
public class Painting extends Item{
    private int height;
    private int width;
    private boolean isWaterColour;
    private boolean isFramed;

    public Painting() {}
    
    public Painting(int value, String creator, int height, int width, boolean isWaterColour, boolean isFramed) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWaterColour = isWaterColour;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public boolean isIsWaterColour() {
        return isWaterColour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setIsWaterColour(boolean isWaterColour) {
        this.isWaterColour = isWaterColour;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }

    @Override
    public void input(Scanner sc){
        super.input(sc);
        height =Integer.parseInt(sc.next());
        width =Integer.parseInt(sc.next());
        isWaterColour =sc.nextBoolean();
        isFramed =sc.nextBoolean();
    }

    @Override
    public String toString() {
        return super.getValue() + " " + super.getCreator() + "  " + height + "    " + width + "    " + isWaterColour + "    " + isFramed;
    }
}
