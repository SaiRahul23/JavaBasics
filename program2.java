package firstproject;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class program2 {

	public static void main(String[] args) throws Exception {
		FileInputStream in=null;
		FileOutputStream out=null;
		
		try {
			in=new FileInputStream("PU.txt"); //Path of PU.txt
			out=new FileOutputStream("CSE.txt"); //Path of CSE.txt
			int c;
			while((c=in.read())!=1){
				out.write(c);
			}
		}
		finally {
			if(in!=null) {
				in.close();
			}
			if(out!=null) {
				out.close();
			}
		}

	}

}
