package entities;

import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;

public class EmployeeRepository {
     List<Employee> employees;

    public EmployeeRepository(){
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void removeEmployee(int index){
        employees.remove(index);
    }

    public  void getAllEmployees(){
        employees.forEach(employee -> System.out.println(employee));
    }

    public void checkingEmployeeID(int id, BigDecimal value){
        for (Employee employee : employees){
            if (employee.getId() == id){
                employee.setSalary(employee.getSalary().add(value));
                System.out.println(employee.getSalary());
            } else {
                System.out.println("O ID nao existe");
            }
        }
    }

}
