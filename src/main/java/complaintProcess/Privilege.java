package complaintProcess;
// Generated Aug 31, 2019 12:09:55 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Privilege generated by hbm2java
 */
public class Privilege  implements java.io.Serializable {


     private Integer idprivilege;
     private String privilegeName;
     private Date createdUp;
     private Date updatedUp;
     private Set<RolePrivilege> rolePrivileges = new HashSet<RolePrivilege>(0);

    public Privilege() {
    }

	
    public Privilege(String privilegeName, Date createdUp) {
        this.privilegeName = privilegeName;
        this.createdUp = createdUp;
    }
    public Privilege(String privilegeName, Date createdUp, Date updatedUp, Set<RolePrivilege> rolePrivileges) {
       this.privilegeName = privilegeName;
       this.createdUp = createdUp;
       this.updatedUp = updatedUp;
       this.rolePrivileges = rolePrivileges;
    }
   
    public Integer getIdprivilege() {
        return this.idprivilege;
    }
    
    public void setIdprivilege(Integer idprivilege) {
        this.idprivilege = idprivilege;
    }
    public String getPrivilegeName() {
        return this.privilegeName;
    }
    
    public void setPrivilegeName(String privilegeName) {
        this.privilegeName = privilegeName;
    }
    public Date getCreatedUp() {
        return this.createdUp;
    }
    
    public void setCreatedUp(Date createdUp) {
        this.createdUp = createdUp;
    }
    public Date getUpdatedUp() {
        return this.updatedUp;
    }
    
    public void setUpdatedUp(Date updatedUp) {
        this.updatedUp = updatedUp;
    }
    public Set<RolePrivilege> getRolePrivileges() {
        return this.rolePrivileges;
    }
    
    public void setRolePrivileges(Set<RolePrivilege> rolePrivileges) {
        this.rolePrivileges = rolePrivileges;
    }




}


