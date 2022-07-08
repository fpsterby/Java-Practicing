public class Blob {
    
    private Food Meal;

    public boolean setMeal(Food meal) throws Exception{
        if (Meal != null){
            Meal = meal;
            if (this.Meal.addOccupier(this) == false){
                throw new Exception();
            }
            return true;
        } else {
            return false;
        }
    }

    public void clearMeal(){
        this.Meal = null;
    }
}