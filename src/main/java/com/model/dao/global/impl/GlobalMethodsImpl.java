package com.model.dao.global.impl;

import com.model.dao.HibernateUtil;
import com.model.dao.global.GlobalMethods;
import org.hibernate.Criteria;
import org.hibernate.Session;

import java.util.List;

public class GlobalMethodsImpl implements GlobalMethods {
    public boolean save(Object entity) {
        Session session = openSession();
        session.getTransaction().begin();
        try{
            session.save(entity);
            session.getTransaction().commit();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            session.getTransaction().rollback();
            return false;
        }finally {
            session.close();
        }
    }

    public boolean delete(Object entity) {
        Session session = openSession();
        session.getTransaction().begin();
        try {
            session.delete(entity);
            session.getTransaction().commit();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            session.getTransaction().rollback();
            return false;
        }finally {
            session.close();
        }
    }

    public <T> List<T> getAllData(Class<T> entity) {
        Session session = openSession();
        try {
            Criteria criteria = session.createCriteria(entity);
            return criteria.list();
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            session.close();
        }
    }

    private Session openSession(){
        try {
            return HibernateUtil.getSessionFactory().openSession();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
