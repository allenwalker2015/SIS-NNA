/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Azure
 */
public class InfoUsuario {
    
    private String id;
    private String username;
    private String name;
    private String lastName;
    private String password;
    private String role;
    private String department;
    private String committee;
    private String email;
    private String alerts;
    private boolean state;    
       
    
    //list.add(new InfoUsuario(getRandomId(), getRandomBrand(), getRandomYear(), getRandomColor(), getRandomPrice(), getRandomSoldState()));
    
    public InfoUsuario(String id, String username, String name,String lastName,String role,String department,String committee, String email,String alerts, boolean state,String password){
                
       this.id=id;
       this.username=username;
       this.name=name;
       this.lastName=lastName;
       this.password=password;
       this.role=role;
       this.department=department;
       this.committee=committee;
       this.email=email;
       this.alerts=alerts;
       this.state=state;      
        
    }
    
    public InfoUsuario(){
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCommittee() {
        return committee;
    }

    public void setCommittee(String committe) {
        this.committee = committe;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAlerts() {
        return alerts;
    }

    public void setAlerts(String alerts) {
        this.alerts = alerts;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

     public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
   
}
