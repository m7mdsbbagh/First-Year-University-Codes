class Student
{
    private final String id;
    private String name = "";
    private double grade = 0.0;

    public Student(String id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public void display() {
        System.out.printf("| %-11s | %-10s | %-7.2f%% |%n", id, name, grade);
    }
}

public class Main
{
    public static String footer = printFooter();

    public static Student[] initializeData()
    {
        return new Student[] {
                new Student("32520001085", "Hassan", 85.5),
                new Student("32520001056", "Amal", 92.0),
                new Student("32520001035", "Mohammad", 99.99)
        };
    }

    public static void displayAllStudents(Student[] students)
    {
        for (Student s : students)
            s.display();

        System.out.println(footer);
    }

    public static String printFooter()
    {
        return "+" + "-".repeat(37) + "+";
    }

    public static void printHeader()
    {
        System.out.println(footer);
        System.out.printf("| %-11s | %-10s | %-8s |%n", "ID", "Name", "Grade");
        System.out.println(footer);
    }

    public static void main(String[] args)
    {
        Student[] myStudents = initializeData();

        printHeader();
        displayAllStudents(myStudents);
    }
}
