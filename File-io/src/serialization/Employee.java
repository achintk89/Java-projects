package serialization;

import java.io.Serializable;

public  class Employee implements Serializable {

    private int id;  // non-negative
    private String name; // shouldn't be null or blank
    private String email; // shouldn't be null or blank
    private float salary; // non-negative

    public Employee(int id, String name, String email, float salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public Employee() {
        System.out.println("Employee Initialized");
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
                ", salary=" + salary +
                '}';
    }
}