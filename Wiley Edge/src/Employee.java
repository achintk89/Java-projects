public class Employee {
    int id;
    String empname;
    String email;
    float salary;

    Employee(int id, String empname, String email, float salary){
        this.id = id;
        this.empname = empname;
        this.email = email;
        this.salary = salary;
    }
    void printEmployee(){
        System.out.println("Id: "+id);
        System.out.println("Employee Name: "+empname);
        System.out.println("Email: "+email);
        System.out.println("Salary: "+salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee(1, "Achint","achintk89@gmail.com", 60000f);

        emp.printEmployee();
    }
}