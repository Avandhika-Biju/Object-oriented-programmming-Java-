import java.util.*;

interface Showable {
    public void show();
}

class Person {
    String name, gender, phoneno;

    public Person(String n, String g, String ph) {
        name = n;
        gender = g;
        phoneno = ph;
    }

    public void show() {
        System.out.println("Name: " + name + "  Gender: " + gender + "  Phone no: " + phoneno);
    }
}

class Student extends Person implements Showable {
    String course;
    int score;

    public Student(String n, String g, String ph, String c, int s) {
        super(n, g, ph);
        course = c;
        score = s;
    }

    public void show() {
        super.show();
        System.out.println("Course: " + course + "  Score: " + score);
    }
}

class PGStudent extends Student implements Showable {
    String ResearchArea, guide;

    public PGStudent(String n, String g, String ph, String c, int s, String r, String g1) {
        super(n, g, ph, c, s);
        ResearchArea = r;
        guide = g1;
    }

    public void show() {
        super.show();
        System.out.println("Research Area: " + ResearchArea + "  Guide: " + guide);
    }
}

public class PGDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of PG students: ");
        int n = sc.nextInt();
        sc.nextLine();
        PGStudent pg[] = new PGStudent[10];
        for (int i = 0; i < n; i++) {
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Gender: ");
            String gender = sc.nextLine();
            System.out.print("Phone No: ");
            String phone = sc.nextLine();
            System.out.print("Course: ");
            String course = sc.nextLine();
            System.out.print("Score: ");
            int score = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.print("Research Area: ");
            String researchArea = sc.nextLine();
            System.out.print("Guide: ");
            String guide = sc.nextLine();
            pg[i] = new PGStudent(name, gender, phone, course, score, researchArea, guide);

        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (pg[j].score < pg[j + 1].score) {  
                    PGStudent temp = pg[j];
                    pg[j] = pg[j + 1];
                    pg[j + 1] = temp;
                }
            }
        }
        System.out.println("Rank      Name       Score  ");
        for (int i = 0; i < n; i++) {
            System.out.println(i + 1 + "     " + pg[i].name + "     " + pg[i].score);
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (pg[j].ResearchArea.compareTo(pg[j + 1].ResearchArea) > 0) { 
                    PGStudent temp = pg[j];
                    pg[j] = pg[j + 1];
                    pg[j + 1] = temp;
                }
            }
        }

        System.out.println("\nPG Students sorted by Research Area:");
        for (int i = 0; i < n; i++) {
            pg[i].show();
        }

        sc.close();

}
}