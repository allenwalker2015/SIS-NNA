package complaintProcess;
// Generated Aug 31, 2019 12:09:55 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * User generated by hbm2java
 */
public class User  implements java.io.Serializable {


     private Integer iduser;
     private TypeUser typeUser;
     private String username;
     private String password;
     private Date createdUp;
     private Date updatedUp;
     private Set<UserRole> userRoles = new HashSet<UserRole>(0);
     private Set<Staff> staffs = new HashSet<Staff>(0);

    public User() {
    }

	
    public User(TypeUser typeUser, String username, String password, Date createdUp) {
        this.typeUser = typeUser;
        this.username = username;
        this.password = password;
        this.createdUp = createdUp;
    }
    public User(TypeUser typeUser, String username, String password, Date createdUp, Date updatedUp, Set<UserRole> userRoles, Set<Staff> staffs) {
       this.typeUser = typeUser;
       this.username = username;
       this.password = password;
       this.createdUp = createdUp;
       this.updatedUp = updatedUp;
       this.userRoles = userRoles;
       this.staffs = staffs;
    }
   
    public Integer getIduser() {
        return this.iduser;
    }
    
    public void setIduser(Integer iduser) {
        this.iduser = iduser;
    }
    public TypeUser getTypeUser() {
        return this.typeUser;
    }
    
    public void setTypeUser(TypeUser typeUser) {
        this.typeUser = typeUser;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
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
    public Set<UserRole> getUserRoles() {
        return this.userRoles;
    }
    
    public void setUserRoles(Set<UserRole> userRoles) {
        this.userRoles = userRoles;
    }
    public Set<Staff> getStaffs() {
        return this.staffs;
    }
    
    public void setStaffs(Set<Staff> staffs) {
        this.staffs = staffs;
    }




}


