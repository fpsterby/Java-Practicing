import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        List<Meal> meals = new ArrayList<Meal>();

        for (int i = 0; i < 64; i++) {
            meals.add(new Meal());

            if (i < 8) {
                animals.add(new Animal());
            }
        }

        int counter = 0;
        while (counter < 12) {
            resetLists(animals, meals);
            assignFood(animals, meals);

            for (Meal meal : meals) {
                switch (meal.getMemberCount()) {
                    case 0:
                        break;
                    case 1:
                        // reproduce
                        animals.add(new Animal());
                        break;
                    case 2:
                        break;
                }
            }

            System.out.println("animals: " + animals.size() + "; meals: " + meals.size());
            counter++;
        }
    }

    public static void resetLists(List<Animal> animals, List<Meal> meals) {
        for (Meal meal : meals) {
            meal.resetMembers();
        }

        for (Animal animal : animals) {
            animal.meal = null;
        }
    }

    public static void assignFood(List<Animal> animals, List<Meal> meals) {
        List<Meal> availableFood = new ArrayList<Meal>(meals);
        Random rand = new Random();
        int offset = 0;

        for (Animal animal : animals) {
            if (availableFood.size() == 0) {
                System.out.println("out of food? ");
                System.exit(1);
            }
            int index = rand.nextInt(availableFood.size());
            Meal meal = meals.get(index + offset);
            animal.setMeal(meal);
            meal.incrementMembers();

            if (meal.getMemberCount() >= 2) {
                availableFood.remove(index);
                offset++;
            }
        }
    }
}
