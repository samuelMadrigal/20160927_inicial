/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.servlets;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Samu
 */
@WebServlet(name = "CicloDeVida", urlPatterns = {"/ciclo"})
public class CicloDeVida extends HttpServlet {
    
    
    @Override
    public void init(ServletConfig config){
        System.out.println("INIT()");
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("SERVICE()");
    }

    @Override
    public void destroy(){
        System.out.println("DESTROY()");
    }
}
