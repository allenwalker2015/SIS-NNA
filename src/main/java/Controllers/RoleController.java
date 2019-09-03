/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Helpers.RoleHelper;
import complaintProcess.Privilege;
import complaintProcess.Role;
import complaintProcess.User;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author Azure
 */
@Named(value = "roleController")
@ManagedBean
@SessionScoped
public class RoleController implements Serializable {
    
    int startId;
    int endId;
    DataModel roleTitles;
    RoleHelper helper;
    private int roleCount = 1000;
    private int pageSize = 10;

    private Role current;
    private int selectedItemIndex;

    /**
     * Creates a new instance of UserController
     */
    public RoleController() {        
        helper = new RoleHelper();
        startId = 1;
        endId = 10;
    }

    public RoleController(int startId, int endId) {
        helper = new RoleHelper();
        this.startId = startId;
        this.endId = endId;
    }

    public Role getSelected() {
        if (current == null) {
            current = new Role();
            selectedItemIndex = -1;
        }
        return current;
    }


    public DataModel getRoleTitles() {
        if (roleTitles == null) {
            roleTitles = new ListDataModel(helper.getRoleTitles(startId, endId));
        }
        return roleTitles;
    }

    void recreateModel() {
        roleTitles = null;
    }
    
    
     public boolean isHasNextPage() {
        if (endId + pageSize <= roleCount) {
            return true;
        }
        return false;
    }

    public boolean isHasPreviousPage() {
        if (startId-pageSize > 0) {
            return true;
        }
        return false;
    }

    public String next() {
        startId = endId+1;
        endId = endId + pageSize;
        recreateModel();
        return "index";
    }

    public String previous() {
        startId = startId - pageSize;
        endId = endId - pageSize;
        recreateModel();
        return "index";
    }

    public int getPageSize() {
        return pageSize;
    }

    public String prepareView(){
        current = (Role) getRoleTitles().getRowData();
        return "browse";
    }
    public String prepareList(){
        recreateModel();
        return "index";
    }
    
    public String getUsers() {
        List users = helper.getRoleByID(current.getIdrole());
        StringBuffer totalCast = new StringBuffer();
        for (int i = 0; i < users.size(); i++) {
            User user = (User) users.get(i);
            totalCast.append(user.getUsername());
        }
        return totalCast.toString();
    }

    public String getPrivilege() {
        Privilege privilege = helper.getPrivilegeByID(current.getIdrole());
        return  privilege.getPrivilegeName();
    }
    
}
