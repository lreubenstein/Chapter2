
public class Rhyme {
	private int count;

	public Rhyme() {
		// TODO Auto-generated constructor stub
		count = 0;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void oneTwo()
	{
		System.out.println("Buckle my Shoe");
		count = count + 1;
		System.out.println("Count is " + count);
	}
	
	public void threeFour()
	{
		count = count + 1;
		System.out.println("Shut the door");
		oneTwo();
	}
	
	public void fiveSix()
	{
		threeFour();
		count = count + 2;
		System.out.println("Pick up sticks");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rhyme r1 = new Rhyme();
		r1.threeFour();
		r1.oneTwo();
		r1.fiveSix();
		System.out.println("Final count = " + r1.getCount());

	}

}
