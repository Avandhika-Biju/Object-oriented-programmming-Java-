 import java.util.Scanner;
 class Book
{
    String author;
    String title;
    int price;
  
public Book()
{
    Scanner scanner=new Scanner(System.in);
    System.out.print("Enter the author name:");
    author=scanner.nextLine();
    System.out.print("Enter the title:");
    title=scanner.nextLine();
    System.out.println("enter the price:");
    price=scanner.nextInt();
}
public static void display(Book b[],int n)
{
    System.out.println("Book Details:");
    for(int i=0;i<n;i++)
    {
        System.out.println(b[i].author+"     "+b[i].title+"      "+b[i].price);
    }
    
}
public static void sortBook(Book b[],int n)
{
    for(int i=0;i<n-1;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if (b[i].author.compareTo(b[j].author) > 0)
            {
                Book temp = b[i];
                b[i] = b[j];
                b[j] = temp;
            }
        }
    }
}
}
public class BookDemo
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the no of books");
        int n=scanner.nextInt();
        Book b[]=new Book[n];
        for (int i=0;i<n;i++)
        {
            b[i]=new Book();
        }
        Book.sortBook(b,n);
        Book.display(b,n);
        scanner.close();
    }
}