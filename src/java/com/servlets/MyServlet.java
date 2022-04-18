package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
/**
 * using HttpServlet which is protocol specific servlet and is used for get,post methods
 * @author amanagrawal
 */
public class MyServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("this is a get method call.....");
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        out.println("<h1>this is get method called from servlet</h1>");
    }
    
}
