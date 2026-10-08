package PreFinalActivity;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Computer Lab 3
 */
public class EmployeeAttendanceandSalarySystem {
 
    public class Employee {

        private String employeeId, name, department;
        private int daysWorked;
        private double dailyRate;

        public Employee(String id, String n, String d, int days, double rate) {
            employeeId = id;
            name = n;
            department = d;
            daysWorked = days;
            dailyRate = rate;
        }

        public double calculateRegularPay() {
            return Math.min(daysWorked, 22) * dailyRate;
        }

        public double calculateOvertimePay() {
            return daysWorked > 22
                    ? (daysWorked - 22) * dailyRate * 1.25
                    : 0;
        }

        public double calculateGrossPay() {
            return calculateRegularPay() + calculateOvertimePay();
        }

        public double calculateDeduction() {
            return calculateGrossPay()
                    * (calculateGrossPay() <= 15000 ? 0.05 : 0.08);
        }

        public double calculateNetPay() {
            return calculateGrossPay() - calculateDeduction();
        }

        public String getAttendanceClassification() {
            if (daysWorked < 15)
                return "Poor Attendance";
            else if (daysWorked < 22)
                return "Incomplete Attendance";
            else if (daysWorked == 22)
                return "Complete Attendance";
            else
                return "Overtime Worker";
        }

        public void displayPayroll() {
            System.out.println("===== EMPLOYEE PAYROLL =====");
            System.out.println("Employee ID: " + employeeId);
            System.out.println("Name: " + name);
            System.out.println("Department: " + department);
            System.out.println("Days Worked: " + daysWorked);
            System.out.printf("Daily Rate: ₱%.2f%n", dailyRate);
            System.out.printf("Regular Pay: ₱%.2f%n", calculateRegularPay());
            System.out.printf("Overtime Pay: ₱%.2f%n", calculateOvertimePay());
            System.out.printf("Gross Pay: ₱%.2f%n", calculateGrossPay());
            System.out.printf("Deduction: ₱%.2f%n", calculateDeduction());
            System.out.printf("Net Pay: ₱%.2f%n", calculateNetPay());
            System.out.println("Classification: " + getAttendanceClassification());
        }
    }
}