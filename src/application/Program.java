package application;

import entities.Employee;
import entities.EmployeeRepository;

import java.math.BigDecimal;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        EmployeeRepository repository = new EmployeeRepository();
        Scanner sc = new Scanner(System.in);
        int id;
        String name;
        BigDecimal salary;
        int howManyEmployees;
        int count = 0;
        int employeeNumber = 1;

        System.out.print("How many employees will be registered? ");
        howManyEmployees = sc.nextInt();
        sc.nextLine();

        do {
            System.out.println("Employee #" + employeeNumber);
            System.out.print("Id: ");
            id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            name = sc.nextLine();
            System.out.print("Salary: ");
            salary = sc.nextBigDecimal();
            repository.addEmployee(new Employee(id, name, salary));
            employeeNumber++;
            count++;
        }while(count != howManyEmployees);

        System.out.print("Enter user ID: ");
        id = sc.nextInt();
        System.out.printf("Enter new salary from ID #%d: ", id);
        salary = sc.nextBigDecimal();
        repository.checkingEmployeeID(id, salary);


        repository.getAllEmployees();
    }
}
