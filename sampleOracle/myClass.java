package sampleOracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.*;

public class myClass {

	public static void main(String[] args) throws Exception {
	
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c1 = DriverManager.getConnection("jdbc:oracle:thin:@//127.0.0.1:1521/orcl","hr","oracle");
			Statement st = c1.createStatement();
			ResultSet rs = st.executeQuery("select * from emp");
			while(rs.next()){
			System.out.println(rs.getString(0)+"\t"+rs.getString(1)+"\t"+rs.getString(2)+"\t");
			}
	}

}
