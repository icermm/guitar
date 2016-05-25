package tool;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DbUtil {
	static String url="jdbc:sqlite:/E:/Guitar.db3";
	static Connection conn=null;
	public static Connection getConnection(){
		
		try{
			//绾剛绱惍锟�
			Class.forName("org.sqlite.JDBC");	
			conn=DriverManager.getConnection(url);
		}catch(ClassNotFoundException e){
			
		}		//瀵よ櫣鐝涢崚鐗堟殶閹诡喖绨遍惃鍕箾閹猴拷
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}

	public void closeConnection(Connection conn){
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
