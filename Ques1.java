package ThreadDemo1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ques1 {

	public Ques1() // constructer
	{
		
	}
	Connection con;
	PreparedStatement pstmt;
	
	public void createConnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3307/mysqljdbc","root","gaurav1997TISHA");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void updateRec()
	{
		String query = "update candidates" + " set first_name = ? " + "where last_name ='king'";
		try {
			pstmt = con.prepareStatement(query);
			
			Scanner s = new Scanner(System.in);
//			System.out.println("enter last name");
//			String name = s.next();
			
			s.nextLine();
			System.out.println("enter first name");
			String fname=s.nextLine();
			
			//pstmt.setString(2, name);
			pstmt.setString(1, fname);
	
			int rowAffected = pstmt.executeUpdate();
			System.out.println("Row affected"+rowAffected);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ques1 obj = new Ques1();
		obj.createConnection();
		obj.updateRec();
		
	}

}
