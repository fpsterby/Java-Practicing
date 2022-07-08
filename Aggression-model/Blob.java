public class Blob {
    
    private Food Meal;

    public boolean setMeal(Food meal) {
        if (Meal != null){
            Meal = meal;
            return this.Meal.addOccupier(this);
        } else {
            return false;
        }
    }

    public Food getMeal(){
        return this.Meal;
    }
    public void clearMeal(){
        this.Meal = null;
    }
}