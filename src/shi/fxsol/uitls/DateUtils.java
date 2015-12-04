package shi.fxsol.uitls;

import java.util.Calendar;

public class DateUtils {
	
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
