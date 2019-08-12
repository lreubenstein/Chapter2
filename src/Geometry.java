
public class Geometry {
	private int sides;

	public Geometry() {
		sides = 0;
	}
	
	public void quadrilateral() {
		System.out.println("4 sides.");
	}
	public void rectangle() {
		System.out.println("Rectangle is rad.");
		quadrilateral();
		sides = sides + 4;
	}
	
	public void rhombus() {
		quadrilateral();
		System.out.println("Rhombus is real " + sides);
		sides = sides + 4;
	}
	
	public void triangle() {
		System.out.println("Triangle is tacky.");
		sides = sides + 3;
	}
	
	public void square() {
		rectangle();
		rhombus();
		System.out.println("Square is silly.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Geometry shape = new Geometry();
		System.out.println("Sides " + shape.sides);
		shape.triangle();
		shape.square();
		shape.rhombus();
		System.out.println("Main is done "+ shape.sides);
		

	}

}
