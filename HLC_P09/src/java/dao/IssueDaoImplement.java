/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Issue;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import persistence.NewHibernateUtil;

/**
 *
 * @author migva
 */
public class IssueDaoImplement implements IssueDao {

    @Override
    public ArrayList<Issue> getIssues() {
        Session session = null;
        ArrayList<Issue> issues = null;
        
        try{
            session = NewHibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("from Issue");
            issues = (ArrayList<Issue>) query.list();
        } catch (HibernateException HE){
            System.err.println(HE.getCause());
            System.err.println("Error doing a trabajo select.");
        } finally {
            if (session != null){
                session.close();
            }
        }
        return issues;    
    }
    
    @Override
    public ArrayList<Issue> getIssues(int cod) {
        Session session = null;
        ArrayList<Issue> issues = null;
        
        try{
            session = NewHibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("from Issue where cod_client = :cod");
            query.setParameter("cod", cod);
            issues = (ArrayList<Issue>) query.list();
        } catch (HibernateException HE){
            System.err.println(HE.getCause());
            System.err.println("Error doing a trabajo select.");
        } finally {
            if (session != null){
                session.close();
            }
        }
        return issues;    
    }

    @Override
    public void insertIssue(Issue entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editIssue(Issue entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteIssue(Issue entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
