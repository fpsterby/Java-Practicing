public class Meal {
    private int Members = 0;

    public int getMemberCount(){
        return this.Members;
    }

    public void incrementMembers(){
        this.Members++;
    }

    public void resetMembers(){
        this.Members = 0;
    }
}
