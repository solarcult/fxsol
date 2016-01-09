package shi.fxsol.file;

import java.util.Calendar;
import java.util.StringTokenizer;

import shi.fxsol.domain.Event;

public class EventReadUtils {
	
	public static Event retrieveOneEvent(String country, String name, String time, String line){
		Event event = new Event();
		
		StringTokenizer st = new StringTokenizer(line, " ");
		
		if(st.countTokens() != 4){
			System.out.println("ERROR:" + country + name + time + line );
			return null;
		}
		
		//解析日期 eg:2015年11月18日
		String datetime = st.nextToken();
		int iyear = datetime.indexOf("年");
		int imonth = datetime.indexOf("月");
		int iday = datetime.indexOf("日");
		int year = Integer.parseInt(datetime.substring(0, iyear)); 
		int month = Integer.parseInt(datetime.substring(iyear+1, imonth));
		int day = Integer.parseInt(datetime.substring(imonth+1,iday));
		
		//解析时间
		String[] times = time.split(":");
		int hour = Integer.parseInt(times[0]);
		int minute = Integer.parseInt(times[1]);
		
		double expect = Double.parseDouble(st.nextToken());
		double actual = Double.parseDouble(st.nextToken());
		double diff = Double.parseDouble(st.nextToken());
		
		String sdate = year+"."+month+"."+day;
		
		Calendar edate = Calendar.getInstance();
		edate.set(year, month, day, hour, minute);
		
		event.setCountry(country);
		event.setName(name);
		event.setYear(year);
		event.setMonth(month);
		event.setDay(day);
		event.setHour(hour);
		event.setMinute(minute);
		event.setSdate(sdate);
		event.setStime(time);
		event.setExpect(expect);
		event.setActual(actual);
		event.setDiff(diff);
		event.setEdate(edate);
		
		return event;
	}
	

	public static void main(String[] args) {
		Event event = EventReadUtils.retrieveOneEvent("US", "WIT", "13:30", "2015年10月20日 1.147 1.206 +0.06");
		System.out.println(event);
	}

}
