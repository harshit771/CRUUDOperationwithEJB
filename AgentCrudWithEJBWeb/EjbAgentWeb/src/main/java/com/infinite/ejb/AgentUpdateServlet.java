package com.infinite.ejb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AgentUpdateServlet
 */
@WebServlet("/AgentUpdateServlet")
public class AgentUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgentUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AgentBeanRemote service=null;
		PrintWriter out=response.getWriter();
		int id=Integer.parseInt(request.getParameter("agentId"));
		String name=request.getParameter("name");
		String city=request.getParameter("city");
		String gender=request.getParameter("gender");
		int ms=Integer.parseInt(request.getParameter("maritalStatus"));
		double premium=Double.parseDouble(request.getParameter("premium"));
		Agent agent=new Agent();
		agent.setAgentId(id);
		agent.setName(name);
		agent.setCity(city);
		agent.setGender(gender);
		agent.setMaritalStatus(ms);
		agent.setPrimium(premium);
		try {
			service=(AgentBeanRemote) new InitialContext().lookup("AgentBean/remote");
			out.println(service.updateAgent(agent));
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
