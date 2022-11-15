package com.java.ejb;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class BookingAddMain {
  public static void main(String[] args) {
	  UserBeanRemote service=null;
	  Scanner sc=new Scanner(System.in);
	  Booking booking=new Booking();
	  System.out.println("Enter User Id");
	  booking.setUserId(sc.nextInt());
	  System.out.println("Enter Driver id");
	  booking.setDriverId(sc.nextInt());
	  System.out.println("Enter Booking Date(yyyy-MM-dd)");
	  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
			Date bookDate;
			try {
				bookDate = sdf.parse(sc.next());
				java.sql.Date date = new java.sql.Date(bookDate.getTime());
				booking.setBookingDate(date);
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
	System.out.println("Enter Starting Location");
	booking.setsLocation(sc.next());
	System.out.println("Enter End Location");
	booking.seteLocation(sc.next());
	System.out.println("Enter Kilometers");
	booking.setKm(sc.nextDouble());
	System.out.println("Enter Bill Amount");
	booking.setAmt(sc.nextDouble());
		
		try {
			service=(UserBeanRemote)new InitialContext().lookup("CabBookingEAR/UserBean/remote");
			System.out.println(service.addBooking(booking));
			
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
