package org.ies.tierno.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@AllArgsConstructor
@Data
public class Department {
    private String name;
    private List<Employee> employees;

    public void showInfo() {
        log.info("Departamento " + name + ". Empleados: ");
        for (var employee : employees) {
            employee.showInfo();
        }
    }
}
