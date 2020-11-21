package com.harish.random;

import java.util.*;
class Employee {
    String name;
    double salary;
    Integer id;
    String designation;
    String InsuranceScheme;

    public Employee(String name, double salary, Integer id, String designation) {
        //parameterized constructor
        this.name = name;
        this.salary = salary;
        this.id = id;
        this.designation = designation;
    }

    public String getInsuranceScheme(double salary) {
    /*  write your code here to return the scheme on the basis of salary
     if nothing falls in the range return null */
        if (salary >= 40000.0)
            return "a";
        else if (salary >= 20000.0)
            return "b";
        else if (salary >= 5000.0)
            return "c";
        else
            return "no scheme";
    }
}


class EmployeeServiceImpl {
    //Declare a Hashmap here where key is an Integer and the value is Employee object
    public static HashMap<Integer,Employee> empMap = new HashMap<>();

    public static void addEmployee(Employee emp) {
        emp.InsuranceScheme = emp.getInsuranceScheme(emp.salary);
        if(!empMap.containsKey(emp.id)) {
            empMap.put(emp.id,emp);
        }
    }

    public static boolean deleteEmployee(int id){
        //write your code here for returning true if the employee deleted wrt the id passed else false
        if(empMap.containsKey(id)) {
            empMap.remove(id);
            return true;
        }
        return false;
    }

    public static String showEmpDetails(String InsuranceScheme) {
    /*Write your code here to return a string i.e the employee details according to the insurance scheme
    Format: Name: name Id: id Salary: salary Designation: Designation InsuranceScheme: InsuranceScheme
    If multiple results they should be in a different line*/
        String result = "";
        for (Employee employee : empMap.values()) {
            if(employee.InsuranceScheme.equals(InsuranceScheme)) {
                result += "Name: " + employee.name + " Id: " + employee.id + " Salary: " + employee.salary + " Designation : " +
                        employee.designation + " Insurance Scheme: " + employee.InsuranceScheme + "\n";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Harish", 300000.0, 1, "engineer");
        Employee emp1 = new Employee("Harish1", 50000.0, 2, "engineer");
        Employee emp2 = new Employee("Harish2", 500000.0, 3, "engineer");
        Employee emp3 = new Employee("Harish3", 120000.0, 4, "engineer");
        addEmployee(emp);
        addEmployee(emp1);
        addEmployee(emp2);
        addEmployee(emp3);

        System.out.println(showEmpDetails("a"));
    }
}

