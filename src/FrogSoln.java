
public class FrogSoln {
	private String name;
	private int xPos;
	private int yPos;
	
	public FrogSoln(String n,int x, int y)
	{
		name = n;
		xPos=x;
		yPos=y;
		System.out.println(name);
	}
	public void setPos(int x, int y)
	{
		xPos = x;
		yPos = y;
	}
	public int getXPos()
	{
		return xPos;
	}
	public int getYPos()
	{
		return yPos;
	}
	public void moveWest()
	{
		xPos = xPos-1;
	}
	public void moveEast()
	{
		xPos = xPos + 1;
	}
	public void moveNorth()
	{
		yPos=yPos+1;
	}
	//TODO jump method move up and to the right
	public void jump(int howMany)
	{
		xPos = xPos + howMany;
		yPos = yPos + howMany;
	}
	//TODO visit method moves frog to the location of the friend frog
	public void visit(FrogSoln friend)
	{
		int x = friend.getXPos();
		int y = friend.getYPos();
		xPos = x;
		yPos = y;
		setPos(x,y);
		
	}
	public void eatFly()
	{
		System.out.println("Yum");
	}
	public String toString()
	{
		String s = "Hi I am "+ name +" the frog and I live at "+ xPos + " " + yPos;
		return s; 
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrogSoln f1 = new FrogSoln("Freddy",3,4);
		f1.eatFly();
		f1.moveNorth();
		System.out.println(f1);
		
		FrogSoln f2 = new FrogSoln("Francine", -2,0);
		f2.eatFly();
		f2.jump(2);
		System.out.println(f2);
		f1.visit(f2);
		System.out.println(f1);
		System.out.println(f2);

	}

}

/*  Output
Freddy
Yum
Hi I am Freddy the frog and I live at 3 5
Francine
Yum
Hi I am Freddy the frog and I live at 0 2
Hi I am Francine the frog and I live at 0 2
*/