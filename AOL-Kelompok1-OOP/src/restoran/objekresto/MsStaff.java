package restoran;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.DatabaseConnector;

public class MsStaff {
	private Connection msStaff;
	
	public MsStaff() {
		DatabaseConnector connector = new DatabaseConnector();
		msStaff = connector.connect("msrestoran");
	}
	
	void insertStaff(int id, String name, String cabang) {
		if( msStaff != null) {
			try {
				PreparedStatement insert = msStaff.prepareStatement("insert into msstaff(StaffID,StaffName,CabangRestoran)values(?,?,?)");
	            insert.setInt(1, id);
	            insert.setString(2, name);
	            insert.setString(3, cabang);
	            insert.executeUpdate();
			} catch(Exception e) {
				
			}
		}	
	}
}
