package org.ies.tierno.app;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.ies.tierno.models.Company;
import org.ies.tierno.readers.CompanyReader;
import org.ies.tierno.readers.Reader;

import java.util.Random;
import java.util.Scanner;

@Slf4j
@AllArgsConstructor
public class CompanyApp {
    private final Scanner scanner;
    private final Reader<Company> companyReader;

//    public void run(){
//        Company company= companyReader.read();
//        int opt;
//        do {
//            log.info("//Menú de la Empresa//");
//            log.info("1.Todos los departamentos de la empresa");
//            log.info("2. Mostrar los empleados del departamento");
//            log.info("3. Mostrar datos de un departamento");
//            log.info("4. Mostrar los datos de un empleado");
//            log.info("5. Salir");
//            opt= scanner.nextInt(); scanner.nextLine();
//
//            if (opt==1){
//                company.showDepartments();
//            } else if (opt==2) {
//                log.info("Escriba el nombre del departamento: ");
//                String name= scanner.nextLine();
//                company.employeesOfDepartment(name);
//            } else if (opt==3) {
//
//                company.departmentByName();
//            } else if (opt==4) {
//                company.employeeData();
//            } else if (opt==5) {
//                log.info("Saliendo...");
//            }
//        }while (opt==5);
//    }
}
