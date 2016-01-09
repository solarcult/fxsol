package shi.fxsol;

import java.io.File;

import shi.fxsol.file.LoadCVSData2FxMetaData2DB;

public class FeedFxFile2PostgreSQL {

	public static void main(String[] args) {
		File dataDir = new File("metadata\\fx");
		LoadCVSData2FxMetaData2DB.loadFoler2DB(dataDir);
	}
}
