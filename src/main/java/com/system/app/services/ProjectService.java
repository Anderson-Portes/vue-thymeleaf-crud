package com.system.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.app.models.Project;
import com.system.app.repositories.ProjectRepository;

@Service
public class ProjectService {

  @Autowired
  private ProjectRepository repository;

  public List<Project> all() {
    return this.repository.findAll();
  }

  public Optional<Project> find(Long id) {
    return this.repository.findById(id);
  }

  public Project create(Project project) {
    return this.repository.save(project);
  }

  public Project update(Long id, Project project) {
    project.setId(id);
    return this.repository.save(project);
  }

  public void destroy(Long id) {
    this.repository.deleteById(id);
  }
}
