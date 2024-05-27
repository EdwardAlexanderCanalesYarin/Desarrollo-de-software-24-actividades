package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ClassInfo classInfo = new ClassInfo();
        /*
        METODOS DE LA CLASE EmployeeManager
        addEmployee
        removeEmployee
        changeDepartment
        printDepartmentReport
        printAllDepartments
        findDepartment
        ATRIBUTOS DE INSTANCIA DE LA CLASE EmployeeManager
        employees
        departments
        */
        // Simulación de entrada de métodos y sus accesos a atributos
        classInfo.addMethod("addEmployee", new HashSet<>(Arrays.asList("employees", "departments")));
        classInfo.addMethod("removeEmployee", new HashSet<>(Arrays.asList("employees")));
        classInfo.addMethod("changeDepartment", new HashSet<>(Arrays.asList("employees")));
        classInfo.addMethod("printDepartmentReport", new HashSet<>(Arrays.asList("employees")));
        classInfo.addMethod("printAllDepartments", new HashSet<>(Arrays.asList("departments")));
        classInfo.addMethod("findDepartment", new HashSet<>(Arrays.asList("departments")));
        int p = 0, q = 0;
        List<String> methods = classInfo.methods;
        for (int i = 0; i < methods.size(); i++) {
            for (int j = i + 1; j < methods.size(); j++) {
                String method1 = methods.get(i);
                String method2 = methods.get(j);
                Set<String> attrs1 = classInfo.methodAttributes.get(method1);
                Set<String> attrs2 = classInfo.methodAttributes.get(method2);
                // Calculamos si comparten atributos
                Set<String> intersection = new HashSet<>(attrs1);
                intersection.retainAll(attrs2);
                if (intersection.isEmpty()) {
                    p++; // No comparten atributos
                } else {
                    q++; // Comparten al menos un atributo
                }
            }
        }
        int lcom = p - q;
        System.out.println("LCOM = " + lcom);
    }
}