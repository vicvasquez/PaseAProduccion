/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import bean.PpUsuarios;
import java.util.List;
import org.hibernate.Session;


/**
 *
 * @author jmoscoso
 */
public class UsuarioRepository implements BasicRepository<PpUsuarios, Integer>{

    @Override
    public void add(PpUsuarios e) {
        
            Session session = newHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(e);
            session.getTransaction().commit();
    }

    @Override
    public void update(PpUsuarios e) {
         Session session = newHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(e);
            session.getTransaction().commit();
    }

    @Override
    public void delete(Integer id) {
      Session session = newHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(find(id));
            session.getTransaction().commit();
    
    }

    @Override
    public PpUsuarios find(Integer id) {
        Session session = newHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            PpUsuarios usuario =   (PpUsuarios)session.get(PpUsuarios.class, id);
            session.getTransaction().commit();
    
            return usuario;
    }

    @Override
    public List<PpUsuarios> listAll() {
    
        Session session = newHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            List<PpUsuarios> LstUsuario = session.createQuery("from PpUsuarios").list();
        session.getTransaction().commit();
        
        return LstUsuario;
    }

    public PpUsuarios get(String username, String password) {
        Session session = newHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            List<PpUsuarios> LstUsuario = session.createQuery("from PpUsuarios where NOMBRE_USUARIO = '"+ username+"' and CLAVE = '"+password+"';").list();
        session.getTransaction().commit();
        
        return LstUsuario.get(0);
    }
    
    
    
}
