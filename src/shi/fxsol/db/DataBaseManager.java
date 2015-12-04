package shi.fxsol.db;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 数据库连接工具类
 * 
 * @author ShiL
 * 2007-2-8 1:33:20
 */
public class DataBaseManager
{
	public static Connection connection;

	public static Connection getConnection()
	{
		if(connection == null){
			try
			{
				Class.forName("org.postgresql.Driver");
				Connection conn = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/fxsol", "postgres", "134120");
				
				connection = conn;
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		
		return connection;
	}
}
