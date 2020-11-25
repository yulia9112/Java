package Laba4;

import java.io.*;

public class LogLite {
		
		public static void print(String text) {
			//System.out.println(text);
			try {
				FileOutputStream fileStream = new FileOutputStream("LogLite.txt", true);
				OutputStreamWriter writer = new OutputStreamWriter(fileStream);
				writer.append(/*dateTime + " " + */text + "\r\n");
				writer.close();
				fileStream.close();			
			} catch (IOException e) {
			    e.printStackTrace();
			}
		}
	}
