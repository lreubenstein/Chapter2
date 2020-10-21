public class Cylinder {
    private double height;
    private Circle base;

    public Cylinder(double rad, double hi)
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
        //return 2*base.area()+base.circ()*height;
        double s = (2 * base.circ() +(2 * base.area()));
        return s;

    }
}
