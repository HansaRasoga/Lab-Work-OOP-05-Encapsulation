public class TestCustomer 
{
    public static void main(String[] args) 
    {
        Customer customer1 = new Customer(101, "Alice", 'F');
        

        System.out.println(customer1);
        
        System.out.println("Customer 1 Details:");
        System.out.println("ID:" + customer1.getId());
        System.out.println("Name:" + customer1.getName());
        System.out.println("Gender:" + customer1.getGender());

        System.out.println("Using toString method:- " + customer1.toString());
    }

}
