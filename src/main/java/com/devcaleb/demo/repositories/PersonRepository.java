package com.devcaleb.demo.repositories;

import com.devcaleb.demo.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
