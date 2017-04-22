/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hibernatetemplate.control;

import com.mycompany.hibernatemodel.entities.ContactsInfo;
import com.mycompany.hibernatemodel.entities.User;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author shibo
 */
public class DaoCrud implements DaoInt {

    SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public boolean addUser(User user) {
        Session s = sessionFactory.openSession();
        s.beginTransaction();
        s.save(user);
        s.getTransaction().commit();
        return true;
    }

    @Override
    public User loginUser(User user) {

        User loginedUser = null;
        String sql = "from User p where p.userEmail=:email and p.userpass=:pass";
        Query query =sessionFactory.openSession().createQuery(sql);
        query.setParameter("email", user.getUserEmail());
        query.setParameter("pass", user.getUserpass());
        List<User> list = query.list();
        if (query.list().size() > 0) {

            loginedUser = list.get(0);
            return loginedUser;
        } else {
            return loginedUser;
        }
    }

    @Override
    public boolean updateUser(User u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean DeactiveUser(User u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addContact(User user, ContactsInfo contact) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editContact(User user, ContactsInfo contact) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteContact(User user, ContactsInfo contact) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ContactsInfo> showContacts(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ContactsInfo> searchContacts(User user, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

}
