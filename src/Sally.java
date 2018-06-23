import java.util.ArrayList;

public class Sally {

    private static int fruitCount = 0;
    private static int vegetableCount = 0;

    //Constructor to accept arraylist of food for calculation
    Sally(ArrayList<String> food) {
        for (String aFood : food) {
            if (aFood.equals("fruit")) {
                fruitCount++;
            }
        }
        for (String aFood : food) {
            if (aFood.equals("vegetable")) {
                vegetableCount++;
            }
        }
    }

    //Blank Constructor
    public Sally() {
    }

    int getFruits() {
        return fruitCount;
    }

    int getVegetables() {
        return vegetableCount;
    }
}