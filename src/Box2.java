

public class Box2 {		
	private double height;		
	private double width;	private double length;	private int numberOnions;
private String color;	private Boolean hasALid;	public Box2(double h, double w, double l, String c, Boolean lid) {		// constructor
height = h;	width = w;	length = l;	color = c;
		hasALid = lid;		numberOnions = 0;
		System.out.println("constructing a box");	}
	public Box2() { 		height = 1.0;
width = 1.0;	length = 1.0;	color = "purple";
		hasALid = false;		numberOnions = 0;	
		System.out.println("default constructor");}
	
	public double volume() {double vol = length*width*height;return vol;	}
public void addOnions(int num) {	numberOnions = numberOnions + num;	}
	public int howManyOnions() {	
return numberOnions;	}
	public double getHeight() {		return height;
}	public void changeHeight(double h) {
		height = h;}
public String toString() {
String s = "a box with length " + length +" width " + width +	" height " + height + " with "+ numberOnions +" onions.";
return s;	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box2 box1 = new Box2(4.5,3.0,2.5,"orange",true);  // create an instance of Box
		Box2 box2 = new Box2();							// create another instance of Box
		box1.addOnions(5);			// call a method with first box
		box1.addOnions(6);
		int x = box1.howManyOnions();
		System.out.println("Box 1 has " + x + " onions.");
		System.out.println(box1);		// print the box - this calls toString()
		System.out.println("volume of box1 is " + box1.volume());
		// change the height
		box1.changeHeight(10.0);
		double v = box1.volume();
		System.out.println("new volume of box1 is " + v);
		// call a method with second box
		System.out.println("the volume of our default box is "+ box2.volume());  

	}

}
