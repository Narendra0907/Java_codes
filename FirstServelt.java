package test;

import java.io.PrintWriter;



import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/first")
public class FirstServelt extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res) 
	{
     try{
        PrintWriter pw=res.getWriter();
        pw.println("narendra welcome.......");
     }catch (Exception e)
    {
	System.err.println();
     }
	}
  }