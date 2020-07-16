package com.keysoft.bugtracker.repositories;

import com.keysoft.bugtracker.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
