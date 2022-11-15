package com.java.ejb;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.Remote;

@Remote
public interface UserBeanRemote {
	public User searchUser(int userId) throws ClassNotFoundException, SQLException;
	Driver searchDriver(int driverId) throws ClassNotFoundException, SQLException;
	List<Driver> showDriver() throws ClassNotFoundException, SQLException;
	String addBooking(Booking booking) throws ClassNotFoundException, SQLException;
}
