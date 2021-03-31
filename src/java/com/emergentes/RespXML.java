
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RespXML", urlPatterns = {"/RespXML"})
public class RespXML extends HttpServlet {


   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           response.setContentType("texxt/xml;charset=UTF-8");
         PrintWriter out = response.getWriter();
        try{
           
            out.println("<?xml version=\"1.0\"encoding=\"UTF-8\"?>");
            out.println("<CATALOGO>");
           out.println("<CD>");
            out.println("<TITULO>La Lengua Popular</TITULO>");
            out.println("<ARTISTA> Andres Calamaro </ARTISTA>");
            out.println("<ORIGEN> AR</ORIGEN>");
            out.println("<PRECIO> 9.90</PRECIO>");
            out.println("<AÑO>2007<>AÑO/");
            out.println("</CD>");
            out.println("</CATALOGO>");
            
        
        }finally{
        out.close();
        }
    }

}
