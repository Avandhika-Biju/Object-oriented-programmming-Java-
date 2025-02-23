import java.util.Scanner;
interface Dim {
    double area(int x); 
}

public class LambdaArea {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        Dim square = (x) -> x * x;
        Dim cube = (x) -> 6 * x * x;
        Dim circle = (x) -> 3.14* x * x;
        Dim sphere = (x) -> 4 * 3.14* x * x;
        System.out.println("Enter the value :");
        int n=sc.nextInt();
        System.out.println("Square Area: " + square.area(n));
        System.out.println("Cube Surface Area: " + cube.area(n));
        System.out.println("Circle Area: " + circle.area(n));
        System.out.println("Sphere Surface Area: " + sphere.area(n));
    }
}