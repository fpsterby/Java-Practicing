import java.util.ArrayList;
import java.util.List;

public class Food {
    private List<Blob> Occupiers = new ArrayList<Blob>();

    public boolean addOccupier(Blob blob){
        Occupiers.add(blob);
        if(Occupiers.size() < 2){
            Occupiers.add(blob);
            return true;
        } else {
            return false;
        }
    }

    public int getNumberOfOccupiers(){
        return Occupiers.size();
    }

    public void clearOccupiers(){
        Occupiers.clear();
    }
}