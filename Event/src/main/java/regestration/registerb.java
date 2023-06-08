package regestration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 * Servlet implementation class registerb
 */
@WebServlet("/registerb")
public class registerb extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fname= request.getParameter("fname");
		String lname= request.getParameter("lname");
		String number= request.getParameter("Phnum");
		String mail= request.getParameter("Email");
		String password= request.getParameter("pswd");
		PrintWriter out=response.getWriter();
		out.println(fname);
		out.println(lname);
		out.println(number);
		out.println(mail);
		out.println(password);
		RequestDispatcher dispatcher=null;
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?useSSL=false","root","root");
			PreparedStatement pst=con.prepareStatement("insert into register1 values(?,?,?,?,?)");
			pst.setString(1, fname);
			pst.setString(2, lname);
			pst.setString(3, number);
			pst.setString(4, mail);
			pst.setString(5, password);
			int rowcount=pst.executeUpdate();
			dispatcher=request.getRequestDispatcher("register.jsp");
			if(rowcount>0) {
				request.setAttribute("status","success");
			}
			else
				request.setAttribute("status","failed");
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
