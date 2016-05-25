package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import beans.Guitar;
import tool.DbUtil;

public class GuitarDao{

	public List<Guitar> search(String type){
		// TODO Auto-generated method stub
		List<Guitar> list=new ArrayList<Guitar>();
		String sql="select * from guitar where type=?";
		DbUtil jdbc=new DbUtil();
		Connection conn=jdbc.getConnection();
 		PreparedStatement ps;
		try {
 			ps = conn.prepareStatement(sql);
 			ps.setString(1, type);
 			ResultSet rs=ps.executeQuery();

			while(rs.next()){
				Guitar guitar=new Guitar();
				guitar.setSerialNumber(rs.getString(1));
				guitar.setPrice(rs.getDouble(3));
				guitar.setBuilder(rs.getString(2));
				guitar.setModel(rs.getString(4));
				guitar.setType(type);
				guitar.setBackWood(rs.getString(6));
				guitar.setTopWood(rs.getString(7));
				list.add(guitar);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			jdbc.closeConnection(conn);
		}
		return null;
	}


}