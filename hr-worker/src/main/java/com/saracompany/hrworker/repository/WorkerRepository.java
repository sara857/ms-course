package com.saracompany.hrworker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.saracompany.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
