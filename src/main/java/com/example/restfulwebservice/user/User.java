package com.example.restfulwebservice.user;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class User {

    public void User(String name, Date joinDate){
        this.name = name;
        this.joinDate = joinDate;
    }
    private Integer id;
    private String name;
    private Date joinDate;
}
