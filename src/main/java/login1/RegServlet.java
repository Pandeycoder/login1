package login1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

/**
 * Servlet implementation class RegServlet
 */
public class RegServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       Connection con;
    /**
     * @see GenericServlet#GenericServlet()
     */
    public RegServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","pandey","coder");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String s1=request.getParameter("fname");
			String s2=request.getParameter("eid");
			String s3=request.getParameter("pword");
			
			String s4=request.getParameter("mob");
			String s5=request.getParameter("linkdin");
			String s6=request.getParameter("github");
			String s7=request.getParameter("quali");
			String s8=request.getParameter("sub");
			String s9=request.getParameter("call");
			String s10=request.getParameter("year");
			String s11=request.getParameter("gender");
			String s12=request.getParameter("ccode");
			
			
			PreparedStatement psmt=con.prepareStatement("insert into reg8 values(?,?,?,?,?,?,?,?,?,?,?,?)");
		    psmt.setString(1, s1);
		    psmt.setString(2, s2);
		    psmt.setString(3, s3);
		    psmt.setString(4, s4);
		    psmt.setString(5, s5);
		    psmt.setString(6, s6);
		    psmt.setString(7, s7);
		    psmt.setString(8, s8);
		    psmt.setString(9, s9);
		    psmt.setString(10, s10);
		    psmt.setString(11, s11);
		    psmt.setString(12, s12);
		 
		    psmt.execute();
		    
		    PrintWriter pw=response.getWriter();
		    pw.println("<html><body bgcolor=orange text=yellow><center>");
		    pw.println("<h1>You have Registered Suiccessfully </h1> ");
		    pw.println("<br><a href=login.jsp>Login</a>");
		    pw.println("</center></body></html>");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
