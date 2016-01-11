package shi.fxsol.db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import shi.fxsol.domain.Event;

public class EventDaoImpl {
	public static void insertEvent(Event event){
		
		Connection connection = DataBaseManager.getConnection();
		PreparedStatement preparedStatement = null;
		try{
			preparedStatement = connection.prepareStatement(
				"insert into event("
				+ "year,month,day,hour,minute,sdate,stime,"
				+ "expect,actual,diff,"
				+ "name,country,edate)"
				+ "values(?,?,?,?,?,?,"
				+ "?,?,?,?,?,?,?)"
			);
			
			preparedStatement.setInt(1, event.getYear());
			preparedStatement.setInt(2, event.getMonth());
			preparedStatement.setInt(3, event.getDay());
			preparedStatement.setInt(4, event.getHour());
			preparedStatement.setInt(5, event.getMinute());
			preparedStatement.setString(6, event.getSdate());
			preparedStatement.setString(7, event.getStime());
			preparedStatement.setDouble(8, event.getExpect());
			preparedStatement.setDouble(9, event.getActual());
			preparedStatement.setDouble(10, event.getDiff());
			preparedStatement.setString(11, event.getName());
			preparedStatement.setString(12, event.getCountry());
			preparedStatement.setDate(13, new Date(event.getEdate().getTimeInMillis()));
			preparedStatement.executeUpdate();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				if(preparedStatement!=null) preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void insertEvents(List<Event> events){
		Connection connection = DataBaseManager.getConnection();
		PreparedStatement preparedStatement = null;
		try{
			preparedStatement = connection.prepareStatement(
				"insert into event("
				+ "year,month,day,hour,minute,sdate,stime,"
				+ "expect,actual,diff,"
				+ "name,country,edate)"
				+ "values(?,?,?,?,?,?,"
				+ "?,?,?,?,?,?,?)"
			);
			
			for(Event event : events){
				try{
					preparedStatement.setInt(1, event.getYear());
					preparedStatement.setInt(2, event.getMonth());
					preparedStatement.setInt(3, event.getDay());
					preparedStatement.setInt(4, event.getHour());
					preparedStatement.setInt(5, event.getMinute());
					preparedStatement.setString(6, event.getSdate());
					preparedStatement.setString(7, event.getStime());
					preparedStatement.setDouble(8, event.getExpect());
					preparedStatement.setDouble(9, event.getActual());
					preparedStatement.setDouble(10, event.getDiff());
					preparedStatement.setString(11, event.getName());
					preparedStatement.setString(12, event.getCountry());
					preparedStatement.setDate(13, new Date(event.getEdate().getTimeInMillis()));
					
					preparedStatement.executeUpdate();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				if(preparedStatement!=null) preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static List<Event> listEvents(String _country,String _name,int lastNmonth){
		List<Event> events = new ArrayList<Event>();
		
		if(lastNmonth<=0){
			lastNmonth = 1107;
		}
		
		Calendar startdate =Calendar.getInstance();
		startdate.add(Calendar.MONTH, -lastNmonth);
		
		Connection connection = DataBaseManager.getConnection();
		PreparedStatement preStatement = null;
		
		try
		{
			preStatement = connection.prepareStatement(
					"select "
					+ "id,year,month,day,hour,minute,sdate,stime,"
					+ "expect,actual,diff,name,country "
					+ "from event "
					+ "where country =? and name = ? and edate >= ? order by edate asc"
					);
			
			preStatement.setString(1, _country);
			preStatement.setString(2, _name);
			preStatement.setDate(3, new java.sql.Date(startdate.getTimeInMillis()));
			
			
			ResultSet resultSet = preStatement.executeQuery();
			while(resultSet.next())
			{
		        int year = resultSet.getInt(2);
		        int month = resultSet.getInt(3);
		        int day = resultSet.getInt(4);
		        int hour = resultSet.getInt(5);
		        int minute = resultSet.getInt(6);
		        
		        Calendar edate = Calendar.getInstance();
		        edate.set(year,month,day,hour,minute);
		        
		        String sdate = resultSet.getString(7);
		        String stime = resultSet.getString(8);
		        
		        double expect = resultSet.getDouble(9);
		        double actual = resultSet.getDouble(10);
		        double diff = resultSet.getDouble(11);
		        
				String name = resultSet.getString(12);
				String country = resultSet.getString(13);
		        
				Event event = new Event();
				event.setYear(year);
				event.setMonth(month);
				event.setDay(day);
				event.setHour(hour);
				event.setMinute(minute);
				event.setSdate(sdate);
				event.setStime(stime);
				event.setExpect(expect); 
				event.setActual(actual);
				event.setDiff(diff);
				event.setName(name);
				event.setCountry(country);
				event.setEdate(edate);
				
				events.add(event);
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				if(preStatement!=null) preStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return events;
	}
}
