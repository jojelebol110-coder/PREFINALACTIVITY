/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PreFinalActivity;

import PreFinalActivity.EmployeeAttendanceandSalarySystem.Employee;

/**
 *
 * @author Computer Lab 3
 */
public class TestEmployeeAttendanceandSalarySystem {
    public static void main(String[] args) {

        EmployeeAttendanceandSalarySystem system =
                new EmployeeAttendanceandSalarySystem();

        Employee employee1 =
                system.new Employee("EMP001", "Juan Dela Cruz",
                        "IT", 22, 800);
     
        System.out.println();

        employee1.displayPayroll();
    }
}
