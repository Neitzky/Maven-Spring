/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fandita.web;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



/**
 *
 * @author T107
 */
public class DAO {
    private static final ThreadLocal t1 = new ThreadLocal();
    
    //private static final SessionFactory sessionFactory=new AnnotationConfiguration
    
    private static final SessionFactory sessionFactory=new Configuration()
            .configure("hibernate.cfg.xml").buildSessionFactory();
    
    public DAO(){}
    
    public static Session getSession(){
        Session session= (Session) DAO.t1.get();
        if (session==null){
            session=sessionFactory.openSession();
            DAO.t1.set(session);
            
        }
        
        return session;
        
    }
            
        }
    
            

