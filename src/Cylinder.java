public class Cylinder {
    private double height;
    private Circle base;

    public Cylinder(double hi, double rad)
    {
        height=hi;
        base= new Circle(rad);

    }

    public double vol()
    {
        double v = height*base.area();
        return v;

    }

    public double sa()
    {
        return 2*base.area()+base.circ()*height;
    }
}
