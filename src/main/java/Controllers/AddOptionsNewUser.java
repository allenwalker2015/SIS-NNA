/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Helpers.InfoUsuario;
import Helpers.UserService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Azure
 */
@ManagedBean
@ViewScoped
public class AddOptionsNewUser implements Serializable {         
     
    private String rolMenu;  
    private List<String> rolesMenuChoice;
    private List<String> roleSelection;
    
    private String deptMenu;  
    private List<String> departmentMenuChoice;
    private List<String> deptSelection;
    
    
    private String comMenu;  
    private List<String> committeeMenuChoice;
    private List<String> comSelection;
    
    private int usuariosT;
    private List<InfoUsuario> users;

     /*
    @ManagedProperty("#{userService}")
    private UserService service;
     */
    @PostConstruct
    public void init() {

        //options
        //users = service.createUsers(UserService.getTotalUsers());
        
        //roles= service.getRoles();
        usuariosT=UserService.getTotalUsers(); //usando métodos estáticos para acceder a lo que ya tiene el objeto.
        
        //Conseguir los rolesMenuChoice ya puestos para poder ponerlos en el selection box.
        rolesMenuChoice = UserService.getRoles();    
        roleSelection = new ArrayList<String>();
        for(int i = 0; i < usuariosT; i++) {
            roleSelection.add(rolesMenuChoice.get(i));
        }
        roleSelection = roleSelection.stream().distinct().collect(Collectors.toList()); //Quitar los rolesMenuChoice duplicados para mostrar al crear usuario.
        
        //conseguir departamentos
        departmentMenuChoice = UserService.getDepartments();    
        deptSelection = new ArrayList<String>();
        for(int i = 0; i < usuariosT; i++) {
            deptSelection.add(departmentMenuChoice.get(i));
        }
        deptSelection = deptSelection.stream().distinct().collect(Collectors.toList()); //Quitar los rolesMenuChoice duplicados para mostrar al crear usuario.
        
        //conseguir comités, no repetidos.
        committeeMenuChoice = UserService.getCommittees();
        comSelection = new ArrayList<String>();
        for(int i = 0; i < usuariosT; i++) {
            comSelection.add(committeeMenuChoice.get(i));
        }
        comSelection = comSelection.stream().distinct().collect(Collectors.toList()); //Quitar los rolesMenuChoice duplicados para mostrar al crear usuario.
        
        
    }
 
    public String getRolMenu() {
        return rolMenu;
    }
 
    public void setRolMenu(String rolMenu) {
        this.rolMenu = rolMenu;
    }
 
    public List<String> getRoleSelection() {
        return roleSelection;
    }
 
    public void setRoleSelection(List<String> roleSelection) {
        this.roleSelection = roleSelection;
    }

    public String getDeptMenu() {
        return deptMenu;
    }

    public void setDeptMenu(String deptMenu) {
        this.deptMenu = deptMenu;
    }

    public List<String> getDeptSelection() {
        return deptSelection;
    }

    public void setDeptSelection(List<String> deptSelection) {
        this.deptSelection = deptSelection;
    }

    public String getComMenu() {
        return comMenu;
    }

    public void setComMenu(String comMenu) {
        this.comMenu = comMenu;
    }

    public List<String> getComSelection() {
        return comSelection;
    }

    public void setComSelection(List<String> comSelection) {
        this.comSelection = comSelection;
    }
    
    
    
    
    
}
