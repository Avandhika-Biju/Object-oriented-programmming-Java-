class Display {
    public void area(int l, int b) {
        System.out.println("Area of Rectangle (int) is " + (l * b));
    }

    public void area(double l, double b) {
        System.out.println("Area of Rectangle (double) is " + (l * b));
    }

    public void area(int side) {
        System.out.println("Area of Square (int) is " + (side * side));
    }

    public void area(double side) {
        System.out.println("Area of Square (double) is " + (side * side));
    }

    
    public void area(double radius, String shape) {
        if ("circle".equals(shape)) {
            System.out.println("Area of Circle (double) is " + (Math.PI * radius * radius));
        }
    }

    public void area(double base, double height, String shape) {
        if ("triangle".equals(shape)) {
            System.out.println("Area of Triangle (double) is " + (0.5 * base * height));
        }
    }
}

public class Area {
    public static void main(String[] args) {
        Display a = new Display();
        
  
        a.area(10, 20);    
        a.area(10.5, 20.5); 
        
       
        a.area(5);         
        a.area(5.5);       
        
       
        a.area(7.5, "circle"); 
        
       
        a.area(10.0, 15.0, "triangle"); 
    }
}