package regestration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.xdevapi.Statement;
import java.sql.*;

/**
 * Servlet implementation class adminaddb
 */
@WebServlet("/adminaddb")
public class adminaddb extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String iu=request.getParameter("up");
		String values=request.getParameter("upval");
		int n;
		
		HttpSession session=request.getSession();
		RequestDispatcher dispatcher=null;
		Connection con=null;
		PrintWriter out=response.getWriter();
		out.println(iu);
		out.println(values);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?useSSL=false","root","root");
			
			PreparedStatement pst=con.prepareStatement("update addevents set events=? where name='Nithin'");
			pst.setString(1, values);
			int rs=pst.executeUpdate();
		
			
			
				//session.setAttribute("eventslist", rs1.getString("events"));
				//session.setAttribute("loginname1", rs.getString("name"));
			if(rs==1)
				dispatcher=request.getRequestDispatcher("support.jsp");
			
			
			
			
			//------------------->
			
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
