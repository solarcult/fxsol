package shi.fxsol.vo;

import java.util.Date;

public class FxMetaData {
	
	//交易品种
	private String name;
	//时间框架 分钟计数 1440
	private String timeframe;
	
	private Date datetime;
	private int year;
	private int month;
	private int day;
	private int hour;
	private int minute;
	//日期的字符串类型 2014.09.09
	private String sdate;
	//时间的字符串类型 11:07
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
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	@Override
	public String toString() {
		return "FxMetaData [name=" + name + ", timeframe=" + timeframe
				+ ", datetime=" + datetime + ", year=" + year + ", month="
				+ month + ", day=" + day + ", hour=" + hour + ", minute="
				+ minute + ", sdate=" + sdate + ", stime=" + stime + ", open="
				+ open + ", high=" + high + ", low=" + low + ", close=" + close
				+ ", volumn=" + volumn + ", weekofday=" + weekofday
				+ ", dayOfWeekInMonth=" + dayOfWeekInMonth + ", specialweek="
				+ specialweek + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + close;
		result = prime * result
				+ ((datetime == null) ? 0 : datetime.hashCode());
		result = prime * result + day;
		result = prime * result + dayOfWeekInMonth;
		result = prime * result + high;
		result = prime * result + hour;
		result = prime * result + low;
		result = prime * result + minute;
		result = prime * result + month;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + open;
		result = prime * result + ((sdate == null) ? 0 : sdate.hashCode());
		result = prime * result
				+ ((specialweek == null) ? 0 : specialweek.hashCode());
		result = prime * result + ((stime == null) ? 0 : stime.hashCode());
		result = prime * result
				+ ((timeframe == null) ? 0 : timeframe.hashCode());
		result = prime * result + volumn;
		result = prime * result
				+ ((weekofday == null) ? 0 : weekofday.hashCode());
		result = prime * result + year;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FxMetaData other = (FxMetaData) obj;
		if (close != other.close)
			return false;
		if (datetime == null) {
			if (other.datetime != null)
				return false;
		} else if (!datetime.equals(other.datetime))
			return false;
		if (day != other.day)
			return false;
		if (dayOfWeekInMonth != other.dayOfWeekInMonth)
			return false;
		if (high != other.high)
			return false;
		if (hour != other.hour)
			return false;
		if (low != other.low)
			return false;
		if (minute != other.minute)
			return false;
		if (month != other.month)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (open != other.open)
			return false;
		if (sdate == null) {
			if (other.sdate != null)
				return false;
		} else if (!sdate.equals(other.sdate))
			return false;
		if (specialweek == null) {
			if (other.specialweek != null)
				return false;
		} else if (!specialweek.equals(other.specialweek))
			return false;
		if (stime == null) {
			if (other.stime != null)
				return false;
		} else if (!stime.equals(other.stime))
			return false;
		if (timeframe == null) {
			if (other.timeframe != null)
				return false;
		} else if (!timeframe.equals(other.timeframe))
			return false;
		if (volumn != other.volumn)
			return false;
		if (weekofday == null) {
			if (other.weekofday != null)
				return false;
		} else if (!weekofday.equals(other.weekofday))
			return false;
		if (year != other.year)
			return false;
		return true;
	}
}
