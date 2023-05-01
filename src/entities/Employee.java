package entities;

import java.math.BigDecimal;

public class Employee {
    private int id;
    private String name;
    private BigDecimal salary;

    public Employee(int id, String name, BigDecimal salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "\nEmployee\n" +
                "id: " + id +
                "\nname: " + name +
                "\nsalary: " + salary;
    }

}
