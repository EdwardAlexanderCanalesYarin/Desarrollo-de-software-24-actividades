package org.example;

public class Main {
    public static void main(String[] args) {
        /*
        EmployeeManager
        Employee
        Department
        */
        Module employeeManager = new Module("EmployeeManager");
        Module employee = new Module("Employee");
        Module department = new Module("Department");

        employeeManager.addDependency(employee);
        employeeManager.addDependency(department);

        Module[] modules = {employeeManager,employee,department};

        int totalDependencies = 0;
        for (Module module : modules) {
            totalDependencies += module.getDependencies().size();
        }

        int totalModules = modules.length;

        double factor_acoplamiento = (double) totalDependencies / (totalModules * (totalModules - 1));
        System.out.println("Factor de acoplamiento: " + factor_acoplamiento);
    }
}