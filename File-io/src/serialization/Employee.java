package serialization;

import java.io.Serializable;

public  class Employee implements Serializable {

    private static final long serialVersionUID = 8486915410006252965L;

    private int id;  // non-negative
    private String name; // shouldn't be null or blank
    private String email; // shouldn't be null or blank
    private float salary; // non-negative
    private transient String password;


    public Employee(int id, String name, String email, float salary,String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
        this.password = password;
    }

    public Employee() {
        System.out.println("Employee Initialized");
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Employee(int id) {
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setEmployeeDetails(int id) {
        this.id = id;
    }

    public void setEmployeeDetails(String name) {
        this.name = name;
    }

    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email=" + email +
                ", salary=" + salary + ", password=" + password +
                '}';
    }
}