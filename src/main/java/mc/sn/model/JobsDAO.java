package mc.sn.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JobsDAO {
	public String selectJobs() throws SQLException {
		String info = null;
		String sql = "select * from jobs";
		Connection con = ConnectionManager.getConnection();
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next()) {
			info=rs.getString(1)+", "+rs.getString(2)+", "+rs.getInt(3);
			//info=rs.getString(1)+", "+rs.getString(2)+", "+rs.getInt(3)+", "+rs.getString(4);
			break;
		}
	
		ConnectionManager.closeConnection(con, stmt, rs);
		
		return info;
	}
}
