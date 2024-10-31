public class Player {
    public int id;
    public String name;
    public int currPosition;
    static int count = 0;

    Player(String name){
        this.name = name;
        currPosition = 0;
        id = count++;
    }
}
