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

/**
 * Servlet implementation class addeventsb
 */
@WebServlet("/eventsback")
public class addeventsb extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username1=request.getParameter("uname1");
		String passw1=request.getParameter("pswd1");
		HttpSession session=request.getSession();
		RequestDispatcher dispatcher=null;
		Connection con=null;
		PrintWriter out=response.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?useSSL=false","root","root");
			PreparedStatement pst=con.prepareStatement("select * from addevents where name=? and password=?");
			pst.setString(1, username1);
			pst.setString(2, passw1);
			ResultSet rs=pst.executeQuery();
			if(rs.next()) {
				session.setAttribute("username1", rs.getString("name"));
				session.setAttribute("loginname1", rs.getString("name"));
				dispatcher=request.getRequestDispatcher("adminaddu.jsp");
			}
			else {
				request.setAttribute("status1","failed");
			dispatcher=request.getRequestDispatcher("events1.jsp");
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
