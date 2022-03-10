/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Client;

/**
 *
 * @author migva
 */
public interface ClientDao {
    public ArrayList<Client> getClients();
    public ArrayList<Client> getClients(int cod);
    public void insertClient(Client client);
    public void editClient(Client client);
    public void deleteClient(Client client);
}
