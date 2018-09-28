package com.te.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {

    @Id
    public Long id;

    @Column(name="username", unique=true)
    public String username;

    @Column(name="password")
    public String password;

    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id=id;
    }

    public String getUsername(){
        return this.username;
    }
    public void setUsername(String username){
        this.username=username;
    }

    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password=password;
    }
}
