public class Circle {
    static final double PI = 3.14;
    double radius;
    String color;
    public Circle(double radius, String color)
    {
        this.radius=radius;
        this.color=color;
    }
    public double CalculateArea()
    {
        return PI*radius*radius;
    }
    public String toString()
    {
        return "Color: "+color+" PI: "+PI+" Radius: "+radius+" Area: "+CalculateArea();
    }
}
