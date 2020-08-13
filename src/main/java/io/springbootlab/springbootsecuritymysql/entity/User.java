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
    private String userrole;
    @Column(name="user_name")
    private String username;

    public User() {

    }

    public User(int id, String active, String password, String userrole, String username) {
        this.id = id;
        this.active = active;
        this.password = password;
        this.userrole = userrole;
        this.username = username;
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

    public String getUserrole() {
        return userrole;
    }

    public void setUserrole(String userrole) {
        this.userrole = userrole;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
