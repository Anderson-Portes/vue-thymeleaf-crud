package com.system.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.system.app.models.Project;
import com.system.app.services.ProjectService;

@Controller
@RequestMapping("/api/projects")
public class ProjectController {

  @Autowired
  private ProjectService service;

  @GetMapping("/")
  public ResponseEntity<List<Project>> index() {
    return ResponseEntity.ok(this.service.all());
  }

  @PostMapping("/")
  public ResponseEntity<Project> store(@RequestBody Project project) {
    return ResponseEntity.ok(this.service.create(project));
  }

  @PutMapping("/{id}")
  public ResponseEntity<Project> update(@PathVariable Long id, @RequestBody Project project) {
    return ResponseEntity.ok(this.service.update(id, project));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<String> destroy(@PathVariable Long id) {
    this.service.destroy(id);
    return ResponseEntity.ok("Project deleted successfully.");
  }
}
