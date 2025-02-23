import java.util.Scanner;
class Animal
{
    private String species;
    int age;
    double weight;
    protected String color;
    public Animal(String s,int a,float w,String c)
    {
        species=s;
        age=a;
        weight=w;
        color=c;
    }
    public void display()
    {
        System.out.println(age+" years old "+color+" "+species+" with "+weight+" kg");
    }
}
class Dog extends Animal
{
private String owner;
private String name;
public Dog(String s,int a,float w,String c,String o,String n)
{
super(s,a,w,c);
owner=o;
name=n;
}
public void display()
{
    super.display();
    System.out.println(name+" is "+" owned by "+owner);
}
}
class Cat extends Animal
{
    int tail;
    String eye;
    String name;
    public Cat(String s,int a,float w,String c,int t,String e,String n)
    {
      super(s,a,w,c);
      tail=t;
      eye=e;
      name=n;
    }
    public void display()
    {
        super.display();
        System.out.println(name+" has "+tail+" cm long tail and "+eye+" eyecolor");
    }
}
class AnimalDemo
{
    public static void main(String []args)
    {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the details of dog:");
    System.out.println("Enter the species:");
    String species=scanner.nextLine();
    System.out.println("Enter the age:");
    int age=scanner.nextInt();
    System.out.println("Enter the weight:");
    int weight=scanner.nextInt();
    scanner.nextLine();
    System.out.println("Enter the color:");
    String color=scanner.nextLine();
    System.out.println("Enter the owner:");
    String owner=scanner.nextLine();
    System.out.println("Enter the name:");
    String name=scanner.nextLine();
    
    Dog d = new Dog(species,age,weight,color,owner,name);
    

    System.out.println("Enter the details of Cat:");
    System.out.println("Enter the species:");
    species=scanner.nextLine();
    System.out.println("Enter the age:");
    age=scanner.nextInt();
    System.out.println("Enter the weight:");
    weight=scanner.nextInt();
    scanner.nextLine();
    System.out.println("Enter the color:");
    color=scanner.nextLine();
    System.out.println("Enter the tail length:");
    int tail=scanner.nextInt();
    scanner.nextLine();
    System.out.println("Enter the eyecolor:");
    String eye=scanner.nextLine();
    System.out.println("Enter the name:");
    name=scanner.nextLine();

    Cat c=new Cat(species,age,weight,color,tail,eye,name);
    System.out.println("Dog details");
    d.display();
    System.out.println("Cat details");
    c.display();

    }
}