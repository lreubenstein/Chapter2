
public class Car {
	String color;
	String make;
	String model;
	String type;
	int	year;
	double gasInTank;
	double capacity;
	double mileage;
	
	public Car(String col, String ma, String mod, String ty, 
			int y, double c)
	{
		color = col;
		make = ma;
		model = mod;
		type = ty;
		year = y;
		capacity = c;
		gasInTank = 0.0;
		mileage = 0.0;
		
	}
	public void playMusic()
	{
		System.out.println("Tra la la");
	}
	public double addGas(double gal)
	{
		gasInTank+= gal;
		return gasInTank;
	}
	public void fillTank()
	{
		gasInTank = capacity;
	}
	public double drive(double miles)
	{
		mileage = mileage + miles;
		double gasUsed = miles/20.0;  // assuming 20 mpg
		gasInTank -= gasUsed;
		return mileage;
	}
	public String toString()
	{
		String output = "My car is a " + color + " " + make + ", " + model + " " + type + ".\n";
		output += "It has " + " " + mileage + " miles and " + gasInTank + " gallons in the tank.";
		return output;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("red","Honda","CRV","convertible", 2014, 15.0);
		System.out.println(c1);
		c1.fillTank();
		c1.playMusic();
		c1.drive(20);
		System.out.println(c1);
		c1.drive(100);
		System.out.println(c1);
		System.out.println("this in information about my car" + c1);

	}

}
