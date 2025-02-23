import java.util.Scanner;
class Student
{
    int rollno;
    String name;
    int marks;

public Student()
{
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter roll no:");
    rollno=scanner.nextInt();
    scanner.nextLine();
    System.out.println("Enter the name:");
    name=scanner.nextLine();
    System.out.println("Enter the marks:");
    marks=scanner.nextInt();
    
}
public static void sortMarks(Student s[],int n)
{
    
    for(int i=0;i<n;i++)
    {
        for (int j=i+1;j<n;j++)
        {
         if(s[i].marks<=s[j].marks)
         {
           Student temp=s[i];
            s[i]=s[j];
            s[j]=temp;
         }
        }
    }
}
public static void display(Student s[],int n)
{
    System.out.println("Roll no:       Name:        Marks:");
    for (int i=0;i<n;i++)
    {
        System.out.println(s[i].rollno+"\t\t"+s[i].name+"\t\t"+s[i].marks);
        
}
}
}
public class StudentDemo 
{
    public static void main(String[] args)
    {
        System.out.println("Enter the no of students:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Student s[] = new Student[n];
        for (int i = 0; i < n; i++) {
            s[i] = new Student();
            }
            Student.sortMarks(s,n);
            Student.display(s,n);
            scanner.close();
    }
}