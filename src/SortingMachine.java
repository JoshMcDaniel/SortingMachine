import java.util.ArrayList;

public class SortingMachine {

    private static int fruitCount = 0;
    private static int vegetableCount = 0;

    //Constructor to accept arrayList of food for calculation
    SortingMachine(ArrayList<String> food) {
        for (String aFood : food) {
            if (aFood.equalsIgnoreCase("fruit")) {
                fruitCount++;
            } else if (aFood.equalsIgnoreCase("vegetable")) {
                vegetableCount++;
            }
        }
    }

    int getFruits() {
        return fruitCount;
    }
    int getVegetables() {
        return vegetableCount;
    }
}