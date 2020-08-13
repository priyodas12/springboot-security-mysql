package io.springbootlab.springbootsecuritymysql.entity;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String active;
    private String password;
    @Column(name="roles")
    private String userRole;
    @Column(name="user_name")
    private String userName;

    public User(int id, String active, String password, String userRole, String userName) {
        this.id = id;
        this.active = active;
        this.password = password;
        this.userRole = userRole;
        this.userName = userName;
    }

    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
