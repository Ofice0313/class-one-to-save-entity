package com.devcaleb.demo.services;

import com.devcaleb.demo.dto.PersonDTO;
import com.devcaleb.demo.dto.PersonDepartmentDTO;
import com.devcaleb.demo.entities.Department;
import com.devcaleb.demo.entities.Person;
import com.devcaleb.demo.repositories.DepartmentRepository;
import com.devcaleb.demo.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    public PersonDepartmentDTO insert(PersonDepartmentDTO dto){

        Person entity = new Person();
        entity.setName(dto.getName());
        entity.setSalary(dto.getSalary());

        Department dept = departmentRepository.getReferenceById(dto.getDepartment().getId());

        //Department dept = new Department();
        //dept.setId(dto.getDepartment().getId());

        entity.setDepartment(dept);

        entity = personRepository.save(entity);
        return new PersonDepartmentDTO(entity);
    }

    public PersonDTO insert(PersonDTO dto){

        Person entity = new Person();
        entity.setName(dto.getName());
        entity.setSalary(dto.getSalary());

        Department dept = new Department();
        dept.setId(dto.getDepartmentId());

        entity.setDepartment(dept);

        entity = personRepository.save(entity);
        return new PersonDTO(entity);
    }
}
