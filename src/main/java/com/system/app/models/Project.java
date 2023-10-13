package com.system.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Project {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(nullable = false)
  private String name;
  @Column
  private String server;
  @Column
  private String ftp;
  @Column
  private String user;
  @Column
  private String password;
  @Column
  private String register;
  @Column
  private String code;
  @Column(columnDefinition = "TEXT")
  private String description;
}
