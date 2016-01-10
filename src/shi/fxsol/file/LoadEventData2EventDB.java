package shi.fxsol.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import shi.fxsol.db.EventDaoImpl;
import shi.fxsol.domain.Event;
import shi.fxsol.domain.eventdef.EventDef;
import shi.fxsol.domain.eventdef.US;

public class LoadEventData2EventDB {

	public static void loadEventFolder2DB(File folder){
		File[] dirs = folder.listFiles();
		for(File dir : dirs){
			System.out.println("Process dir: " + dir.getName());
			if(dir.isDirectory()){
				String country = dir.getName().toUpperCase();
				File[] eventfiles = dir.listFiles();
				for(File eventfile : eventfiles){
					System.out.println("Process file: " + eventfile.getName());
					try{
						List<Event> events = processOneEventFile(country, eventfile);
						
						EventDaoImpl.insertEvents(events);
					}catch(Exception e){
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	public static List<Event> processOneEventFile(String country, File eventfile){
		List<Event> events = new ArrayList<>();
		
		if(eventfile.isFile()){
			String eventdefname = eventfile.getName().substring(0,eventfile.getName().length()-".txt".length()).trim();
			
			EventDef eventDef = null;
			if("US".equals(country.toUpperCase())){
				eventDef = US.getUSEvent(eventdefname);
			}
			if(eventDef==null) return events;
			
			BufferedReader bufferedReader = null;
			try {
				bufferedReader = new BufferedReader(new FileReader(eventfile));
				//读取中文出现问题,换成可以配置编码格式的方案,UTF-8,GBK. my mistake cause i copy gbk file to utf-8 project
//				bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(eventfile),"GBK"));
				
				String oneline = bufferedReader.readLine();
				
				while(oneline!=null){
					try {
						Event event = EventReadUtils.retrieveOneEvent(country, eventDef.getName(), eventDef.getTimeOfDay(), oneline);
						if(event!=null){
							events.add(event);
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
					oneline = bufferedReader.readLine();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				if(bufferedReader!=null)
					try {
						bufferedReader.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
			}
		}
		
		return events;
	}
}
