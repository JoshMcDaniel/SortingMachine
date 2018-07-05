
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Instantiate classes.
        Fruits fruitObj = new Fruits();
        Vegetables vegetableObj = new Vegetables();
        final Object apple = new Apple();
        final Object strawberry = new Strawberry();
        final Object watermelon = new Watermelon();
        final Object broccoli = new Broccoli();
        final Object carrot = new Carrot();
        final Object pea = new Pea();

        //Test input Object values.
        ArrayList<Object> food;
        {
            food = new ArrayList<Object>() {{
                add(apple);
                add(strawberry);
                add(watermelon);
                add(broccoli);
                add(carrot);
                add(pea);
                add(apple);
            }};
        }

        for (Object aFood : food) {
            if (aFood instanceof Fruits) {
                fruitObj.incFruitCount();
            } else if (aFood instanceof Vegetables) {
                vegetableObj.incVegCount();
            }
        }

        System.out.println("Number of Fruits: " + fruitObj.getFruitCount());
        System.out.println("Number of Vegetables: " + vegetableObj.getVegetableCount());

    }
}
