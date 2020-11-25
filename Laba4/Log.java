package Laba4;

import java.io.*;

public class Log {
	
	public static void print(String text) {
		//System.out.println(text);
		/*Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("dd.MM.yy HH:mm:ss");
		String dateTime = df.format(date);*/
		try {
			FileOutputStream fileStream = new FileOutputStream("Log.txt", true);
			OutputStreamWriter writer = new OutputStreamWriter(fileStream);
			writer.append(/*dateTime + " " + */text + "\r\n");
			writer.close();
			fileStream.close();			
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}
}