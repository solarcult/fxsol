package shi.fxsol.statistics;

import java.util.List;

import shi.fxsol.db.EventDaoImpl;
import shi.fxsol.db.FxMetaDataDaoImpl;
import shi.fxsol.domain.Event;
import shi.fxsol.domain.FxMetaData;
import shi.fxsol.domain.FxTimeFrame;
import shi.fxsol.domain.eventdef.EventDef;
import shi.fxsol.domain.eventdef.US;

public class EventHoursRange {

	public static void analyze30MinRange(){
		List<EventDef> eventDefs = US.listEventDefs();
		for(EventDef eventDef : eventDefs){
			List<Event> events = EventDaoImpl.listEvents(eventDef.getCountry(), eventDef.getName(), 16);
			for(Event event : events){
				//分析每一个事件
				System.out.println("\n"+event.getName());
				List<FxMetaData> fxs = FxMetaDataDaoImpl.listFxMetaDatas4nameXtimeframe("EURUSD", FxTimeFrame.T30, event.getYear(), event.getMonth(), event.getDay(), event.getHour(), event.getMinute(), 3);
				for(FxMetaData fx : fxs){
					double diff = event.getDiff();
					if(event.getName().equals("Employment Situation")){
						diff = diff/1000;
					}
					double range = (fx.getHigh() - fx.getLow());
					System.out.println(range + " -> "+ diff);
					System.out.println(range/diff);
				}
				
			}
		}
		
		
	}
	
	public static void main(String[] args){
		analyze30MinRange();
	}
}
