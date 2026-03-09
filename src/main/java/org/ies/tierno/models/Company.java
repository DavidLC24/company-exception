package org.ies.tierno.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.ies.tierno.DepartmentNotFoundException;
import org.ies.tierno.EmployeeNoFoundException;

import java.util.List;
import java.util.Map;

@Slf4j
@AllArgsConstructor
@Data
public class Company {
    private String name;
    private String CIF;
    private Map<String, Department> departments;

    //1
    public void showDepartments(){
        for (String allDepartments: departments.keySet()){
            log.info(allDepartments);
        }
    }
    //3
    public Department departmentByName (String name) throws DepartmentNotFoundException {
        if (!departments.containsKey(name)){
            throw new DepartmentNotFoundException("Departamento no encontrado");
        }
        return departments.get(name);
    }

    //2
    public List<Employee> employeesOfDepartment (String name) throws DepartmentNotFoundException{
        Department department= departmentByName(name);
        List<Employee> employees= List.of();
        for (Employee employee: department.getEmployees()){
            employees.add(employee);
        }
            return employees;
    }

    //4
//    public Employee employeeData (String nif) throws EmployeeNoFoundException {
//        for (Department department)
//    }
}
