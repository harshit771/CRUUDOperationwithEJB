package com.infinite.ejb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AgentShowServlet
 */
@WebServlet("/AgentShowServlet")
public class AgentShowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgentShowServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AgentBeanRemote service=null;
		PrintWriter out=response.getWriter();
		
			try {
				service=(AgentBeanRemote) new InitialContext().lookup("AgentBean/remote");
				List<Agent> agentList=service.showAgent();
				out.println("<table border=1 ");
				 out.println("<tr><th>AgentId</th><th>AgentName</th><th>City</th><th>Gender</th><th>Marital Status</th><th>Premium</th><tr>");
				for (Agent agent : agentList) {
					
					 
					out.println("<tr><td>"+agent.getAgentId()
							+ "</td><td>"+agent.getName()+"</td><td>"+agent.getCity()+"</td><td>"+agent.getGender()
							+"</td><td>"+agent.getMaritalStatus()+"</td><td>"+agent.getPrimium()+"</td></tr>");
					
				}out.println("</table>"); 
			} catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
