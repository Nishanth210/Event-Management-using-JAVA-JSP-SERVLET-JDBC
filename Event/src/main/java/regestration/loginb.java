package regestration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class loginb
 */
@WebServlet("/loginb1")
public class loginb extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username=request.getParameter("uname");
		String passw=request.getParameter("pswd");
		HttpSession session=request.getSession();
		RequestDispatcher dispatcher=null;
		Connection con=null;
		PrintWriter out=response.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?useSSL=false","root","root");
			PreparedStatement pst=con.prepareStatement("select * from register1 where fname=? and password=?");
			pst.setString(1, username);
			pst.setString(2, passw);
			ResultSet rs=pst.executeQuery();
			if(rs.next()) {
				session.setAttribute("username", rs.getString("fname"));
				session.setAttribute("loginname", rs.getString("fname"));
				dispatcher=request.getRequestDispatcher("index.jsp");
			}
			else {
				request.setAttribute("status","failed");
			dispatcher=request.getRequestDispatcher("login.jsp");
			}
			dispatcher.forward(request, response);
		}
		catch(Exception e) {
			out.println(e);
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
