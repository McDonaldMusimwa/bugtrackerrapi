
package com.example.demo.model;



import jakarta.persistence.*;
import jakarta.persistence.Entity;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.time.LocalDate;
@Entity
@Table
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private LocalDate datecreated;

    private String description;
    private Double progress;
    private String comments;
    @ManyToOne
    private User assignedpersonel;


    public Job(Long id, String title, LocalDate datecreated, String description, Double progress, String comments, User assignedpersonel) {
        this.id = id;
        this.title = title;
        this.datecreated = datecreated;
        this.description = description;
        this.progress = progress;
        this.comments = comments;
        this.assignedpersonel = assignedpersonel;
    }

    public Job() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(LocalDate datecreated) {
        this.datecreated = datecreated;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getProgress() {
        return progress;
    }

    public void setProgress(Double progress) {
        this.progress = progress;
    }

    public User getAssignedpersonel() {
        return assignedpersonel;
    }

    public void setAssignedpersonel(User assignedpersonel) {
        this.assignedpersonel = assignedpersonel;
    }
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", datecreated=" + datecreated +
                ", description='" + description + '\'' +
                ", progress=" + progress +
                ", comments='" + comments + '\'' +
                ", assignedpersonel=" + assignedpersonel +
                '}';
    }
}
