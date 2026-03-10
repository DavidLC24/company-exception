package org.ies.tierno.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@Data
public class Employee {
    private String nif;
    private String name;
    private String surname;
    private String position;

    public void showInfo(){
        log.info(nif+", "+name+", "+surname+", "+position);
    }
}
