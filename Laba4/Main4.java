package Laba4;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedList;

import Laba2.Trans;

public class Main4 {

	public static void Array(int num) {
		System.out.println("---- ArrayList - "+num+" ----");
		LocalTime time = LocalTime.now();
		Log.print("Программа запущена - " + time.format(DateTimeFormatter.ofPattern("H:mm:ss"))+"\n~ArrayList - "+num);

		ArrayList<Trans> trs = new ArrayList<Trans>();
		long time_add=0, time_remove = 0;
		for (int n=0; n<num; n++) {					// добавление
			int max_speed = RandomGeneration.RandSpeed();
			String model = RandomGeneration.RandModel();
			String mark = RandomGeneration.RandMark();
			Trans tr = new Trans(model, mark, max_speed);
			int time_mc = (int)System.nanoTime();
			trs.add(tr);
			int time_mc_end = (int)System.nanoTime();
			time_add = time_add + (time_mc_end-time_mc);
		
			Log.print("add,ID="+" "+n+ " " + (time_mc_end-time_mc));
			LogLite.print("aAdd "+n+ " " + (time_mc_end-time_mc));
		} 
		Log.print("addTotalCount = " + num +"\n" + "addTotalTime = "+(time_add)+"\naddMedianTime = " + (time_add)/num);
		LogLite_2.print("aAddTotalTime = "+num+" "+time_add);
		for (Trans tr : trs) {	System.out.println(tr.toString());} 

		for (int n=0; n<num/10; n++) {		//изменение
			int id = RandomGeneration.rnd(1, num);
			int time_mc = (int)System.nanoTime();
			if (trs.contains(id)) {trs.remove(id);}
			int time_mc_end = (int)System.nanoTime();
			time_remove = time_remove + (time_mc_end-time_mc);
			Log.print("remove, ID= "+id + "\t" + (time_mc_end-time_mc));
			LogLite.print("aRemove "+id+ " " + (time_mc_end-time_mc));
		}
		Log.print("removeTotalCount = " + num/10 +"\n" + "removeTotalTime = "+time_remove+"\nremoveMedianTime = " + (time_remove)/(num/10));
		LogLite_2.print("aRemoveTotalTime = "+num+" "+time_remove);
		LocalTime time_end = LocalTime.now();
		Log.print("Программа завершена - "+time_end.format(DateTimeFormatter.ofPattern("H:mm:ss")));

	}

	public static void Linked(int num){
		System.out.println(" ");
		System.out.println("---- LinkedList - "+num+" ----");
		LocalTime timel = LocalTime.now();
		Log.print("Программа запущена - "+timel.format(DateTimeFormatter.ofPattern("H:mm:ss"))+"\n~LinkedList - "+num);

		LinkedList <Trans> test = new LinkedList<Trans>();
		long time_add=0, time_remove = 0;

		for (int n=0; n<num; n++) {			//добавление
			int max_speed = RandomGeneration.RandSpeed();
			String model = RandomGeneration.RandModel();
			String mark = RandomGeneration.RandMark();
			Trans tr = new Trans(model, mark, max_speed);
			int timel_mc = (int)System.nanoTime();
			test.add(tr);
			int timel_mc_end = (int)System.nanoTime();
			time_add = time_add + (timel_mc_end-timel_mc);
			Log.print("add, ID= "+n + "\t" + (timel_mc_end-timel_mc));
			LogLite.print("lAdd "+n+ " " + (timel_mc_end-timel_mc));
		}
		Log.print("addTotalCount = " + num +"\n" + "addTotalTime = "+(time_add)+"\naddMedianTime = " + (time_add)/num);
		LogLite_2.print("lAddTotalTime = "+num+" "+time_add);

		for (int n=0; n<num/10; n++) {		//изменение
			int id1 = RandomGeneration.rnd(1, num);
			int time_mc = (int)System.nanoTime();
			if (test.contains(id1)) {test.remove(id1);}
			int time_mc_end = (int)System.nanoTime();
			time_remove = time_remove + (time_mc_end-time_mc);
			Log.print("remove, ID= "+id1 + "\t" + (time_mc_end-time_mc));
			LogLite.print("lRemove "+id1+ " " + (time_mc_end-time_mc));
		}	Log.print("removeTotalCount = " + num/10 +"\n" + "removeTotalTime = "+time_remove+"\nremoveMedianTime = " + (time_remove)/(num/10));
			LogLite_2.print("lRemoveTotalTime = "+num+" "+time_remove);

		LocalTime timel_end = LocalTime.now();
		Log.print("Программа завершена - "+timel_end.format(DateTimeFormatter.ofPattern("H:mm:ss"))+"\n");
	}


	public static void main(String[] args) {
		//Array(10);
		Array(100);
		//Array(1000);
		//Array(10000);
		//Array(100000);

		//Linked(10);
		Linked(100);
		//Linked(1000);
		//Linked(10000);
		//Linked(100000);
	}
}
