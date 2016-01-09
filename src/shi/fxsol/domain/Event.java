package shi.fxsol.domain;

import java.util.Calendar;

public class Event{
	private String country;
	private String name;
	private int year;
	private int month;
	private int day;
	private int hour;
	private int minute;
	//日期的字符串类型 2014.09.09
	private String sdate;
	//时间的字符串类型 11:07
	private String stime;

	private double expect;
	private double actual;
	private double diff;
	
	private Calendar edate;
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public double getExpect() {
		return expect;
	}
	public void setExpect(double expect) {
		this.expect = expect;
	}
	public double getActual() {
		return actual;
	}
	public void setActual(double actual) {
		this.actual = actual;
	}
	public double getDiff() {
		return diff;
	}
	public void setDiff(double diff) {
		this.diff = diff;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(actual);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + day;
		temp = Double.doubleToLongBits(diff);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(expect);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + hour;
		result = prime * result + minute;
		result = prime * result + month;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((sdate == null) ? 0 : sdate.hashCode());
		result = prime * result + ((stime == null) ? 0 : stime.hashCode());
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
		Event other = (Event) obj;
		if (Double.doubleToLongBits(actual) != Double
				.doubleToLongBits(other.actual))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (day != other.day)
			return false;
		if (Double.doubleToLongBits(diff) != Double
				.doubleToLongBits(other.diff))
			return false;
		if (Double.doubleToLongBits(expect) != Double
				.doubleToLongBits(other.expect))
			return false;
		if (hour != other.hour)
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
		if (sdate == null) {
			if (other.sdate != null)
				return false;
		} else if (!sdate.equals(other.sdate))
			return false;
		if (stime == null) {
			if (other.stime != null)
				return false;
		} else if (!stime.equals(other.stime))
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	public Calendar getEdate() {
		return edate;
	}
	public void setEdate(Calendar edate) {
		this.edate = edate;
	}
	@Override
	public String toString() {
		return "Event [country=" + country + ", name=" + name + ", year="
				+ year + ", month=" + month + ", day=" + day + ", hour=" + hour
				+ ", minute=" + minute + ", sdate=" + sdate + ", stime="
				+ stime + ", expect=" + expect + ", actual=" + actual
				+ ", diff=" + diff + ", edate=" + edate + "]";
	}
	
}
