package io.springbootlab.springbootsecuritymysql.controller;

/*
        CREATE TABLE user (id INT(20), active VARCHAR(20),
        roles VARCHAR(20), password VARCHAR(20), user_name VARCHAR(20));

        INSERT INTO user(id,active,roles,password,user_name)
        values (1,'true','ROLE_USER','pass123','user');

        alter table user add primary key(id);
*/
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/home")
public class HomePageController {

    @RequestMapping(method = RequestMethod.GET,value = "/")
    public String returnHomePageGeneric(){
        return "Welcome to common Env\n"+new Date();
    }

    @RequestMapping(method = RequestMethod.GET,value = "/test")
    public String returnHomePageTester(){
        return "Welcome to Testing Env\n"+new Date();
    }

    @RequestMapping(method = RequestMethod.GET,value = "/dev")
    public String returnHomePageDeveloper(){
        return "Welcome to Developing Env\n"+new Date();
    }

    @RequestMapping(method = RequestMethod.GET,value = "/prod")
    public String returnHomePageAdmin(){
        return "Welcome to Production Env\n"+new Date();
    }

    @RequestMapping(method = RequestMethod.GET,value = "/user")
    public String returnHomePageUser(){
        System.out.println("controller called----------------");
        return "Welcome to User Env\n"+new Date();
    }
}
