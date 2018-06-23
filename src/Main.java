import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        Sally goes out each weekend to pick
//        fruit and vegetables from her garden.
//        She carries a basket with her,
//        reaches her hand out(SCANNER) to the various fruits and vegetables,
//        and places them into the basket(LIST).
//        Sally wants to be able to dump the contents of the basket
//        into a sorting machine that will
//        separate the fruits from the vegetables.
//        Can you design the software for a machine that Sally can use
//        to sort fruits from vegetables and then
//        print the sum of either fruits or vegetables in O(1) time?

        ArrayList<String> food;
        {
            food = new ArrayList<String>() {{
                add("fruit");
                add("vegetable");
                add("fruit");
                add("vegetable");
                add("vegetable");
                add("fruit");
                add("fruit");
            }};
        }
        //Instantiate Sally class with food arraylist
        Sally m = new Sally(food);

        System.out.println("Number of Fruits: " + m.getFruits());
        System.out.println("Number of Vegetables: " + m.getVegetables());
    }
}
