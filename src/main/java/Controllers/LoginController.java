/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;


import Helpers.LoginHelper;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;


/**
 *
 * @author Azure
 */
@Named(value = "loginController")
@ManagedBean
@SessionScoped
public class LoginController implements Serializable {
    
    private String username;
    private String password;
    private String result;
    LoginHelper helper;

    /**
     * Creates a new instance of LoginController
     */
    public LoginController() {
        
    }
    
     public LoginController(String username, String password) {
         helper= new LoginHelper();
         this.username=username;
         this.password=password;
    }
     
     public String loginAttempt(){
         boolean respuesta= helper.userLogin(username, password);

         if(respuesta){
            return "index.xhtml";
         }
         else{
             return "login.xhtml";
         }
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

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public LoginHelper getHelper() {
        return helper;
    }

    public void setHelper(LoginHelper helper) {
        this.helper = helper;
    }
}
