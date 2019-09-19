/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

import complaintProcess.HibernateUtil;
import complaintProcess.User;
import functionalities.Hash;
import java.util.List;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

/**
 *
 * @author Azure
 */
public class LoginHelper {
    
    Session session = null;
    
    public LoginHelper(){
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public boolean userLogin(String username, String password) {
        List<User> userList = null;
        try {
            password=Hash.sha1(password);
            org.hibernate.Transaction tx = session.beginTransaction();
            org.hibernate.query.NativeQuery q;            
            q = (NativeQuery) session.createNativeQuery("select u.username,u.password from User as u where u.username= :name and u.password= :pass ;");
            q.setParameter("name", username);                      
            q.setParameter("pass", password);
            
            
            // q = (NativeQuery) session.createNativeQuery("select u.username,u.password from User as u where u.username= '"+ username + "' and u.password= '" + password +"' ;");
            //q = (NativeQuery) session.createNativeQuery("select u.username,u.password from User as u where u.username= '"+ username + "' and u.password= '" + password +"' ;");

            
            // Query q = session.createQuery ("from Actor as actor where actor.actorId in (select filmActor.actor.actorId from FilmActor as filmActor where filmActor.film.filmId='" + filmId + "')");

            
            
/* Native-SQL */
//Query sqlQuery = session.createNativeQuery("Select * from Books where author = ?");
//List results = sqlQuery.setParameter(0, "Charles Dickens").list();
            /*
            List results = query.getResultList();
            Entity foundEntity = null;
            if(!results.isEmpty()){
                // ignores multiple results
                foundEntity = results.get(0);
            }
            */
            
           /*
           q = (NativeQuery) session.createNativeQuery("select u.username,u.password from User as u where u.username= '"+ username + "' and u.password= '" +password+ "';");
           q.setParameter("name", username);                      
           q.setParameter("pass", password);*/
           
           
           
           userList = (List<User>) q.list();
           //int x = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
       
        return !userList.isEmpty();
    }
    
}
