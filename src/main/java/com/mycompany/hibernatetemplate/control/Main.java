/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hibernatetemplate.control;

import com.mycompany.hibernatemodel.entities.ContactsInfo;
import com.mycompany.hibernatemodel.entities.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import  org.springframework.orm.hibernate4.LocalSessionFactoryBean;
/**
 *
 * @author shibo
 */
public class Main {

    public static void main(String[] args) {
        try {
            ApplicationContext app = new FileSystemXmlApplicationContext("src/main/resources/beans.xml");
            DaoCrud dao = (DaoCrud) app.getBean("personDAO");
            System.out.println("" + dao.addUser(new User("shiboooooooooooo", "dskdsl", "dsjds", "dsdksl")));
            System.out.println("success");
        } catch (Exception e) {

            e.printStackTrace();
        }

    }
}
