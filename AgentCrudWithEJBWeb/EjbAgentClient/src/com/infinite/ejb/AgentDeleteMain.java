package com.infinite.ejb;

import java.sql.SQLException;
import java.util.Scanner;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class AgentDeleteMain {
public static void main(String[] args) throws NamingException, ClassNotFoundException, SQLException {
	 AgentBeanRemote service=null;
		service=(AgentBeanRemote) new InitialContext().lookup("AgentBean/remote");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter agent id");
		int id=sc.nextInt();
		String agent=service.deleteagent(id);
		if(agent!=null) {
			System.out.println("Record deleted");
		}
}
}
