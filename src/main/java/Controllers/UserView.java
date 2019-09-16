/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Helpers.UserService;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped;
import Helpers.InfoUsuario;
import javax.annotation.PostConstruct;
import javax.persistence.criteria.Order;

/**
 *
 * @author Azure
 */
@ManagedBean(name="dtBasicView")
@ViewScoped
public class UserView implements Serializable {
     
    private List<InfoUsuario> users;
    private List<InfoUsuario> filteredUsers;
    private int tUsuarios;
    private int userNumber;
     
    @ManagedProperty("#{userService}")
    private UserService service;
 
    @PostConstruct
    public void init() {
        tUsuarios=UserService.getTotalUsers(); //necesitamos que maneje una variable de usuarios al crearse, porque tomará después la del servicio.
        users = service.createUsers(tUsuarios); //get as many as possible of the users or whatever
    }
     
    public List<InfoUsuario> getUsers() {
        return users;
    }
 
    public void setService(UserService service) {
        this.service = service;
    }

    //Búsqueda de usuario
    public List<InfoUsuario> getFilteredUsers() {
        return filteredUsers;
    }

    public void setFilteredUsers(List<InfoUsuario> filteredUsers) {
        this.filteredUsers = filteredUsers;
    }
   
    public List<String> getRolesGl() {
        return service.getRolesGl();
    }
    
    public List<String> getDeptsGl() {
        return service.getDeptsGl();
    }
    
    public List<String> getComsGl() {
        return service.getComsGl();
    }
    
    
    
   public void removeUser(InfoUsuario user){
        try {
            //remove the item from that position and in the static array list in user service.
            UserService.removeUser(users.indexOf(user));            
            users.remove(user);                    
     } catch (Exception e) {
         e.printStackTrace();
     }
   }
   
   public String modifyUser(InfoUsuario user){
       
       userNumber= users.indexOf(user);
       UserService.setUserNumber(userNumber);
       
       UserService.setIdMod(user.getId());
       UserService.setUsernameMod(user.getUsername());
       UserService.setNameMod(user.getName());
       UserService.setLastNameMod(user.getLastName());
       UserService.setRoleMod(user.getRole());
       UserService.setDeptMod(user.getDepartment());
       UserService.setComMod(user.getCommittee());
       UserService.setEmailMod(user.getEmail());
       UserService.setAlertMod(user.getAlerts());
       UserService.setStateMod(user.isState());
       UserService.setPassMod(user.getPassword());
       
      return "modUser?faces-redirect=true";
   }

    
    /*
    public class ArrayListExample
        {
            public static void main(String[] args)
            {
                ArrayList<String> namesList = new ArrayList<String>(Arrays.asList( "alex", "brian", "charles") );

                System.out.println(namesList);  //list size is 3

                //Add element at 1 index
                namesList.remove(1);

                System.out.println(namesList);  //list size is 2
            }
        }
    */
}
