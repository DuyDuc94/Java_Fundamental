
import java.util.Scanner;


/*
 * DuyDuc94.
 */
public class ItemList {
    Item list[];
    int numOfItem;
    final int MAX =100;

    public ItemList() {
        list =new Item[MAX];
        numOfItem =0;
    }
    
    public boolean addItem(Item item){
        if(item ==null || numOfItem >=MAX) return false;
        list[numOfItem] =item;
        numOfItem++;
        return true;
    }
    
    public void displayAll(){
        if(numOfItem ==0) System.out.println("the list is empty");
        for (int i =0; i <numOfItem; i++) {
            System.out.println(list[i]);
        }
    }
    
    public Item findItem(String creator){
        for (int i =0; i <numOfItem; i++) {
            if(list[i].getCreator().equals(creator)) return list[i];
        }
        return null;
    }
    
    public int findItemIndex(String creator){
        for(int i =0; i <numOfItem; i++){
            if(list[i].getCreator().equals(creator)) return i;
        }
        return -1;
    }
    
    public boolean updateItem(int index, Scanner sc){
        if( index >= 0 && index < numOfItem){
            list[index].input(sc);
            return true;
        }
        return false;
    }
    
    public boolean removeItem(int index){
        if( index >= 0 && index < numOfItem){
            for(int j =index; j <numOfItem; j++ ){
                list[j]=list[j+1];
            }
            numOfItem --; 
            return true;
        }
        return false;
    }
    
    public void sortValue(){
        Item temp;
        for (int i =0; i <numOfItem; i++) {
            for (int j =i; j <numOfItem; j++) {
                if(list[j].getValue() < list[i].getValue()){
                    temp = list[j];
                    list[j] = list[i];
                    list[i] = temp;
                }
            }
        }
    }
    
    public Item showObj(String signature){
        for (int i =0; i <numOfItem; i++) {
            //...Developing
            if(list[i] instanceof Statue) return list[i];
        }
        return null;
    }
}   
