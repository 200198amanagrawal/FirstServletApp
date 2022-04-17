
package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
/**
 *
 * @author amanagrawal
 */
public class FirstServlet implements Servlet{

    ServletConfig conf;
    //LifeCycle method 
    @Override
    public void init(ServletConfig config) throws ServletException {
        conf=config;
        System.out.println("creating object...");
    }

    @Override
    public ServletConfig getServletConfig() {
        return conf;
    }

    //LifeCycle method 
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Servicing.....");
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        out.println("<h1>Response from servlet</h1>");
    }

    @Override
    public String getServletInfo() {
        return "Servlet got created by a user";
    }

    //LifeCycle method 
    @Override
    public void destroy() {
        System.out.println("Going to destroy servlet object.....");
    }
    
}
