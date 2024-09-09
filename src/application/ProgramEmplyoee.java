package application;

import entities.Employee;
import entities.EmployeePolimorfism;
import entities.OutsourceEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramEmplyoee {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numberEmployees = sc.nextInt();

        List<EmployeePolimorfism> employeeList = new ArrayList<>();

        for (int i=0; i<numberEmployees; i++) {
            System.out.println("Employee #" + (i+1) + " data:");
            sc.nextLine();
            System.out.print("Outsourced (y/n)? ");
            String response = sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if (response.equals("y")) {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();

                EmployeePolimorfism employee = new OutsourceEmployee(name, hours, valuePerHour, additionalCharge);
                employeeList.add(employee);
            } else {
                EmployeePolimorfism employee = new EmployeePolimorfism(name, hours, valuePerHour);
                employeeList.add(employee);
            }
        }

        System.out.println("PAYMENTS:");
        for (EmployeePolimorfism employeePolimorfism : employeeList) {
            System.out.println(employeePolimorfism.getName() + " - " + employeePolimorfism.payment());
        }

        sc.close();
    }
}
