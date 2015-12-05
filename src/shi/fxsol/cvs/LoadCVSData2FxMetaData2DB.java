package shi.fxsol.cvs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.CharUtils;

import shi.fxsol.vo.FxMetaData;

public class LoadCVSData2FxMetaData2DB {

	public static void loadFoler2DB(String foldername){
		File folder = new File(foldername);
		File[] files = folder.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return (name.endsWith(".csv"));
			}
		});
		for(File csv : files){
			try{
				List<FxMetaData> fxMetaDatas = processOneCSVFile(csv);
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	public static List<FxMetaData> processOneCSVFile(File csvfile){
		List<FxMetaData> fxMetaDatas = new ArrayList<FxMetaData>();
		
		if(csvfile.isFile()){
			String filefullname = csvfile.getName().substring(0,csvfile.getName().length()-".csv".length());
			int fxnamestop  = -1;
			int timeframestart = -1;
			for(int i=0;i<filefullname.length();i++){
				char x = filefullname.charAt(i);
				if(x=='.'){
					if(fxnamestop==-1) fxnamestop = i;
				}
				if(CharUtils.isAsciiNumeric(x)){
					if(fxnamestop==-1) fxnamestop = i;
					if(timeframestart == -1) timeframestart = i;
				}
			}
			
			if(fxnamestop == -1 || timeframestart == -1){
				System.out.println("file name error: " + filefullname);
			}
			
			//通过文件名解析出名称和时间框架
			String fxname = filefullname.substring(0,fxnamestop);
			String timeframe = filefullname.substring(timeframestart);
			
			try {
				BufferedReader bufferedReader = new BufferedReader(new FileReader(csvfile));
				String oneline = bufferedReader.readLine();
				FxMetaData fxMetaData = CSVReadUtils.retrieveOneLine(oneline);
				if(fxMetaData!=null){
					fxMetaData.setName(fxname);
					fxMetaData.setTimeframe(timeframe);
					fxMetaDatas.add(fxMetaData);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return fxMetaDatas;
	}
	
	
	public static void main(String[] args){
//		String xf = "EURCNH1440.csv";
		String xf = "UKOIL.F30.csv";
		String filefullname = xf.substring(0,xf.length()-".csv".length());
		int fxnamestop  = -1;
		int timeframestart = -1;
		for(int i=0;i<filefullname.length();i++){
			char x = filefullname.charAt(i);
			if(x=='.'){
				if(fxnamestop==-1) fxnamestop = i;
			}
			if(CharUtils.isAsciiNumeric(x)){
				if(fxnamestop==-1) fxnamestop = i;
				if(timeframestart == -1) timeframestart = i;
			}
		}
		
		if(fxnamestop == -1 || timeframestart == -1){
			System.out.println("file name error: " + filefullname);
		}
		
		System.out.println(filefullname.substring(0,fxnamestop));
		System.out.println(filefullname.substring(timeframestart));

	}
}
