package com.keysoft.bugtracker.repositories;

import com.keysoft.bugtracker.domain.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, Integer> {
}
