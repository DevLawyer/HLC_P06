/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Entity;

/**
 *
 * @author migva
 */
public interface EntityDao {
    public ArrayList<Entity> getEntities();
    public void insertEntity(Entity entity);
    public void editEntity(Entity entity);
    public void deleteEntity(Entity entity);
}
