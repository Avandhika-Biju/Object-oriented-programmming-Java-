class Area
{
    public int area(int l,int b)
    {
        return l*b;
    } 
    public double area(double l,double b)
    {
        return l*b;
    }
    public int area(int side)
    {
        return side*side;
    }
    public double area(double side)
    {
        return side*side;
    }
    public double area(double pi,double radius)
    {
        return pi*radius*radius;
    }
    public double area(double d,double base,double height)
    {
        return d*base*height;
    }
}

class ShapesDemo {
    public static void main(String [] args) {
        Area a = new Area();
        double d=0.5,pi=.314;
        System.out.println("Area of rectangle=" +a.area(5,6));
        System.out.println("Area of rectangle=" +a.area(5.2,6.3));
        System.out.println("Area of square=" +a.area(5));
        System.out.println("Area of square=" +a.area(5.5));
        System.out.println("Area of circle=" +a.area(pi,3.3));
        System.out.println("Area of triangle=" +a.area(d,4.2,2.1));

        
        
}
}