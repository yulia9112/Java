package Laba4;

import java.util.Random;

public class RandomGeneration{
	
	//Генерация случайных значений параметров марки, модели и скорости
		public static String RandMark() { 		
			Random random = new Random();
		    String[] mark = { "‎BMW", "‎Toyota", "‎Volkswagen", "‎Ford", "Nissan" };
		    int pos = random.nextInt(mark.length);	   
		    return (mark[pos]);	}
		
		public static String RandModel() { 		
			Random random = new Random();
		    String[] model = { "‎M1", "‎M2", "X1", "‎X2", "X3", "Terrano", "‎Qashqai","X-Trail" };
		    int pos = random.nextInt(model.length);	   
		    return (model[pos]);	}
		
		public static int RandSpeed() { 		
			final int min = 8; // Минимальное число для диапазона
	        final int max = 17; // Максимальное число для диапазона
	        final int max_speed = 10 * rnd(min, max);
	        return (max_speed);	}
		
		 public static int rnd(int min, int max)
	     {
	             max -= min;
	             return (int) (Math.random() * ++max) + min;
	     }

	


}
