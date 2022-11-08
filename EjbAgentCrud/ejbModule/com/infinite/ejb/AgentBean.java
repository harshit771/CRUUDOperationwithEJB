package com.infinite.ejb;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class AgentBean
 */
@Stateless
@Remote(AgentBeanRemote.class)
public class AgentBean implements AgentBeanRemote {

	static AgentDAO dao;
	static {
		dao=new AgentDAO();
	}
    /**
     * Default constructor. 
     */
    public AgentBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public List<Agent> showAgent() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return dao.showAgent();
	}

	@Override
	public Agent searchAgent(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return dao.searchAgent(id);
	}

	@Override
	public String deleteagent(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return dao.deleteagent(id);
	}

	@Override
	public String addAgent(Agent agent) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return dao.addAgent(agent);
	}

	@Override
	public String updateAgent(Agent agentNew) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return dao.updateAgent(agentNew);
	}

}
