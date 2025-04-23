package com.devcaleb.demo.services;

import com.devcaleb.demo.dto.PersonDepartmentDTO;
import com.devcaleb.demo.entities.Department;
import com.devcaleb.demo.entities.Person;
import com.devcaleb.demo.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public PersonDepartmentDTO insert(PersonDepartmentDTO dto){

        Person entity = new Person();
        entity.setName(dto.getName());
        entity.setSalary(dto.getSalary());

        Department dept = new Department();
        dept.setId(dto.getDepartment().getId());

        entity.setDepartment(dept);

        entity = personRepository.save(entity);
        return new PersonDepartmentDTO(entity);
    }
}
