package shi.fxsol.cvs;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;
import java.util.TimeZone;

import shi.fxsol.uitls.FxCalenderUtils;
import shi.fxsol.vo.FxMetaData;
import shi.fxsol.vo.FxSpeicalDay;

public class CSVReadUtils {
	
	public static FxMetaData retrieveOneLine(String line){
		FxMetaData fxMetaData = new FxMetaData();
		StringTokenizer st = new StringTokenizer(line, ",");
		
		if(st.countTokens() != 7) return null;
		
		//解析日期
		String sdate = st.nextToken();
		String[] ymd = sdate.split("\\.");
		if(ymd.length != 3) return null;
		int year = Integer.parseInt(ymd[0]);
		int month = Integer.parseInt(ymd[1]);
		int day = Integer.parseInt(ymd[2]);
		
		//解析时间
		String stime = st.nextToken();
		String[] times = stime.split(":");
		int hourOfDay = Integer.parseInt(times[0]);
		int minute = Integer.parseInt(times[1]);
		
		//open
		int open = (int) (Double.parseDouble(st.nextToken())*10000);
		//high
		int high = (int) (Double.parseDouble(st.nextToken())*10000);
		//low
		int low = (int) (Double.parseDouble(st.nextToken())*10000);
		//close
		int close = (int) (Double.parseDouble(st.nextToken())*10000);
		//volumn
		int volumn = Integer.parseInt(st.nextToken());
		
		//TODO 此处应该注明是标准时间,即0时区的时间. 使用时要转换为中国时间
//		TimeZone.setDefault(TimeZone.getTimeZone("GMT+0:00"));
//		GregorianCalendar calendertime = new  GregorianCalendar(TimeZone.getTimeZone("GMT+00:00"));
		Calendar calendertime = Calendar.getInstance();
		calendertime.set(year, month, day, hourOfDay, minute,0);
		
		fxMetaData.setDatetime(calendertime);
		fxMetaData.setYear(year);
		fxMetaData.setMonth(month);
		fxMetaData.setDay(day);
		fxMetaData.setHour(hourOfDay);
		fxMetaData.setMinute(minute);
		fxMetaData.setSdate(sdate);
		fxMetaData.setStime(stime);
		fxMetaData.setOpen(open);
		fxMetaData.setHigh(high);
		fxMetaData.setLow(low);
		fxMetaData.setClose(close);
		fxMetaData.setVolumn(volumn);
		
		fxMetaData.setWeekofday(FxCalenderUtils.convertCalenderDayOfWeek2String(calendertime.get(Calendar.DAY_OF_WEEK)));
		fxMetaData.setDayOfWeekInMonth(calendertime.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		fxMetaData.setSpecialweek(FxSpeicalDay.getSpecialWeek(calendertime));
		
		return fxMetaData;
	}

	public static void main(String[] args) {
		System.out.println(retrieveOneLine("2014.09.08,00:00,7.9175,7.9182,7.9143,7.9167,887"));
		GregorianCalendar c = new  GregorianCalendar(TimeZone.getTimeZone("GMT+0:00"));
		System.out.println(c);
		System.out.println(TimeZone.getTimeZone("GMT+0:00").getDisplayName());
	}

}
