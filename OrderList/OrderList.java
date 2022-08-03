import java.util.ArrayList;


public class Order {
    //Member vars
    public String name; //Defaults for the 3 are, null, 0 and false
    public double total;
    public boolean ready;

    public ArrayList<Item> items = new ArrayList<Item>();
}