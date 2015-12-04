package shi.fxsol.vo;

import java.sql.Date;

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
	
	private double open;
	private double high;
	private double low;
	private double close;
	private long volumn;
	
	//星期几
	private String weekofday;
	//这个月的第几周
	private int numberofweek;
	//第一个/最后一个周
	private String specialweek;
}
