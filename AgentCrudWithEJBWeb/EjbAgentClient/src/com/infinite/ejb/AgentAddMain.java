package com.infinite.ejb;

import java.sql.SQLException;
import java.util.Scanner;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class AgentAddMain {
public static void main(String[] args) throws NamingException, ClassNotFoundException, SQLException { 
	AgentBeanRemote service=null;
	service=(AgentBeanRemote) new InitialContext().lookup("AgentBean/remote");
	Agent agent=new Agent();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Agent Name");
	agent.setName(sc.next());
	System.out.println("Enter City");
	agent.setCity(sc.next());
	System.out.println("enter gender");
	agent.setGender(sc.next());
	System.out.println("Enter MaritalStatus");
	agent.setMaritalStatus(sc.nextInt());
	System.out.println("Enter premium");
	agent.setPrimium(sc.nextDouble());
	System.out.println(service.addAgent(agent));
}
}
