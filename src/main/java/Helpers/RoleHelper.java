/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

import complaintProcess.HibernateUtil;
import complaintProcess.Privilege;
import complaintProcess.Role;
import complaintProcess.User;
import java.util.List;
import org.hibernate.query.Query;
import org.hibernate.Session;

/**
 *
 * @author Azure
 */
public class RoleHelper {
    
    Session session = null;

    public RoleHelper() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    
    // Get users from a certain range in the DB
    public List getRoleTitles(int startID, int endID) {
        List<User> userList = null;
        try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery ("from User as user where user.iduser between '"+startID+"' and '"+endID+"'");
            userList = (List<User>) q.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userList;
    }
    
    
    //Get roles of user in DB
    public List getRoleByID(int idUser){
        List<Role> roleList = null;
        try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery ("from Role as role where role.idrole in (select userRole.role.idrole from UserRole as userRole where userRole.user.iduser='" + idUser + "')");
            roleList = (List<Role>) q.list();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return roleList;
    }
    
    public Privilege getPrivilegeByID(int idRole){
        List<Privilege> privilegeList = null;
        try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Privilege as privilege where privilege.idprivilege in (select rolePrivilege.privilege.idprivilege from RolePrivilege as rolePrivilege where rolePrivilege.role.idrole='" + idRole + "')");
                                             
            privilegeList = (List<Privilege>) q.list();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return privilegeList.get(0);
    }
    
    
    
}
