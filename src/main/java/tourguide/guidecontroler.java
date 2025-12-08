package tourguide;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class guidecontroler {
	
	//Connect DB
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	//Insert Date Function
	public static boolean insertdata ( String name, String email, String phone, String address) {
		boolean isSuccess = false;
		try {
			//DB Connection Call
			con=dbconnection.getConnection();
			stmt=con.createStatement();
			
			//SQL Query
			String sql = "INSERT INTO tourguide.guide VALUES (0,'"+name+"', '"+email+"', '"+phone+"', '"+address+"' )";
			int rs = stmt.executeUpdate(sql);
			if (rs>0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}
	
	
	//Get By ID
	public static List<guidemodle> getById (String id){
		int convertedID = Integer.parseInt(id);
		ArrayList <guidemodle> guide = new ArrayList<>();
		
		try {
			//DB Connection Call
			con=dbconnection.getConnection();
			stmt=con.createStatement();
			
			//SQL Query
			String sql = "SELECT * FROM tourguide.guide WHERE id '"+convertedID+"'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id1 = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);
				String address = rs.getString(5);
				
				guidemodle st = new guidemodle(id1,name,email,phone,address);
				guide.add(st);
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return guide;		
	}
	
	
	//Get All Data
	public static List<guidemodle> getAllguide () {
		ArrayList <guidemodle> guide = new ArrayList<>();
		
		try {
			//DB Connection Call
			con=dbconnection.getConnection();
			stmt=con.createStatement();
			
			//SQL Query
			String sql = "SELECT * FROM guide";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);
				String address = rs.getString(5);
				
				guidemodle st = new guidemodle(id,name,email,phone,address);
				guide.add(st);
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return guide;
		
	}
	
	
	//Update Data
	public static boolean updatedata(String id, String name, String email, String phone, String address) {
		
		try {
			//DB Connection Call
			con=dbconnection.getConnection();
			stmt=con.createStatement();
			
			//SQL Query
			String sql = "UPDATE guide SET name='"+name+"', email='"+email+"' , phone='"+phone+"' , address='"+address+"'"
					+ "WHERE id='"+id+"'";
			
			int rs = stmt.executeUpdate(sql);
			
			if (rs>0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
		
	}
	
	
	//Delete Data
	public static boolean deletedata(String id) {
		int convID = Integer.parseInt(id);
		
		try {
			//DB Connection Call
			con=dbconnection.getConnection();
			stmt=con.createStatement();
			
			//SQL Query
			String sql = "DELETE FROM guide WHERE id='"+convID+"'";
			
			int rs = stmt.executeUpdate(sql);
			
			if (rs>0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
		
	}
}
