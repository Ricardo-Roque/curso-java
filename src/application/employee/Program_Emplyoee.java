package application.employee;

import entities.emplyoee.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program_Emplyoee {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            Employee employee = new Employee(id, name, salary);

            employees.add(employee);
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();

        Employee result = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if (result == null) {
            System.out.println("This id does not exits!");
        } else {
            System.out.print("Enter the percentenge: ");
            double percentenge = sc.nextDouble();

            result.increaseSalary(percentenge);
        }

        System.out.println("List of employees: ");

        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }

        sc.close();
    }
}
