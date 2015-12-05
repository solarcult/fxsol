package shi.fxsol;

import java.io.File;

import shi.fxsol.cvs.LoadCVSData2FxMetaData2DB;

public class FeedFxMetaData2PostgreSQL {

	public static void main(String[] args) {
		File dataDir = new File("fxmetadata");
		LoadCVSData2FxMetaData2DB.loadFoler2DB(dataDir);
	}

}
