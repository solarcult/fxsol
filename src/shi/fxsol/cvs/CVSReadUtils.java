package shi.fxsol.cvs;

import java.util.Calendar;
import java.util.StringTokenizer;

import shi.fxsol.uitls.FxCalenderUtils;
import shi.fxsol.vo.FxMetaData;
import shi.fxsol.vo.FxSpeicalDay;

public class CVSReadUtils {
	
	public static FxMetaData retrieveOneLine(String line){
		FxMetaData fxMetaData = new FxMetaData();
		StringTokenizer st = new StringTokenizer(line, ",");
		
		if(st.countTokens() != 7) return null;
		
		//解析日期
		String sdate = st.nextToken();
		String[] ymd = sdate.split(".");
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
		int open = Integer.parseInt(st.nextToken())*1000;
		//high
		int high = Integer.parseInt(st.nextToken())*1000;
		//low
		int low = Integer.parseInt(st.nextToken())*1000;
		//close
		int close = Integer.parseInt(st.nextToken())*1000;
		//volumn
		int volumn = Integer.parseInt(st.nextToken());
		
		
		Calendar calendertime = Calendar.getInstance();
		calendertime.set(year, month, day, hourOfDay, minute);
		
		fxMetaData.setDatetime(calendertime.getTime());
		fxMetaData.setYear(year);
		fxMetaData.setMonth(month);
		fxMetaData.setDay(day);
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
		retrieveOneLine("2014.09.08,00:00,7.9175,7.9182,7.9143,7.9167,887");

	}

}
