
public class Outputting {

	public static void red()
	{
		System.out.println("red");
		System.out.println("blue");
	}

	public static void green()
	{
		System.out.println("green");
		red();
		System.out.println("done with green");
	}
	
	public static void blue()
	{
		green();
		System.out.println("blue");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		green();
		blue();
		System.out.println("Done");
	}
}
