package org.ies.tierno.readers;

import lombok.AllArgsConstructor;
import org.ies.tierno.models.Company;
import org.ies.tierno.models.Department;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@AllArgsConstructor
public class CompanyReader implements Reader<Company> {
    private final Random random;
    private final Reader<Department> departmentReader;

    @Override
    public Company read() {
        Map<String, Department> departmentsByName = new HashMap<>();
        int numDepartments = random.nextInt(1, 10);
        for (int i = 0; i < numDepartments; i++) {
            var department = departmentReader.read();
            departmentsByName.put(department.getName(), department);
        }
        return new Company(
                "Company " + random.nextInt(10000),
                "A" + random.nextInt(10000000, 99999999),
                departmentsByName
        );
    }
}
