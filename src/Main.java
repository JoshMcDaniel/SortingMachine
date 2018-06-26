
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//      Sally goes out each weekend to pick
//      fruit and vegetables from her garden.
//      She carries a basket with her,
//      reaches her hand out(Scanner or ArrayList) to the various fruits and vegetables,
//      and places them into the basket(ArrayList).
//      Sally wants to be able to dump the contents of the basket
//      into a sorting machine that will
//      separate the fruits from the vegetables.
//      Can you design the software for a machine that Sally can use
//      to sort fruits from vegetables and then
//      print the sum of either fruits or vegetables in O(1) time?


        //Test input values.
        ArrayList<String> food;
        {
            food = new ArrayList<String>() {{
                add("Strawberry");
                add("Broccoli");
                add("Apple");
                add("Carrot");
                add("Apple");
                add("Strawberry");
                add("Pea");
            }};
        }

        //Instantiate classes.
       Fruits fruitObj = new Fruits();
        Vegetables vegetableObj = new Vegetables();

        //Loops through food array list and compares to values within Fruits & Vegetables String arrays.
        for (String aFood : food) {
            //Loops through Fruit String array.
            for (String fruitName : fruitObj.getName())
                if (aFood.equalsIgnoreCase(fruitName)) {
                    fruitObj.incFruitCount();
                }
            //Loops through Vegetables String array.
            for (String vegName : vegetableObj.getName()) {
                if (aFood.equalsIgnoreCase(vegName)) {
                    vegetableObj.incVegCount();
                }
            }
        }

        System.out.println("Number of Fruits: " + fruitObj.getFruitCount());
        System.out.println("Number of Vegetables: " + vegetableObj.getVegetableCount());

    }
}
