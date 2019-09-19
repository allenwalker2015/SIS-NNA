/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Helpers.InfoUsuario;
import Helpers.UserService;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Azure
 */
@ManagedBean
@RequestScoped
public class ModUser {
    
    //Users data
    //Datos del usuario
    private String id;
    private String username;
    
    private String password; //pasword en la otra ventana.
    
    private String name;
    private String lastName;
    private String role;
    private String department;
    private String committee;
    private String email;
    private String alert;
    private String state;
    
    private boolean stateMod;    
    
    //Llenado de selection box
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
    private int userNumber;

    
 @PostConstruct
    public void init() {
        //options
        //users = service.createUsers(UserService.getTotalUsers());        
        //roles= service.getRoles();
        usuariosT=UserService.getTotalUsers(); //usando métodos estáticos para acceder a lo que ya tiene el objeto.
        
        //Conseguir los rolesMenuChoice ya puestos para poder ponerlos en el selection box.
        /*
        rolesMenuChoice = UserService.getRoles();    
        roleSelection = new ArrayList<String>();
        for(int i = 0; i < usuariosT; i++) {
            roleSelection.add(rolesMenuChoice.get(i));
        }
        roleSelection = roleSelection.stream().distinct().collect(Collectors.toList()); //Quitar los rolesMenuChoice duplicados para mostrar al crear usuario.
        */
        roleSelection = new ArrayList<String>();
        roleSelection.add("User");
        roleSelection.add("Committee");
        roleSelection.add("Administrator");
        
        //conseguir departamentos
        /*
        departmentMenuChoice = UserService.getDepartments();    
        deptSelection = new ArrayList<String>();
        for(int i = 0; i < usuariosT; i++) {
            deptSelection.add(departmentMenuChoice.get(i));
        }
        deptSelection = deptSelection.stream().distinct().collect(Collectors.toList()); //Quitar los rolesMenuChoice duplicados para mostrar al crear usuario.
        */
        deptSelection = new ArrayList<String>();
        deptSelection.add("Finanza");
        deptSelection.add("Mercadeo");
        deptSelection.add("Gerencia");
        deptSelection.add("Recursos Humanos");
        deptSelection.add("Informática");
                
        //conseguir comités, no repetidos.
        /*
        committeeMenuChoice = UserService.getCommittees();
        comSelection = new ArrayList<String>();
        for(int i = 0; i < usuariosT; i++) {
            comSelection.add(committeeMenuChoice.get(i));
        }
        comSelection = comSelection.stream().distinct().collect(Collectors.toList()); //Quitar los rolesMenuChoice duplicados para mostrar al crear usuario.
        */
        comSelection = new ArrayList<String>();
        comSelection.add("a");
        comSelection.add("b");
        comSelection.add("c");
        comSelection.add("d");
        comSelection.add("e");
        
        userNumber=UserService.getUserNumber();
        
        id=UserService.getIdMod();
        username=UserService.getUsernameMod();
        
       // password=UserService.getPassMod(); //Password en la otra ventana
        
        name=UserService.getNameMod();
        lastName=UserService.getLastNameMod();
        rolMenu=UserService.getRoleMod();
        deptMenu=UserService.getDeptMod();
        comMenu=UserService.getComMod();
        email=UserService.getEmailMod();
        alert=UserService.getAlertMod();
            
        stateMod=UserService.isStateMod();        
        if(stateMod)
            state="Activo";
        else
            state="Inactivo";
        
        //state=UserService.getCurrentState();
        
    }

    public ModUser(){
        
        
    }
    
    /*
    public ModUser(String id, String username, String password, String name, String lastName, String role, String department, String committee, String email, String alert, String state){
        
        this.id=id;
        this.username=username;
        this.password=password;
        this.name=name;
        this.lastName=lastName;
        this.role=role;
        this.department=department;
        this.committee=committee;
        this.email=email;
        this.alert=alert;
        this.state=state;
        
    }*/
    
    /*
    public void modUser(String id, String username, String password, String name, String lastName, String role, String department, String committee, String email, String alert, String state){
        
        UserService.setNewId(id);
        UserService.setNewUsername(username);
        UserService.setNewName(name);
        UserService.setNewPassword(password);
        UserService.setNewRole(role);
        UserService.setNewDepartment(department);
        UserService.setNewCommittee(committee);
        UserService.setNewLastName(lastName);
        UserService.setNewEmail(email);
        UserService.setNewAlert(alert);
        
        if(!state.equals("Activo"))
            UserService.setNewState(false);
        else
            UserService.setNewState(true);

        //Hasta el final que haya añadido todo.
      //  UserService.setTotalUsers(UserService.getTotalUsers()+1);
    }*/
    
    
    public void modUser(){
        
        FacesMessage message = null;
        
        UserService.setModId(userNumber,id);
        UserService.setModUsername(userNumber,username);
        UserService.setModName(userNumber,name);
        
       // UserService.setModPassword(userNumber,password); //Password en la otra ventana.
        
        UserService.setModRole(userNumber,rolMenu);
        UserService.setModDepartment(userNumber,deptMenu);
        UserService.setModCommittee(userNumber,comMenu);
        UserService.setModLastName(userNumber,lastName);
        UserService.setModEmail(userNumber,email);
        UserService.setModAlert(userNumber,alert);
        
        if(!state.equals("Activo"))
            UserService.setModState(userNumber,false);
        else
            UserService.setModState(userNumber,true);

        //Hasta el final que haya añadido todo.
        message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario modificado:", username);   
        FacesContext.getCurrentInstance().addMessage(null, message);    
    }
    
    
    public String modPassword(){

        return "modPassword?faces-redirect=true";
    }
    
    
    public int getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
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

    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public void setCommittee(String committee) {
        this.committee = committee;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAlert() {
        return alert;
    }

    public void setAlert(String alert) {
        this.alert = alert;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    
    
    ////
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
