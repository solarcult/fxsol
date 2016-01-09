package shi.fxsol.uitls;

import java.util.Calendar;

public class FxCalenderUtils {
	
	/**
	 * 计算某一年第几个月第几周的星期几是哪一天
	 * @param year
	 * @param month
	 * @param week
	 * @param day
	 * @return
	 */
	public static Calendar getAyearBmonthXweekYday(int year, int month, int week , int day){
		Calendar wantCalendar = Calendar.getInstance();
		wantCalendar.set(year,month,1);
		//SUNDAY:1 SATURDAY:7
		int dayofweek = wantCalendar.get(Calendar.DAY_OF_WEEK);
		int plusdays = 0;
		//正好是星期几
		if(dayofweek == day){
			plusdays += (week - 1) * 7;
		}
		//如果1日的星期比寻找的要晚,比如我们寻找周三但现在是周五,则说明要找的日期在后面的星期
		else if(dayofweek > day){
			plusdays = (day - dayofweek ) + week * 7;
		}
		//如果1日的星期比寻找的要早,比如我们寻找周五但现在是周三,则说明要找的日期就在本周
		else{
			plusdays = (day - dayofweek) + (week - 1) * 7;
		}
		wantCalendar.add(Calendar.DAY_OF_MONTH, plusdays);
		
		if(wantCalendar.get(Calendar.MONTH)!=month) return null;
		
		return wantCalendar;
	}
	
	public static String convertCalenderDayOfWeek2String(int dayOfWeek){
		switch(dayOfWeek){
			case Calendar.SUNDAY:
				return "SUNDAY";
			case Calendar.MONDAY:
				return "MONDAY";
			case Calendar.TUESDAY:
				return "TUESDAY";
			case Calendar.WEDNESDAY:
				return "WEDNESDAY";
			case Calendar.THURSDAY:
				return "THURSDAY";
			case Calendar.FRIDAY:
				return "FRIDAY";
			case Calendar.SATURDAY:
				return "SATURDAY";
			default:
				return "WTF of THIS WEEKDAY";
		}
	}
	
	@Deprecated
	public static String convertCalenderMonth2String(int month){
		switch(month){
			case Calendar.JANUARY:
				return "JANUARY";
			case Calendar.FEBRUARY:
				return "FEBRUARY";
			case Calendar.MARCH:
				return "MARCH";
			case Calendar.APRIL:
				return "APRIL";
			case Calendar.MAY:
				return "MAY";
			case Calendar.JUNE:
				return "JUNE";
			case Calendar.JULY:
				return "JULY";
			case Calendar.AUGUST:
				return "AUGUST";
			case Calendar.SEPTEMBER:
				return "SEPTEMBER";
			case Calendar.OCTOBER:
				return "OCTOBER";
			case Calendar.NOVEMBER:
				return "NOVEMBER";
			case Calendar.DECEMBER:
				return "DECEMBER";
			default:
				return "WTF of THIS MONTH";
		}
	}
	
	public static String convertNumberMonth2String(int month){
		switch(month){
			case 1:
				return "JANUARY";
			case 2:
				return "FEBRUARY";
			case 3:
				return "MARCH";
			case 4:
				return "APRIL";
			case 5:
				return "MAY";
			case 6:
				return "JUNE";
			case 7:
				return "JULY";
			case 8:
				return "AUGUST";
			case 9:
				return "SEPTEMBER";
			case 10:
				return "OCTOBER";
			case 11:
				return "NOVEMBER";
			case 12:
				return "DECEMBER";
			default:
				return "WTF of THIS MONTH";
		}
	}

	public static void main(String[] args){
		for(int month=0;month<12;month++){
			Calendar x = getAyearBmonthXweekYday(2015, month , 2, Calendar.FRIDAY);
//			System.out.println(x);
			if(x!=null) {
				System.out.println(x.getTime());
				System.out.println(x.getActualMaximum(Calendar.WEEK_OF_MONTH));
//				System.out.println(x.getActualMinimum(Calendar.WEEK_OF_MONTH));
//				System.out.println(x.get(Calendar.WEEK_OF_MONTH));
				System.out.println(x);
			}
			else System.out.println("null"); 
			
		}
	}
	
}
