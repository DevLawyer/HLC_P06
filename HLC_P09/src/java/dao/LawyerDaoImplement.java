/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Lawyer;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import persistence.NewHibernateUtil;

/**
 *
 * @author migva
 */
public class LawyerDaoImplement implements LawyerDao {

    @Override
    public ArrayList<Lawyer> getLawyers() {
        Session session = null;
        ArrayList<Lawyer> lawyers = null;
        
        try{
            session = NewHibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("from Issue");
            lawyers = (ArrayList<Lawyer>) query.list();
        } catch (HibernateException HE){
            System.err.println(HE.getCause());
            System.err.println("Error doing a trabajo select.");
        } finally {
            if (session != null){
                session.close();
            }
        }
        return lawyers;    
    }
    
    public Lawyer validateLawyer(String username, String password) {
        Session session = null;
        Lawyer lawyer = null;
        try {
            session = NewHibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("from Lawyer where USER_NAME =:user and USER_PASSWORD = :pass");
            query.setParameter("user",username);
            query.setParameter("pass",password);
            lawyer = (Lawyer) query.uniqueResult();
        } catch (HibernateException HE) {
            System.err.println(HE.getCause());
            System.err.println("Error validar usuario.");
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return lawyer;
    }

    @Override
    public void insertLawyer(Lawyer lawyer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editLawyer(Lawyer lawyer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteLawyer(Lawyer lawyer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
