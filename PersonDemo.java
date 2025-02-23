import java.util.Scanner;
abstract class Person
{
    String name;
    String gender;
    String address;
    int age;

public Person(String n,String g,String adr,int a)
{
name=n;
gender=g;
address=adr;
age=a;
}
@Override
public String toString()
{
    return (name+" is a "+age+" year old "+gender+" lives in "+address);
}
}
class Employee extends Person
{
    int empid;
    String company;
    String qualification;
    int salary;

public Employee(String n,String g,String adr,int a,int id,String c,String q,int s)
{
super(n,g,adr,a);
empid=id;
company=c;
qualification=q;
salary=s;
}
@Override
public String toString()
{
    
    return (super.toString()+" Works in "+company+" having ID "+empid+" is a "+qualification+" graduate with "+salary+" /- salary");
}
}
class Teacher extends Employee
{
int teacherid;
String subject;
String department;
public Teacher(String n,String g,String adr,int a,int id,String c,String q,int s,int tid,String sub,String dept)
{
    super(n,g,adr,a,id,c,q,s);
    teacherid=tid;
    subject=sub;
    department=dept;
}
@Override
public String toString()
{
    return (super.toString()+" with Teacher ID "+teacherid+" teaches "+subject+" in "+department+" department");
}
}
class personDemo
{
    public static void main(String [] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the no of teachers:");
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++)
        {
        scanner.nextLine();
        System.out.println("Enter the name:");
        String name=scanner.nextLine();
        System.out.println("Enter the gender:");
        String gender=scanner.nextLine();
        System.out.println("Enter the address:");
        String addr=scanner.nextLine();
        System.out.println("Enter the age:");
        int age=scanner.nextInt();

        System.out.println("Enter the employee id:");
        int eid=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the Company:");
        String company=scanner.nextLine();
        System.out.println("Enter the qualification:");
        String q=scanner.nextLine();
        System.out.println("Enter the salary:");
        int sal=scanner.nextInt();

        System.out.println("Enter the Teacher id:");
        int tid=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the Subject:");
        String sub=scanner.nextLine();
        System.out.println("Enter the Department:");
        String dept=scanner.nextLine();

        Teacher t=new Teacher(name,gender,addr,age,eid,company,q,sal,tid,sub,dept);
        System.out.println(t.toString());
    }
}
}