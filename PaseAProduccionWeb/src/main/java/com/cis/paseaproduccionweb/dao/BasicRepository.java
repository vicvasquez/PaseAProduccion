/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cis.paseaproduccionweb.dao;

import java.util.List;

/**
 *
 * @author jmoscoso
 */
public interface BasicRepository <Entity,ID> {
    
    void add(Entity e);
    void update(Entity e);
    void delete(ID id);
    Entity find(ID id);
    List<Entity> listAll();
    
    
}
