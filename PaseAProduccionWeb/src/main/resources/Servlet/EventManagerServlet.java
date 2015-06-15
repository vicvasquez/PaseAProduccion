/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import DAO.newHibernateUtil;
import java.io.IOException;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jmoscoso
 */
public class EventManagerServlet {
    
        protected void doGet(
HttpServletRequest request,
HttpServletResponse response) throws ServletException, IOException {

SimpleDateFormat dateFormatter = new SimpleDateFormat( "dd.MM.yyyy" );

try {
// Begin unit of work
newHibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();

// Process request and render page...

// End unit of work
newHibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
}
catch (Exception ex) {
newHibernateUtil.getSessionFactory().getCurrentSession().getTransaction().rollback();
if ( ServletException.class.isInstance( ex ) ) {
throw ( ServletException ) ex;
}
else {
throw new ServletException( ex );
}
}
}

    
}
