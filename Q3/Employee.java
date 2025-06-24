public class Employee 
{
    // Private attributes
    private String Name;
    private int EmpNo;
    private double Salary;

    // Constructor to initialize the attributes
    // This constructor takes three parameters to set the employee's name, number, and salary
    public Employee(String Name, int EmpNo, double Salary)
    {
        setName(Name);
        setEmpNo(EmpNo);
        setSalary(Salary);
    }

    // Getters for the attributes
    public String getName()
    {
        return Name;
    }

    public int getEmpNo()
    {
        return EmpNo;
    }

    public double getSalary()
    {
        return Salary;
    }

    // Setters for the attributes
    public void setName(String Name)
    {
        // Validate the name before setting it
        if(Name != null && !Name.isEmpty()) // Ensure name is not null or empty
        {
            this.Name = Name;
        }
        else
        {
            System.out.println("Invalid Name! Please provide a valid name.");
        }
    }

    public void setSalary(double Salary)
    {
        // Validate the salary before setting it
        if(Salary >= 0) // Ensure salary is non-negative
        {
            this.Salary = Salary;
        }
        else
        {
            System.out.println("Invalid Salary! Salary cannot be negative.");
        }
    }

    public void setEmpNo(int EmpoNo)
    {
        this.EmpNo = EmpoNo; // Assuming employee number can be set without validation
    }
    
    // Method to print employee details
    // This method prints the details of the employee in a formatted manner
    public void printDetails()
    {
        System.out.println("Employee Details:");
        System.out.println("-------------------");
        System.out.println("Employee Name: " + Name);
        System.out.println("Employee Number: " + EmpNo);
        System.out.println("Employee Salary: " + Salary);
        System.out.println("-------------------");
    }


}
