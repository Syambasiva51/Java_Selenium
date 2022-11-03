package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/*
 * 
 * 08th OCT : StartTime:- 1:30
 * 
 */
public class A_GetQuery {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");    
		Connection ct=DriverManager.getConnection("jdbc:mysql://localhost:3306/productmgmt", "root","Root@12345");
		Statement st=ct.createStatement();

		ResultSet rs=st.executeQuery("select * from productinfo1");

		while(rs.next()) {
		    System.out.println(rs.getInt("ID"));
		    System.out.println(rs.getString("name"));
		}

	}

}
