public class Player {
    private String name;
    private int boardPos;

    public Player(String n)
    {
        name = n;
        boardPos = 0;			// all players start at the beginning
    }
    public int getPos()			// returns the current position of the player
    {	return boardPos;	}
    public void setPos(int pos)	// updates the position of the player
    {	boardPos = pos;		}
    public String getName()
    {	return name;		}

}
