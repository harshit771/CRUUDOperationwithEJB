package com.java.ejb;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class UserBean
 */
@Stateless
@Remote(UserBeanRemote.class)
public class UserBean implements UserBeanRemote {

	static DAO dao;
	static {
		dao=new DAO();
	}
    /**
     * Default constructor. 
     */
    public UserBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public User searchUser(int userId) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return dao.searchUser(userId);
	}

	public Driver searchDriver(int driverId) throws ClassNotFoundException, SQLException {
		
		return dao.searchDriver(driverId);
	}

	@Override
	public List<Driver> showDriver() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return dao.showDriver();
	}

	@Override
	public String addBooking(Booking booking) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return dao.addBooking(booking);
	}

}
