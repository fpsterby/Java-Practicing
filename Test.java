import java.util.*;

public class Test {
    public static void main(String[] args){
        List<String> dog = new ArrayList<String>();
        dog.add("Helo");
        dog.add("Helo");
        List<String> cat = dog;
        cat.remove(1);
        System.out.println(dog.size());
    }
}
