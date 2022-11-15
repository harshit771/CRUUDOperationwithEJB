package com.java.ejb;

import java.sql.SQLException;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class DriverShowMain {
  public static void main(String[] args) {
	  UserBeanRemote service=null;
		
		try {
			service=(UserBeanRemote)new InitialContext().lookup("CabBookingEAR/UserBean/remote");
			List<Driver> driver=service.showDriver();
			for (Driver driver2 : driver) {
				System.out.println(driver2);
			}
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
}
