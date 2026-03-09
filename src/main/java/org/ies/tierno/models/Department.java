package org.ies.tierno.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class Department {
    private String name;
    private List<Employee> employees;
}
