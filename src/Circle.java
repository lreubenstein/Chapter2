public class Circle {
    private double radius;

    public Circle(double r) {
        // TODO Auto-generated constructor stub
        radius=r;
    }

    public double area()
    {
        double a= Math.PI*radius*radius;
        return a;
    }

    public double circ()
    {
        double c = 2*Math.PI*radius;
        return c;
    }
}
