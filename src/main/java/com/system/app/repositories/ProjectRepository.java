package com.system.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.system.app.models.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

}
