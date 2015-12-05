package shi.fxsol.db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import shi.fxsol.cvs.CSVReadUtils;
import shi.fxsol.vo.FxMetaData;

public class FxMetaDataDaoImpl {
	
	public static void insertFxMetaData(FxMetaData fxMetaData){
		Connection connection = DataBaseManager.getConnection();
		PreparedStatement preparedStatement = null;
		try{
			preparedStatement = connection.prepareStatement(
				"insert into fxmetadata("
				+ "name,timeframe,datetime,"
				+ "year,month,day,hour,minute,sdate,stime,"
				+ "open,high,low,close,volumn,"
				+ "weekofday,dayofweekinmonth,specialweek)"
				+ "values(?,?,?,?,?,?,?,?,?,"
				+ "?,?,?,?,?,?,?,?,?)"
			);
			
			preparedStatement.setString(1, fxMetaData.getName());
			preparedStatement.setString(2, fxMetaData.getTimeframe());
			preparedStatement.setDate(3, new Date(fxMetaData.getDatetime().getTimeInMillis()));
			preparedStatement.setInt(4, fxMetaData.getYear());
			preparedStatement.setInt(5, fxMetaData.getMonth());
			preparedStatement.setInt(6, fxMetaData.getDay());
			preparedStatement.setInt(7, fxMetaData.getHour());
			preparedStatement.setInt(8, fxMetaData.getMinute());
			preparedStatement.setString(9, fxMetaData.getSdate());
			preparedStatement.setString(10, fxMetaData.getStime());
			preparedStatement.setInt(11, fxMetaData.getOpen());
			preparedStatement.setInt(12, fxMetaData.getHigh());
			preparedStatement.setInt(13, fxMetaData.getLow());
			preparedStatement.setInt(14, fxMetaData.getClose());
			preparedStatement.setInt(15, fxMetaData.getVolumn());
			preparedStatement.setString(16, fxMetaData.getWeekofday());
			preparedStatement.setInt(17, fxMetaData.getDayOfWeekInMonth());
			preparedStatement.setString(18, fxMetaData.getSpecialweek());
			
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
	
	public static void insertFxMetaDataList(List<FxMetaData> fxMetaDatas){
		Connection connection = DataBaseManager.getConnection();
		PreparedStatement preparedStatement = null;
		try{
			preparedStatement = connection.prepareStatement(
				"insert into fxmetadata("
				+ "name,timeframe,datetime,"
				+ "year,month,day,hour,minute,sdate,stime,"
				+ "open,high,low,close,volumn,"
				+ "weekofday,dayofweekinmonth,specialweek)"
				+ "values(?,?,?,?,?,?,?,?,?,"
				+ "?,?,?,?,?,?,?,?,?)"
			);
			
			for(FxMetaData fxMetaData : fxMetaDatas){
				try{
					preparedStatement.setString(1, fxMetaData.getName());
					preparedStatement.setString(2, fxMetaData.getTimeframe());
					preparedStatement.setTimestamp(3, new Timestamp(fxMetaData.getDatetime().getTimeInMillis()));//(3, new Date(fxMetaData.getDatetime().getTimeInMillis()));
					preparedStatement.setInt(4, fxMetaData.getYear());
					preparedStatement.setInt(5, fxMetaData.getMonth());
					preparedStatement.setInt(6, fxMetaData.getDay());
					preparedStatement.setInt(7, fxMetaData.getHour());
					preparedStatement.setInt(8, fxMetaData.getMinute());
					preparedStatement.setString(9, fxMetaData.getSdate());
					preparedStatement.setString(10, fxMetaData.getStime());
					preparedStatement.setInt(11, fxMetaData.getOpen());
					preparedStatement.setInt(12, fxMetaData.getHigh());
					preparedStatement.setInt(13, fxMetaData.getLow());
					preparedStatement.setInt(14, fxMetaData.getClose());
					preparedStatement.setInt(15, fxMetaData.getVolumn());
					preparedStatement.setString(16, fxMetaData.getWeekofday());
					preparedStatement.setInt(17, fxMetaData.getDayOfWeekInMonth());
					preparedStatement.setString(18, fxMetaData.getSpecialweek());
					
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
	
	public static List<FxMetaData> queryFxMetaDatas4nameXtimeframe(String fxname,String fxtimeframe){
		List<FxMetaData> fxMetaDatas = new ArrayList<FxMetaData>();
		
		Connection connection = DataBaseManager.getConnection();
		PreparedStatement preStatement = null;
		try
		{
			preStatement = connection.prepareStatement(
					"select "
					+ "id,name,timeframe,datetime,"
					+ "year,month,day,hour,minute,sdate,stime,"
					+ "open,high,low,close,volumn,"
					+ "weekofday,dayofweekinmonth,specialweek "
					+ "from fxmetadata "
					+ "where name = ? and timeframe = ? order by datetime asc"
					);
			
			preStatement.setString(1, fxname);
			preStatement.setString(2, fxtimeframe);
			
			ResultSet resultSet = preStatement.executeQuery();
			while(resultSet.next())
			{
				long id = resultSet.getLong(1);
				String name = resultSet.getString(2);
				String timeframe = resultSet.getString(3);
				
		        int year = resultSet.getInt(5);
		        int month = resultSet.getInt(6);
		        int day = resultSet.getInt(7);
		        int hour = resultSet.getInt(8);
		        int minute = resultSet.getInt(9);
		        
		        Calendar datetime = Calendar.getInstance();
		        datetime.set(year,month,day,hour,minute);
		        
		        String sdate = resultSet.getString(10);
		        String stime = resultSet.getString(11);
		        
		        int open = resultSet.getInt(12);
		        int high = resultSet.getInt(13);
		        int low = resultSet.getInt(14);
		        int close = resultSet.getInt(15);
		        int volumn = resultSet.getInt(16);
		        
		        String weekofday = resultSet.getString(17);
		        int dayofweekinmonth = resultSet.getInt(18);
		        String specialweek = resultSet.getString(19);
		        
		        FxMetaData fxMetaData = new FxMetaData();
		        
		        fxMetaData.setId(id);
		        fxMetaData.setName(name);
		        fxMetaData.setTimeframe(timeframe);
		        fxMetaData.setDatetime(datetime);
				fxMetaData.setYear(year);
				fxMetaData.setMonth(month);
				fxMetaData.setDay(day);
				fxMetaData.setHour(hour);
				fxMetaData.setMinute(minute);
				fxMetaData.setSdate(sdate);
				fxMetaData.setStime(stime);
				fxMetaData.setOpen(open);
				fxMetaData.setHigh(high);
				fxMetaData.setLow(low);
				fxMetaData.setClose(close);
				fxMetaData.setVolumn(volumn);
				
				fxMetaData.setWeekofday(weekofday);
				fxMetaData.setDayOfWeekInMonth(dayofweekinmonth);
				fxMetaData.setSpecialweek(specialweek);
				
				fxMetaDatas.add(fxMetaData);
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
		
		return fxMetaDatas;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		FxMetaData fxMetaData1 = CSVReadUtils.retrieveOneLine("2014.09.08,16:13,7.9175,7.9182,7.9143,7.9167,887");
		fxMetaData1.setName("Me");
		fxMetaData1.setTimeframe("60");
		
		
		List<FxMetaData> fxMetaDatas = new ArrayList<FxMetaData>();
		fxMetaDatas.add(fxMetaData1);
		
		FxMetaData fxMetaData2 = CSVReadUtils.retrieveOneLine("2015.10.16,13:08,50.46,50.5,50.35,50.43,283");
		fxMetaData2.setName("Oil");
		fxMetaData2.setTimeframe("60");
		fxMetaDatas.add(fxMetaData2);
		
		insertFxMetaDataList(fxMetaDatas);
		*/
		for(FxMetaData fx : queryFxMetaDatas4nameXtimeframe("Me", "60")){
			System.out.println(fx);
		}
		
	}

}
