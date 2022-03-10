/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Issue;

/**
 *
 * @author migva
 */
public interface IssueDao {
    public ArrayList<Issue> getIssues();
    public ArrayList<Issue> getIssues(int cod);
    public void insertIssue(Issue entity);
    public void editIssue(Issue entity);
    public void deleteIssue(Issue entity);
}
