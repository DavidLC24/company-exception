package org.ies.tierno.readers;

import lombok.AllArgsConstructor;
import org.ies.tierno.models.Employee;

import java.util.Random;

@AllArgsConstructor
public class EmployeeReader implements Reader<Employee> {
        private final static String[] NAMES = {"Bob", "Peppa", "George", "Pepe", "María", "Ana"};
        private final static String[] SURNAMES = {"Esponja", "Pig", "Pérez", "Sánchez", "López"};
        private final static String[] POSITION = {"Jefe", "Peón", "Senior", "Programador", "Recruiter"};
        private final Random random;

        @Override
        public Employee read() {
            return new Employee(
                    random.nextInt(10000000, 99999999) + "X",
                    NAMES[random.nextInt(NAMES.length)],
                    SURNAMES[random.nextInt(SURNAMES.length)],
                    POSITION[random.nextInt(POSITION.length)]
            );
        }
    }
