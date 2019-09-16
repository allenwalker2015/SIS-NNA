/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Azure
 */
@ManagedBean(name = "userService")
@ApplicationScoped
public class UserService {
     
    //test variables
    private final static String[] colors;
    private final static String[] brands;
    
    //Main Arrays to save the information, as a "pseudo" database
    private static List<String> ids;
    private static List<String> usernames;
    private static List<String> names;
    private static List<String> lastNames;
    private static List<String> roles;
    private static List<String> departments;
    private static List<String> committees;
    private static List<String> emails;
    private static List<String> alerts;
    private static List<Boolean> states;
    private static List<String> passwords;
    
    //Global variables
    private static int totalUsers=5;

    //The set objects of the base, like the 3 roles at the moment.
    private static List<String> rolesGl;
    private static List<String> deptsGl;
    private static List<String> comsGl;
    
    //Variables to save between pages. Used when modify user is used.
    private static String idMod;
    private static String usernameMod;
    private static String nameMod;
    private static String lastNameMod;
    private static String roleMod;
    private static String deptMod;
    private static String comMod;
    private static String emailMod;
    private static String alertMod;
    private static boolean stateMod;
    private static String passMod;
    
    //to know which one is being modified
    private static int userNumber;
    
    
    
    //Initializing the Arrays
    static {
        colors = new String[10];
        colors[0] = "Black";
        colors[1] = "White";
        colors[2] = "Green";
        colors[3] = "Red";
        colors[4] = "Blue";
        colors[5] = "Orange";
        colors[6] = "Silver";
        colors[7] = "Yellow";
        colors[8] = "Brown";
        colors[9] = "Maroon";
         
        brands = new String[10];
        brands[0] = "BMW";
        brands[1] = "Mercedes";
        brands[2] = "Volvo";
        brands[3] = "Audi";
        brands[4] = "Renault";
        brands[5] = "Fiat";
        brands[6] = "Volkswagen";
        brands[7] = "Honda";
        brands[8] = "Jaguar";
        brands[9] = "Ford";
        
        
        ids=new ArrayList<String>();
        ids.add("35c9a7fe");
        ids.add("92ade7bb");
        ids.add("3ee5ff6f");
        ids.add("1853d541");
        ids.add("2597292f");
        
        usernames=new ArrayList<String>();
        usernames.add("UserGl1");
        usernames.add("UserGl2");
        usernames.add("ComGl1");
        usernames.add("ComGl2");
        usernames.add("AdminGl1");
        
        names= new ArrayList<String>();
        names.add("Erick");
        names.add("Xavier");
        names.add("Kevin");
        names.add("Miguel");
        names.add("Javier");
        
        lastNames=new ArrayList<String>();
        lastNames.add("Dominguez");
        lastNames.add("Figueroa");
        lastNames.add("Pérez");
        lastNames.add("Vides");
        lastNames.add("Corvera");
        
        roles= new ArrayList<String>();
        roles.add("User");
        roles.add("User");
        roles.add("Committee");
        roles.add("Committee");
        roles.add("Administrator");
        
        departments=new ArrayList<String>();
        departments.add("Finanza");
        departments.add("Mercadeo");
        departments.add("Gerencia");
        departments.add("Recursos Humanos");
        departments.add("Informática");
        
        committees=new ArrayList<String>();
        committees.add("a");
        committees.add("b");
        committees.add("c");
        committees.add("d");
        committees.add("e");
        
        emails=new ArrayList<String>();
        emails.add("email1@server.com");
        emails.add("email2@server.com");
        emails.add("email3@server.com");
        emails.add("email4@server.com");
        emails.add("email5@server.com");
        
        alerts=new ArrayList<String>();
        alerts.add("1");
        alerts.add("2");
        alerts.add("3");
        alerts.add("4");
        alerts.add("5");     
        
        states=new ArrayList<Boolean>();
        states.add(true);
        states.add(false);
        states.add(true);
        states.add(false);
        states.add(true);
        
        passwords=new ArrayList<String>();
        passwords.add("123");
        passwords.add("456");
        passwords.add("789");
        passwords.add("101");
        passwords.add("121");
        
        rolesGl=new ArrayList<String>();
        rolesGl.add("User");
        rolesGl.add("Committee");
        rolesGl.add("Administrator");
        
        deptsGl=new ArrayList<String>();
        deptsGl.add("Finanza");
        deptsGl.add("Mercadeo");
        deptsGl.add("Gerencia");
        deptsGl.add("Recursos Humanos");
        deptsGl.add("Informática");
        
        comsGl=new ArrayList<String>();
        comsGl.add("a");
        comsGl.add("b");
        comsGl.add("c");
        comsGl.add("d");
        comsGl.add("e");
    }
    
    //Creating the list of users
    public List<InfoUsuario> createUsers(int size) {
        List<InfoUsuario> list = new ArrayList<InfoUsuario>();
        for(int i = 0 ; i < size ; i++) {
            list.add(new InfoUsuario(getId(i), getUsername(i), getName(i), getLastName(i), getRole(i), getDepartment(i), getCommittee(i), getEmail(i), getAlert(i), getState(i),getPassword(i) ));
        }                    
        return list;
    }
    
    

    //Getting the specific information of each user
    private String getRandomId() {
        return UUID.randomUUID().toString().substring(0, 8);
    }
    
    private String getId(int i){
        return ids.get(i);        
    }
    
    private String getUsername(int i){
        return usernames.get(i);        
    }
    
    private String getName(int i){
        return names.get(i);        
    }
    
    private String getLastName(int i){
        return lastNames.get(i);        
    }
    
    private String getRole(int i){
        return roles.get(i);        
    }
    
    private String getDepartment(int i){
        return departments.get(i);        
    }
    
    private String getCommittee(int i){
        return committees.get(i);        
    }
    
    private String getEmail(int i){
        return emails.get(i);        
    }
    
    private String getAlert(int i){
        return alerts.get(i);        
    }
    
    private boolean getState(int i){
        return states.get(i);        
    }
    
    private String getPassword(int i){
        return passwords.get(i);        
    }
    
    
    //Total users
    public static int getTotalUsers() {
        return totalUsers;
    }

    public static void setTotalUsers(int totalUsers) {
        UserService.totalUsers = totalUsers;
    }
  

    
    //Getters and Setters of the whole arrays

    public static List<String> getIds() {
        return ids;
    }

    public static void setIds(List<String> ids) {
        UserService.ids = ids;
    }

    public static List<String> getUsernames() {
        return usernames;
    }

    public static void setUsernames(List<String> usernames) {
        UserService.usernames = usernames;
    }

    public static List<String> getNames() {
        return names;
    }

    public static void setNames(List<String> names) {
        UserService.names = names;
    }

    public static List<String> getLastNames() {
        return lastNames;
    }

    public static void setLastNames(List<String> lastNames) {
        UserService.lastNames = lastNames;
    }

    public static List<String> getRoles() {
        return roles;
    }

    public static void setRoles(List<String> roles) {
        UserService.roles = roles;
    }

    public static List<String> getDepartments() {
        return departments;
    }

    public static void setDepartments(List<String> departments) {
        UserService.departments = departments;
    }

    public static List<String> getCommittees() {
        return committees;
    }

    public static void setCommittees(List<String> committees) {
        UserService.committees = committees;
    }

    public static List<String> getEmails() {
        return emails;
    }

    public static void setEmails(List<String> emails) {
        UserService.emails = emails;
    }

    public static List<String> getAlerts() {
        return alerts;
    }

    public static void setAlerts(List<String> alerts) {
        UserService.alerts = alerts;
    }

    public static List<Boolean> getStates() {
        return states;
    }

    public static void setStates(List<Boolean> states) {
        UserService.states = states;
    }

    public static List<String> getPasswords() {
        return passwords;
    }

    public static void setPasswords(List<String> passwords) {
        UserService.passwords = passwords;
    }
    
    
    
    //Roles, committees and departments to put in the selection box
    //Roles, comites y departamentos para búsqueda.

    public static List<String> getRolesGl() {
        return rolesGl;
    }

    public static void setRolesGl(List<String> rolesGl) {
        UserService.rolesGl = rolesGl;
    }

    public static List<String> getDeptsGl() {
        return deptsGl;
    }

    public static void setDeptsGl(List<String> deptsGl) {
        UserService.deptsGl = deptsGl;
    }

    public static List<String> getComsGl() {
        return comsGl;
    }

    public static void setComsGl(List<String> comsGl) {
        UserService.comsGl = comsGl;
    }
    
    
    
    //Adding new users characteristic for new User page.
    //Añadiendo nuevas características del nuevo usuario.
   public static void setNewState(boolean state){
       
       UserService.states.add(state);
   }
   
    public static void setNewId(String id){
       UserService.ids.add(id);
   }
    
     public static void setNewUsername(String username){
       UserService.usernames.add(username);
   }
     
    public static void setNewPassword(String password){
       UserService.passwords.add(password);
   }
    
    public static void setNewName(String name){
       UserService.names.add(name);
   }
    
    public static void setNewLastName(String lastName){
       UserService.lastNames.add(lastName);
   }
    
    public static void setNewRole(String role){
       UserService.roles.add(role);
   }
    
    public static void setNewDepartment(String depto){
       UserService.departments.add(depto);
   }
    
    public static void setNewCommittee(String com){
       UserService.committees.add(com);
   }
    
    public static void setNewEmail(String email){
       UserService.emails.add(email);
   }
    
    public static void setNewAlert(String alert){
       UserService.alerts.add(alert);
   }
    
    //Deleting a User from the "database"
    //Removiendo datos de un usuario
    public static void removeUser(int i){
        UserService.setTotalUsers(UserService.getTotalUsers()-1); 
        UserService.ids.remove(i);
        UserService.usernames.remove(i);
        UserService.names.remove(i);
        UserService.lastNames.remove(i);
        UserService.roles.remove(i);
        UserService.passwords.remove(i);
        UserService.departments.remove(i);
        UserService.committees.remove(i);
        UserService.emails.remove(i);
        UserService.alerts.remove(i);
        UserService.states.remove(i);
        
    }

    
    //getters and setters to modify user
    //getters y setters para modificar usuario.
    public static String getIdMod() {
        return idMod;
    }

    public static void setIdMod(String idMod) {
        UserService.idMod = idMod;
    }

    public static String getUsernameMod() {
        return usernameMod;
    }

    public static void setUsernameMod(String usernameMod) {
        UserService.usernameMod = usernameMod;
    }

    public static String getLastNameMod() {
        return lastNameMod;
    }

    public static void setLastNameMod(String lastNameMod) {
        UserService.lastNameMod = lastNameMod;
    }

    public static String getRoleMod() {
        return roleMod;
    }

    public static void setRoleMod(String roleMod) {
        UserService.roleMod = roleMod;
    }

    public static String getDeptMod() {
        return deptMod;
    }

    public static void setDeptMod(String deptMod) {
        UserService.deptMod = deptMod;
    }

    public static String getComMod() {
        return comMod;
    }

    public static void setComMod(String comMod) {
        UserService.comMod = comMod;
    }

    public static String getEmailMod() {
        return emailMod;
    }

    public static void setEmailMod(String emailMod) {
        UserService.emailMod = emailMod;
    }

    public static String getAlertMod() {
        return alertMod;
    }

    public static void setAlertMod(String alertMod) {
        UserService.alertMod = alertMod;
    }

    public static boolean isStateMod() {
        return stateMod;
    }

    public static void setStateMod(boolean stateMod) {
        UserService.stateMod = stateMod;
    }

    public static String getPassMod() {
        return passMod;
    }

    public static void setPassMod(String passMod) {
        UserService.passMod = passMod;
    }

    public static int getUserNumber() {
        return userNumber;
    }

    public static void setUserNumber(int userNumber) {
        UserService.userNumber = userNumber;
    }

    public static String getNameMod() {
        return nameMod;
    }

    public static void setNameMod(String nameMod) {
        UserService.nameMod = nameMod;
    }
    
    
    //Modify a user
    
    
    public static void setModId(int i, String id){
        ids.set(i, id);  
    }
    
    public static void setModUsername(int i, String username){
        usernames.set(i, username);  
    }
    
    public static void setModName(int i, String name){
        names.set(i, name);  
    }
    
    public static void setModLastName(int i, String lastName){
        lastNames.set(i, lastName);  
    }
    
    public static void setModRole(int i, String mod){
        roles.set(i, mod);  
    }
    
    public static void setModDepartment(int i, String mod){
        departments.set(i, mod);  
    }
    
    public static void setModCommittee(int i, String mod){
        committees.set(i, mod);  
    }
    
    public static void setModEmail(int i, String mod){
        emails.set(i, mod);  
    }
    
    public static void setModAlert(int i, String mod){
        alerts.set(i, mod);  
    }
    
    public static void setModState(int i, boolean mod){
        states.set(i, mod);  
    }
    
    public static void setModPassword(int i, String mod){
        passwords.set(i, mod);  
    }
    
    
        

}


