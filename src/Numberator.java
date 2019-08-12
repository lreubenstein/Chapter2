
public class Numberator {

	private int number;
	
	public Numberator(int num)
	{
		number = num;
	}
	public int multiplier(int num)
	{
		int res = num*number;
		return res;
	}
	public int adder(int num)
	{
		int res = num+number;
		return res;
	}
	
	public int getNumber()
	{
		return number;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numberator n1 = new Numberator(4);
		System.out.println(n1.getNumber() + " * " + "8 = " + n1.multiplier(8) );
		System.out.println(n1.getNumber() + " + " + "5 = " + n1.adder(5) );


	}

	
}
