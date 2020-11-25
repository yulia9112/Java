package Laba4;

import java.io.*;

public class LogLite_2{
		
		public static void print(String text) {
			System.out.println(text);
			try {
				FileOutputStream fileStream = new FileOutputStream("LogLite_2.txt", true);
				OutputStreamWriter writer = new OutputStreamWriter(fileStream);
				writer.append(/*dateTime + " " + */text + "\r\n");
				writer.close();
				fileStream.close();			
			} catch (IOException e) {
			    e.printStackTrace();
			}
		}
	}
