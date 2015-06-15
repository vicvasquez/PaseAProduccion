

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import DAO.UsuarioRepository;
import DAO.newHibernateUtil;
import bean.PpUsuarios;
import java.io.IOException;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author eyomona
 */
public class EventManagerServlet extends HttpServlet{
        
       
        private UsuarioRepository usuarioRepository;
    
        @Override
        protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

            try {
            // Begin unit of work
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            newHibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
            
            // Process request and render page...
            PpUsuarios usuario = usuarioRepository.get(username,password);
            
                if (usuario != null) {
                request.getSession().setAttribute("usuario", usuario);
                response.sendRedirect("index.html");
                }
                else {
                    request.setAttribute("error", "Usuario o clave no registrados");
                    request.getRequestDispatcher("/login.html").forward(request, response);
                }
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