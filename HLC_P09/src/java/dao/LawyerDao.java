/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Lawyer;

/**
 *
 * @author migva
 */
public interface LawyerDao {
    public ArrayList<Lawyer> getLawyers();
    public Lawyer validateLawyer(String userName, String password);
    public void insertLawyer(Lawyer lawyer);
    public void editLawyer(Lawyer lawyer);
    public void deleteLawyer(Lawyer lawyer);
}
