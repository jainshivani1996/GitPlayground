package com.niit.onlinebanking;


import java.sql.*;

public class LoginDAO {
	 public static boolean checkUser(String uID,String uPass) 
	    {
	        boolean st =false;
	        try {

	            //loading drivers for mysql
	        	ConnectionClass conn = new ConnectionClass();
	        	Connection con = conn.getConnection();
	            PreparedStatement ps = con.prepareStatement("select * from login where customer_id=? and password=?");
	            ps.setString(1,uID);
	            ps.setString(2, uPass);
	            ResultSet rs =ps.executeQuery();
	            st = rs.next();

	        }
	        catch(Exception e) {
	            e.printStackTrace();
	        }
	        return st;                 
	    }   
	public static void main(String args[]){
LoginDAO ld=new LoginDAO();
		ld.checkUser(12,12);
	}
}
