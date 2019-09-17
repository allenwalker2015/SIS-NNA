/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionalities;

import Controllers.LoginTest;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Azure
 */
@ManagedBean
@RequestScoped
public class RequestGlobals implements Serializable{
    
    public String getUser() {
            return LoginTest.getLoggedName();
        }
    
}
