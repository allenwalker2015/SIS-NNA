/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Helpers.LoginHelper;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author Azure
 */

@ManagedBean
@SessionScoped
public class UserLoginView implements Serializable{
     
    private String username;
     
    private String password;
    
    LoginHelper helper;

    public LoginHelper getHelper() {
        return helper;
    }

    public void setHelper(LoginHelper helper) {
        this.helper = helper;
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
   
    public void login() {
        FacesMessage message = null;
        helper= new LoginHelper();
         this.username=username;
         this.password=password;
        boolean loggedIn = false;
        boolean respuesta= helper.userLogin(username, password);
         
        if(respuesta) {
            loggedIn = true;
            message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome", username);
        } else {
            loggedIn = false;
            message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Loggin Error", "Invalid credentials");
        }
         
        FacesContext.getCurrentInstance().addMessage(null, message);
        //PrimeFaces.current().ajax().addCallbackParam("loggedIn", loggedIn);
    }   
}
