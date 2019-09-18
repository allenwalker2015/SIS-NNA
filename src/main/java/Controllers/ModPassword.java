/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Helpers.UserService;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Azure
 */
@ManagedBean
@RequestScoped
public class ModPassword {
    
    private String userMod;
    private String passwordMod;
    private int userNumber;
    
     @PostConstruct
    public void init() {
        
        userMod=UserService.getUsernameMod();
        userNumber=UserService.getUserNumber();
    }
    
    public void modifyPassword(){
        FacesMessage message = null;
        UserService.setModPassword(userNumber, passwordMod);
        message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Password Changed", userMod);
        FacesContext.getCurrentInstance().addMessage(null, message);   
    }

    public String getUserMod() {
        return userMod;
    }

    public void setUserMod(String userMod) {
        this.userMod = userMod;
    }

    public String getPasswordMod() {
        return passwordMod;
    }

    public void setPasswordMod(String passwordMod) {
        this.passwordMod = passwordMod;
    }

    public int getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }
    
    
    
}
