package shi.fxsol.domain;

public enum FxTimeFrame {
	
	T5(5),T15(15),T30(30),T60(60),T240(240),T1440(1440),T10080(10080),T43200(43200);
	
	private int time;
	private FxTimeFrame(int value) {
		this.time = value;
	}
	
	public int getTime(){
		return time;
	}
	
	public String getSTime(){
		return String.valueOf(time);
	}
}
