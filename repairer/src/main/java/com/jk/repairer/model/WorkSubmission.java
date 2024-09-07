package com.jk.repairer.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "work_submissions")
public class WorkSubmission implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String mobile;
    private String email;
    private String location;

    private String workcategory;
    @Column(columnDefinition = "TEXT")
    private String worktodo;
    private Double budget;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getWorkcategory() {
        return workcategory;
    }

    public void setWorkcategory(String workcategory) {
        this.workcategory = workcategory;
    }

    public String getWorktodo() {
        return worktodo;
    }

    public void setWorktodo(String worktodo) {
        this.worktodo = worktodo;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }
}
