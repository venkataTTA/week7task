/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class StudentServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter())
        {  
            Connection con=null;
             Statement stmt=null;
             String b="",c="";
             int a,d;
               a=Integer.parseInt(request.getParameter("sid"));
               b=request.getParameter("FirstName");
               c=request.getParameter("LastName");
               d=Integer.parseInt(request.getParameter("score"));
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            String URL = "jdbc:derby://localhost:1527/TTA1";//DB location
            String user = "root";//DB user name
            String pwd = "root";//DB password
            
            con = DriverManager.getConnection(URL , user , pwd);           
            stmt=con.createStatement();
           int r= stmt.executeUpdate("insert into student values("+a+",'"+b+"','"+c+"',"+d+")");
           if(r!=1)
           {
               out.print(" cannot insert");
           }
           else{
               out.println("<h1>your record created Successfully!!</h1>");
           }
           
           
         //  out.println("<h1>your record created Successfully!!</h1>");
        }
            
            catch(Exception e)
            {
                out.print("sorry !! Try again.."+e);
            }
  
    
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
                    {
        processRequest(request, response);
    
                    }
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
                    {
        processRequest(request, response);
            }

 
    @Override
    public String getServletInfo()
    {
        return "Short description";
    }// </editor-fold>

}
