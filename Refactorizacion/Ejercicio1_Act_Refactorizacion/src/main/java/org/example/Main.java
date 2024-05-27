package org.example;

public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        manager.addEmployee("Jose", "TIC");
        manager.addEmployee("Jesus", "Seguridad");
        manager.addEmployee("Andres", "Administracion");
        manager.addEmployee("Diego", "Administracion");
        manager.printDepartmentReport("Administracion");
        manager.printAllDepartments();
        manager.changeDepartment("Diego","TIC");
    }
}