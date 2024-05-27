package org.example;

import java.util.*;

public class ClassInfo {
    List<String> methods = new ArrayList<>();
    Map<String, Set<String>> methodAttributes = new HashMap<>();
    Set<String> attributes = new HashSet<>();
    public void addMethod(String methodName, Set<String> attrs) {
        methods.add(methodName);
        methodAttributes.put(methodName, attrs);
        attributes.addAll(attrs);
    }
}
