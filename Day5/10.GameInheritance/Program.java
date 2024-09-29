class Game{
    public String Name;
    public int MaxNumPlayers;
    public Game(String name, int maxNumPlayers) {
        Name = name;
        MaxNumPlayers = maxNumPlayers;
    }

    @Override
    public String toString() {
        return "Maximum number of players for " + Name + " is " + MaxNumPlayers;
    }
}
class GameWithTimeLimit extends Game{
    public int TimeLimit;

    public GameWithTimeLimit(String name, int maxNumPlayers,int TimeLimit) {
        super(name, maxNumPlayers);
        this.TimeLimit=TimeLimit;
    }

    @Override
    public String toString() {
        return "Maximum number of players for " + Name + " is " + MaxNumPlayers+"\n"+
                "Time Limit for "+Name+" is "+TimeLimit+" minutes";
    }
}
public class Program {

    public static void main(String[] args) {
        Game obj=new Game("Cricket",11);
        GameWithTimeLimit obj1=new GameWithTimeLimit("Football",11,90);
        System.out.println(obj.toString());
        System.out.println(obj1.toString());

    }
}

