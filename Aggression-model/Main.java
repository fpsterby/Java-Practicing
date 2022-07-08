import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception{
        //initialisation
        List<Food> foodList = new ArrayList<Food>();
        List<Blob> blobList = new ArrayList<Blob>();
        
        for (int i = 0; i < 64; i++){
            foodList.add(new Food());
            if( i < 8){
                blobList.add(new Blob());
            }
        }

        //execution
        int counter = 0;
        while (counter < 5){ // maybe add a criteria to check that the number of blobs is smaller than the number of food * 2
            //reset round
            ClearRelationships(blobList, foodList);
            AssignFood(blobList, foodList);

            // start round
            for (Food food : foodList) {
                if(food.getNumberOfOccupiers() > 0){
                    // perform calculation
                }
            }
            counter++;
        } 

    }

    public static void AssignFood(List<Blob> blobs, List<Food> food) throws Exception{
        var availableFood = food;
        Random rand = new Random();
        for (Blob blob : blobs) {
            var meal = availableFood.get(rand.nextInt(availableFood.size())); // get a random meal from foodlist which isnt full;
            blob.setMeal(meal);
            meal.addOccupier(blob);
            if(meal.getNumberOfOccupiers() >= 2){
                availableFood.remove(meal);
            }
        }
    }

    public static void ClearRelationships(List<Blob> blobs, List<Food> food) throws Exception{
        for (Food meal : food) {
            meal.clearOccupiers();
        }
        for (Blob blob : blobs) {
            blob.clearMeal();
        }
    }
}