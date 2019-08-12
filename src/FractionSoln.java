
public class FractionSoln {
	private int numerator;
	private int denominator;
	
	// constructor
	public FractionSoln(int n, int d)
	{
		numerator = n;
		denominator = d;
	}
	
	public FractionSoln()
	{
		numerator = 0;
		denominator = 1;
	}
	public int getNum()
	{
		return numerator;
	}
	public int getDenom()
	{
		return denominator;
	}
	public String toString()
	{
		String output = numerator + "/" + denominator;
		return output;
	}
	public FractionSoln add(FractionSoln f)
	{
		int n = numerator*f.getDenom() + denominator*f.getNum();
		int d = denominator * f.getDenom();
		
		FractionSoln result = new FractionSoln(n,d);
		return result;
	}
	
	// TODO  subtract()
	public FractionSoln subtract(FractionSoln f)
	{
		int n = numerator*f.getDenom() - denominator*f.getNum();
		int d = denominator * f.getDenom();
		
		FractionSoln result = new FractionSoln(n,d);
		return result;
	}
	
	// TODO multiply()
	public FractionSoln multiply(FractionSoln f)
	{
		int n = numerator*f.getNum();
		int d = denominator * f.getDenom();
		
		FractionSoln result = new FractionSoln(n,d);
		return result;
	}
	
		
	public FractionSoln reciprocal()
	{
		FractionSoln result = new FractionSoln(denominator, numerator);
		return result; 
		
	}
	public static void main(String[] args) {
		FractionSoln f1 = new FractionSoln(3,4);
		FractionSoln f2 = new FractionSoln(4,5);
		
		FractionSoln f3 = f1.add(f2);
		System.out.println(f1 + " + " + f2 + " = " + f3);
			
		FractionSoln f4 = f1.subtract(f2);
		System.out.println(f1 + " - " + f2 + " = " + f4);
		
		FractionSoln f5 = f1.multiply(f2);
		System.out.println(f1 + " * " + f2 + " = " + f5);
		
		System.out.println(f1.reciprocal());
		
		
	}

}
