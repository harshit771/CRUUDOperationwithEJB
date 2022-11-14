package com.infinite.ejb;

import java.sql.SQLException;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class AgentShowMain {
   public static void main(String[] args) throws NamingException, ClassNotFoundException, SQLException {
	AgentBeanRemote service=null;
	service=(AgentBeanRemote) new InitialContext().lookup("AgentBean/remote");
	List<Agent> agentList=service.showAgent();
	for (Agent agent : agentList) {
		System.out.println(agent);
	}
}
}
