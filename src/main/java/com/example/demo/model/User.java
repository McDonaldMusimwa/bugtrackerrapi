package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class User {

    public enum ClearanceLevel {
        LEVEL_1(1),
        LEVEL_2(2),
        LEVEL_3(3);

        private final int numericValue;

        ClearanceLevel(int numericValue) {
            this.numericValue = numericValue;
        }

        public int getNumericValue() {
            return numericValue;
        }
    }

    @Id
    @SequenceGenerator(
            name = "User_sequence",
            sequenceName = "User_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.IDENTITY,
            generator = "User_sequence"
    )
    private Long id;
    private String firstname;
    private String lastname;
    private LocalDate dob;
    private ClearanceLevel level;
    private String email;

    private String password;

    public User() {

    }

    public User(Long id, String firstname, String lastname, LocalDate dob, ClearanceLevel level, String email,String password) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dob = dob;
        this.level = level;
        this.email = email;
        this.password = password;
    }

    public User(String firstname, String lastname, LocalDate dob, ClearanceLevel level, String email,String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dob = dob;
        this.level = level;
        this.email = email;
        this.password= password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public ClearanceLevel getLevel() {
        return level;
    }

    public void setLevel(ClearanceLevel level) {
        this.level = level;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public  String getPassword(String password){
        return password;
    }
    public  void setPassword(String password){
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", dob=" + dob +
                ", level=" + level +
                ", email='" + email + '\'' +
                '}';
    }
}
