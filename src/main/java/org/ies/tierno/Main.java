package org.ies.tierno;

import org.ies.tierno.readers.CompanyReader;
import org.ies.tierno.readers.DepartmentReader;
import org.ies.tierno.readers.EmployeeReader;

import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        var employeeReader = new EmployeeReader(random);
        var departmentReader = new DepartmentReader(random, employeeReader);
        var companyReader = new CompanyReader(random, departmentReader);
    }
}