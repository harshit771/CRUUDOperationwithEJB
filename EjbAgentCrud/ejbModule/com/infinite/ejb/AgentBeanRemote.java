package com.infinite.ejb;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.Remote;

@Remote
public interface AgentBeanRemote {
	List<Agent> showAgent() throws ClassNotFoundException, SQLException;
	Agent searchAgent(int id) throws ClassNotFoundException, SQLException;
	String deleteagent(int id) throws ClassNotFoundException, SQLException;
	String addAgent(Agent agent) throws ClassNotFoundException, SQLException;
     String updateAgent(Agent agentNew) throws ClassNotFoundException, SQLException;
}
