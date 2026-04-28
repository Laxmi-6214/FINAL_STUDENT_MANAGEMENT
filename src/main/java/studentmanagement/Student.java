package studentmanagement;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String email;
    private String department;
    private double marks;
    private int age;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
    
    public double getMarks() { return marks; }
    public void setMarks(double marks) { this.marks = marks; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    
}
