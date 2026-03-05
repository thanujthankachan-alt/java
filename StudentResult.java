import java.util.Scanner;

class Student {
    int roll;
    String name;
    int academicScore;

    void getStudentData(Scanner sc) {
        System.out.print("Enter Roll Number: ");
        roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Academic Score: ");
        academicScore = sc.nextInt();
    }
}

interface Sports {
    int sportsScore = 0;
}

class Result extends Student implements Sports {
    int sportsScore;

    void getSportsScore(Scanner sc) {
        System.out.print("Enter Sports Score: ");
        sportsScore = sc.nextInt();
    }

    void display() {
        System.out.println("\nStudent Result");
        System.out.println("Roll Number: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Academic Score: " + academicScore);
        System.out.println("Sports Score: " + sportsScore);
    }
}

public class StudentResult {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Result r = new Result();

        r.getStudentData(sc);
        r.getSportsScore(sc);

        r.display();

        sc.close();
    }
}