/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Client;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import persistence.NewHibernateUtil;

/**
 *
 * @author migva
 */
public class ClientDaoImplement implements ClientDao {
    @Override
    public ArrayList<Client> getClients() {
        Session session = null;
        ArrayList<Client> clients = null;
        
        try{
            session = NewHibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("from Client");
            clients = (ArrayList<Client>) query.list();
        } catch (HibernateException HE){
            System.err.println(HE.getCause());
            System.err.println("Error doing a trabajo select.");
        } finally {
            if (session != null){
                session.close();
            }
        }
        return clients;
    }
    
    @Override
    public ArrayList<Client> getClients(int cod) {
        Session session = null;
        ArrayList<Client> clients = null;
        
        try{
            session = NewHibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("from Client where cod_lawyer =:cod");
            query.setParameter("cod", cod);
            clients = (ArrayList<Client>) query.list();
        } catch (HibernateException HE){
            System.err.println(HE.getCause());
            System.err.println("Error doing a trabajo select.");
        } finally {
            if (session != null){
                session.close();
            }
        }
        return clients;
    }

    @Override
    public void insertClient(Client client) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editClient(Client client) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteClient(Client client) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
