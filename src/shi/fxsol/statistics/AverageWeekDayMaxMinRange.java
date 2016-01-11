package shi.fxsol.statistics;

import java.util.List;
import java.util.Map.Entry;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

import shi.fxsol.db.FxMetaDataDaoImpl;
import shi.fxsol.domain.FxMetaData;
import shi.fxsol.domain.FxTimeFrame;
import shi.fxsol.uitls.EnhancedKeyAlwaysGetDescriptiveStatisticsMap;
import shi.fxsol.uitls.FxCalenderUtils;

public class AverageWeekDayMaxMinRange {

	//按照星期N算平均最大波动
	public static void analyzeWeekdayMaxMinRange(String name,FxTimeFrame timeframe,int lastNmonth){

 		List<FxMetaData> fxMetaDatas = FxMetaDataDaoImpl.listFxMetaDatas4nameXtimeframe( name, timeframe, lastNmonth);
		EnhancedKeyAlwaysGetDescriptiveStatisticsMap map = new EnhancedKeyAlwaysGetDescriptiveStatisticsMap();
		for(FxMetaData one : fxMetaDatas){
			map.get(one.getWeekofday()).addValue(one.getHigh()-one.getLow());
		}
		
		for(Entry<String,DescriptiveStatistics> entry : map.entrySet()){
			System.out.println();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println("- - -");
		}
	}
	
	public static void analyzeSpecialweekofDayMaxMinRange(String name,FxTimeFrame timeframe,int lastNmonth){

 		List<FxMetaData> fxMetaDatas = FxMetaDataDaoImpl.listFxMetaDatas4nameXtimeframe( name, timeframe, lastNmonth);
		EnhancedKeyAlwaysGetDescriptiveStatisticsMap map = new EnhancedKeyAlwaysGetDescriptiveStatisticsMap();
		for(FxMetaData one : fxMetaDatas){
			map.get(one.getSpecialweek()+" : "+one.getWeekofday()).addValue(one.getHigh()-one.getLow());
		}
		
		for(Entry<String,DescriptiveStatistics> entry : map.entrySet()){
			System.out.println();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println("- - -");
		}
	}
	
	public static void analyzeMonthSpecialweekofDayMaxMinRange(String name,FxTimeFrame timeframe,int lastNmonth){

 		List<FxMetaData> fxMetaDatas = FxMetaDataDaoImpl.listFxMetaDatas4nameXtimeframe( name, timeframe, lastNmonth);
		EnhancedKeyAlwaysGetDescriptiveStatisticsMap map = new EnhancedKeyAlwaysGetDescriptiveStatisticsMap();
		for(FxMetaData one : fxMetaDatas){
			map.get(FxCalenderUtils.convertNumberMonth2String(one.getMonth())+" : "+one.getSpecialweek()+" : "+one.getWeekofday()).addValue(one.getHigh()-one.getLow());
		}
		
		for(Entry<String,DescriptiveStatistics> entry : map.entrySet()){
			System.out.println();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println("- - -");
		}
	}
	
	public static void main(String[] args){
//		analyzeWeekdayMaxMinRange();
//		analyzeSpecialweekofDayMaxMinRange("EURCNH","1440",24);
//		analyzeSpecialweekofDayMaxMinRange("EURUSD","1440",24);
		analyzeMonthSpecialweekofDayMaxMinRange("EURUSD",FxTimeFrame.T1440,72);
	}
}
