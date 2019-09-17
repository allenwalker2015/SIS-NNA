/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Helpers.LoginHelper;
import Helpers.UserService;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Azure
 */
@ManagedBean
@SessionScoped
public class LoginTest implements Serializable{
    
    private String username;
    private String password;
    
    private static String loggedName="Log in";


    public LoginTest(){

    }

    
    public String login() {
        FacesMessage message = null;
        boolean encontrado=searchUser(username,password);
        String respuesta;
        if(encontrado) {
            //loggedIn = true;
            message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome", username);
            LoginTest.setLoggedName(username);
            respuesta= "/index.xhtml?faces-redirect=true";
        } else {
            //loggedIn = false;
            message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Loggin Error", "Invalid credentials"); 
            respuesta= "/pages/Usuarios/loginUser.xhtml";
        }
        FacesContext.getCurrentInstance().addMessage(null, message);   
        return respuesta;
        
    }   
    
    private boolean searchUser(String username, String password){
        int i=0;
        boolean log=false;
        for(i=0;i<UserService.getTotalUsers();i++){
            if(UserService.getUsernames().get(i).equals(username) && UserService.getPasswords().get(i).equals(password)) log=true;
        }        
        return log;
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

    public static String getLoggedName() {
        return loggedName;
    }

    public static void setLoggedName(String loggedName) {
        LoginTest.loggedName = loggedName;
    }
    
    
    
    
}
