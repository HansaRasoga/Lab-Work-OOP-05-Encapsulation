public class Students 
{
    private int id;
    private String name;
    private char gender;
    private String subjectName;
    private int marks;

    public Students(int id, String name, char gender, String subjectName, int marks)
    {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.subjectName = subjectName;
        this.marks = marks;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public char getGender()
    {
        return gender;
    }

    public String getSubjectName()
    {
        return subjectName;
    }

    public int getMarks()
    {
        return marks;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setGender(char gender)
    {
        this.gender = gender;
    }

    public void setSubjectName(String subjectName)
    {
        this.subjectName = subjectName;
    }

    public void setMarks(int marks) 
    {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks! Must be between 0 and 100.");
        }
    }

    // Display method
    public void display() 
    {
        System.out.println("\nStudent Details:");
        System.out.println("ID          : " + id);
        System.out.println("Name        : " + name);
        System.out.println("Gender      : " + gender);
        System.out.println("Subject     : " + subjectName);
        System.out.println("Marks       : " + marks);
    }
}
