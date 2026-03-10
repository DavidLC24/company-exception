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
    private Map<String, Department> departmentsByName;

    //1
    public void showDepartments(){
        for (Department department: departmentsByName.values()){
            department.showInfo();
        }
    }
    //3
    public Department departmentByName (String name) throws DepartmentNotFoundException {
        if (!departmentsByName.containsKey(name)){
            throw new DepartmentNotFoundException("Departamento no encontrado");
        }
        return departmentsByName.get(name);
    }

    //2
    public List<Employee> employeesOfDepartment (String name) throws DepartmentNotFoundException{
//        Department department= departmentByName(name);
//        List<Employee> employees= List.of();
//        for (Employee employee: department.getEmployees()){
//            employees.add(employee);
//        }
//            return employees;
        if (departmentsByName.containsKey(name)){
            return departmentsByName.get(name).getEmployees();
        }
        throw new DepartmentNotFoundException("Departamento no encontrado"+ name);
    }

    //4
    public Employee employeeData (String nif) throws EmployeeNoFoundException {
        for (Department department:departmentsByName.values()){
            for (Employee employee: department.getEmployees()){
                if (employee.getNif().equals(nif)){
                    return employee;
                }
            }
        }
        throw new EmployeeNoFoundException("Empleado no encontrado");
    }
}
