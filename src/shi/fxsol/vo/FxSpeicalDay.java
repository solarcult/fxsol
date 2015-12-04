package shi.fxsol.vo;

import java.util.Calendar;

public class FxSpeicalDay {
	
	public static String SpecialWeek_First_Day_Of_Week_Of_Month = "First_Day_Of_Week_Of_Month";
	public static String SpecialWeek_Last_Day_Of_Week_Of_Month = "Last_Day_Of_Week_Of_Month";
	
	//名字
	private String name;
	//几月份
	private int month;
	//星期几
	private String weekofday;
	//这个月的第几次星期N
	private int timesofweekday;
	//第一个/最后一个周几?
	private String specialweek;
	//描述
	private String description;
	
	public static String getSpecialWeek(int year, int month, int day){
		String result = null;
		Calendar x = Calendar.getInstance();
		x.setLenient(false);
		x.set(year,month,day);
		
		return getSpecialWeek(x);
	}
	
	public static String getSpecialWeek(Calendar calendar){
		String result = null;
		
		int firstWeekSign = calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		int maxDayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		int numberOfWeek = calendar.get(Calendar.WEEK_OF_MONTH);
		
		if(firstWeekSign == 1){
			result =  SpecialWeek_First_Day_Of_Week_Of_Month;
		}else if((maxDayOfMonth - calendar.get(Calendar.DAY_OF_MONTH)) < 7){
			result = SpecialWeek_Last_Day_Of_Week_Of_Month;
		}
		
		if(result==null) result = String.valueOf(numberOfWeek);
		
		return result;
	}
	
	public static void main(String[] args){
		
		getSpecialWeek(2015,3,20);
		
		for(int i=0;i<12;i++){
			for(int j=1;j<32;j++){
				try{
				
				System.out.println(getSpecialWeek(2015,i,j));
				System.out.println("2015-"+i+"-"+j);
				}catch(Exception e){
					
				}
			}
		}
	}
}
