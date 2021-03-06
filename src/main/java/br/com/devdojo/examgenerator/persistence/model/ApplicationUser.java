package br.com.devdojo.examgenerator.persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;

@Entity
public class ApplicationUser extends AbstractEntity{
    @NotEmpty(message = "The field username cannot be empty")
    @Column(unique = true)
    private String username;
    @NotEmpty(message = "The field cannot be empty")
    private String password;
    @OneToOne
    private Teacher teacher;

    public ApplicationUser() {
    }

    public ApplicationUser(ApplicationUser applicationUser) {
        this.username = applicationUser.username;
        this.password = applicationUser.password;
        this.teacher = applicationUser.teacher;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
