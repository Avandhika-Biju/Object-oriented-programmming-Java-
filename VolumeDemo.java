class Volumes{
    public double volume(double l)
    {
       return l*l*l;
    }
    public double volume(double l,double b,double h)
    {
       return l*b*h;
    }
    public double volume(double r,String shape)
    {
       return (4.0/3.0)*3.14*r*r*r;
    }
    public double volume(double r,double h,String shape)
    {
        return 3.14*r*r*h;
    }public double volume(double r,double h)
    {
       return (1.0/3.0)*3.14*r*r*h;
    }

}
public class VolumeDemo{
    public static void main(String [] args){
        Volumes v = new Volumes();
        System.out.println("Volume of Cube"+" "+v.volume(4.2));
        System.out.println("Volume of Cuboid"+" "+v.volume(4.2,5.6,6.7));
        System.out.println("Volume of Sphere"+" "+v.volume(4.2,"Sphere"));
        System.out.println("Volume of Cylinder"+" "+v.volume(4.2,3.4,"Cylinder"));
        System.out.println("Volume of cone"+" "+v.volume(4.2,1.2));
    }
}