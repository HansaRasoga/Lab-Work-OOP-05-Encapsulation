import java.util.Scanner;

public class MarkDeatils 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter Student ID: ");
        int id = input.nextInt();
        input.nextLine(); // Consume newline

        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        System.out.print("Enter Gender (M/F): ");
        char gender = input.next().charAt(0);
        input.nextLine(); // Consume newline

        System.out.print("Enter Subject Name: ");
        String subjectName = input.nextLine();

        System.out.print("Enter Marks (0-100): ");
        int marks = input.nextInt();

        // Create Students object
        Students student = new Students(id, name, gender, subjectName, marks);

        // Display details
        student.display();
        // Close the scanner
        input.close();
    }
}
