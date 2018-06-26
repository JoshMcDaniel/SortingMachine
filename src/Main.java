
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

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
