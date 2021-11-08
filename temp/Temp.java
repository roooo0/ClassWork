package temp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {

		TempRecord record[] = new TempRecord[165];	
		
		//create scanner to read in files
		Scanner input = null;
		try {
			input = new Scanner( new File("tempsLA.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File Could not be opened!!!");
			e.printStackTrace();
		}//end code for reading in txt

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	//method to find average
	public static double average(TempRecord[] temp) {
		double sum = 0;
		for(int i = 0; i < temp.length; i++) {
			sum += temp[i];
		}//end for
		return sum/temp.length;
	}//end average method
	
	//create stdDev problem
	public static double standardDevation(TempRecord[] temp) {
		double sum = 0;
		double avg = average(temp);
		for(int i = 0; i < temp.length; i++) {
			sum += Math.pow(getTemp[i] - avg, 2);
		}//end \
		
		return Math.sqrt(sum/(temp.length - 1));
		
	}//end stdDev

}
