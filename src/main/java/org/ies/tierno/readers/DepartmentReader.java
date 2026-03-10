package org.ies.tierno.readers;

import lombok.AllArgsConstructor;
import org.ies.tierno.models.Department;
import org.ies.tierno.models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@AllArgsConstructor
public class DepartmentReader implements Reader<Department> {
    private final Random random;
    private final Reader<Employee> employeeReader;

    @Override
    public Department read() {
        List<Employee> employees = new ArrayList<>();
        int numEmployees = random.nextInt(1, 10);
        for (int i = 0; i < numEmployees; i++) {
            employees.add(employeeReader.read());
        }
        return new Department(
                "Departamento " + random.nextInt(1, 100),
                employees
        );
    }
}
