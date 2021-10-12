public class Game {
    private Player player1;
    private Player player2;
    private Player whoseTurn;
    private int numSpaces;		// size of game board

    public Game(String n1, String n2)
    {
        player1 = new Player(n1);
        player2 = new Player(n2);
        whoseTurn = player1;
        numSpaces = 100;
    }
    public Player switchTurns()	//changes value of the whoseTurn attribute
    {
        if (whoseTurn==player1)
            whoseTurn = player2;
        else
            whoseTurn = player1;
        return whoseTurn;
    }

    public int rollDice()		// simulates rolling 2 dice returns an int
    {
        int d1 = (int)(Math.random() * 6);
        int d2 = (int)(Math.random() * 6);
        return d1+d2;
    }

    public void move(){
        int d = rollDice();
        whoseTurn.setPos(whoseTurn.getPos()+d);
        switchTurns ();
    }

}
