package shi.fxsol.vo;

import java.util.Date;

public class FxMetaData {
	
	//
	private String name;
	private String timeframe;
	
	private Date datetime;
	private int year;
	private int month;
	private int day;
	private String sdate;
	private String stime;
	
	private int open;
	private int high;
	private int low;
	private int close;
	private int volumn;
	
	//星期几
	private String weekofday;
	//这个月的第几次星期N
	private int dayOfWeekInMonth;
	//第一个/最后一个周
	private String specialweek;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTimeframe() {
		return timeframe;
	}
	public void setTimeframe(String timeframe) {
		this.timeframe = timeframe;
	}
	public Date getDatetime() {
		return datetime;
	}
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String getSdate() {
		return sdate;
	}
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	public String getStime() {
		return stime;
	}
	public void setStime(String stime) {
		this.stime = stime;
	}
	public String getWeekofday() {
		return weekofday;
	}
	public void setWeekofday(String weekofday) {
		this.weekofday = weekofday;
	}
	public String getSpecialweek() {
		return specialweek;
	}
	public void setSpecialweek(String specialweek) {
		this.specialweek = specialweek;
	}
	public int getOpen() {
		return open;
	}
	public void setOpen(int open) {
		this.open = open;
	}
	public int getHigh() {
		return high;
	}
	public void setHigh(int high) {
		this.high = high;
	}
	public int getLow() {
		return low;
	}
	public void setLow(int low) {
		this.low = low;
	}
	public int getClose() {
		return close;
	}
	public void setClose(int close) {
		this.close = close;
	}
	public int getVolumn() {
		return volumn;
	}
	public void setVolumn(int volumn) {
		this.volumn = volumn;
	}
	public int getDayOfWeekInMonth() {
		return dayOfWeekInMonth;
	}
	public void setDayOfWeekInMonth(int dayOfWeekInMonth) {
		this.dayOfWeekInMonth = dayOfWeekInMonth;
	}

}
