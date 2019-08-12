
public class Basic {
	private double weight;
	private String name;
	
	public Basic()	//default constructor
	{
		int a = 0;  //local variable this goes away after constructor
		// initialize all attributes
		weight=a;
		name = "";
	}
	public Basic(double w, String n)
	{
		weight = w;
		name = n;
	}
	
	public String toString()
	{
		String s = "Basic instance with weight = " + weight + " name is " + name;
		return s;
	}
	
	public void gainWeight(double w)
	{
		weight = weight + w;
		// weight += w; is the same
	}
	
	public double getWeightTimes2()
	{
		double x = weight*2;
		return x;
		// return weight*2
	}
	public void doubleWeight()
	{
		double x= getWeightTimes2();
		weight = x;
	}
	public static void main(String[] args) {
		//create instances of Basic
		Basic b1 = new Basic();
		Basic b2 = new Basic(50, "Steve");
		
		b2.gainWeight(10);
		double ww = b2.getWeightTimes2();
		
		Basic b3 = new Basic(ww, "Fred");
		
		b3.doubleWeight();

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		

	}

}
