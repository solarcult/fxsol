package shi.fxsol;

import java.io.File;
import java.util.Random;

public class X {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello EUR/USD!");
		
		File xxx = new File("F:\\game\\xxx");
//		File xxx = new File("E:\\xxx");
		renameRandom(xxx);
	}
	
	public static void renameRandom(File xxx){
		Random r = new Random();
		File[] xs = xxx.listFiles();
		for(File t : xs){
			String newname = "Java"+Math.abs(r.nextInt());
			if(t.isDirectory()){
				renameRandom(t);
			}else if(t.isFile()){
				int pos = t.getName().indexOf(".");
				String end = t.getName().substring(pos);
				newname += end;
			}else{
				System.out.println(t.getAbsolutePath() + t.getName());
			}
			t.renameTo(new File(t.getParent(),newname));
		}
	}
	
	

}
