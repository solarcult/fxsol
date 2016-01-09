package shi.fxsol;

import java.io.File;

import shi.fxsol.file.LoadEventData2EventDB;

public class FeedEventFile2PostgreSQL {

	public static void main(String[] args) {
		File dataDir = new File("metadata\\event");
		LoadEventData2EventDB.loadEventFolder2DB(dataDir);
	}
}
