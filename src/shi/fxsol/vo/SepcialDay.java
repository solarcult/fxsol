package shi.fxsol.vo;

import java.util.Calendar;

import shi.fxsol.uitls.DateUtils;

public class SepcialDay {
	
	public static String SpecialWeek_First_Day_Of_Week_Of_Month = "First_Day_Of_Week_Of_Month";
	public static String SpecialWeek_Last_Day_Of_Week_Of_Month = "Last_Day_Of_Week_Of_Month";
	
	//名字
	private String name;
	//几月份
	private int month;
	//星期几
	private String weekofday;
	//这个月的第几周
	private int numberofweek;
	//第一个/最后一个周几?
	private String specialweek;
	//描述
	private String description;
	
	
	public static String getSpecialWeek(int year, int month, int day){
		String result = null;
		Calendar x = Calendar.getInstance();x.setLenient(false);
		x.set(year,month,day);
		
		int numberOfWeek = x.get(Calendar.WEEK_OF_MONTH);
		int dayOfWeek = x.get(Calendar.DAY_OF_WEEK);
		
		int maxNumberOfWeek = x.getActualMaximum(Calendar.WEEK_OF_MONTH);
		
		if(numberOfWeek == 1){
			//判断是否为第一个周
			result = SpecialWeek_First_Day_Of_Week_Of_Month;
		}else if (numberOfWeek == 2){
			//如果为第2周,则判断第一周是相同的星期是否是本天
			Calendar first = DateUtils.getAyearBmonthXweekYday(year, month, 1, dayOfWeek);
			if(first!=null && first.get(Calendar.DAY_OF_MONTH)==day){
				result = SpecialWeek_First_Day_Of_Week_Of_Month;
			}
		}else if(numberOfWeek == maxNumberOfWeek){
			//判断是否为最后一周
			return SpecialWeek_Last_Day_Of_Week_Of_Month;
		}else if(numberOfWeek + 1 == maxNumberOfWeek){
			//判断是本周几下周是否还有相同的周几
			Calendar last = Calendar.getInstance();
			last.set(year,month,day+7);
//			last.add(Calendar.DAY_OF_MONTH,7);
			if(last.get(Calendar.MONTH) != month ){
				result = SpecialWeek_Last_Day_Of_Week_Of_Month;
			}
			
//			Calendar last = DateUtils.getAyearBmonthXweekYday(year, month, maxNumberOfWeek , dayOfWeek);
			//==null是没有找到,即之后再没有这星期几了
//			if(last!=null && last.get(Calendar.DAY_OF_MONTH) == day){
//				result = SpecialWeek_Last_Day_Of_Week_Of_Month;	
//			}
//			if(last==null){
//				result = SpecialWeek_Last_Day_Of_Week_Of_Month;
//			}
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
