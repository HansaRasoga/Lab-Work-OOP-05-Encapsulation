import java.util.Scanner;
public class EmpDetails 
{
    public static void main(String [] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Employee Number: ");
        int empNo = scanner.nextInt();
        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(name, empNo, salary);

        System.out.println("Employee Details:");
        employee.printDetails();

        scanner.close();
    }
}
