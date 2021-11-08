//ruben nunez
//9.6.20
//Creating a parrellel array to hold in data

package tempPro;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		
		//arrays to get data
		int[] year = new int[165];
		double[] temp = new double[165];
		//create scanner to read in files
		Scanner input = null;
		try {
			input = new Scanner( new File("tempsLA.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File Could not be opened!!!");
			e.printStackTrace();
		}//end code for reading in txt
		//go through the files
		int index = 0;
		while(input.hasNext()) {
			year[index] = input.nextInt();
			temp[index++] = input.nextDouble();
		}//end while loop
		//using the method to get average
		double average = average(temp);
		System.out.println("Average is " + average);
		//useing method to get stdDev
		double stdDev = standardDevation(temp);
		System.out.println("Standard Devation is " + stdDev);
		//go through the array and print out everything
		for(int i = 0; i < temp.length; i++) {
			if(temp[i] > average + stdDev);
			System.out.println("Year: " + year[i] + " Temp: " + temp[i]);
		}

		
		
		
		
	}//end main
	//method to find average
	public static double average(double[] array) {
		double sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}//end for
		return sum/array.length;
	}//end average method
	//create stdDev problem
	public static double standardDevation(double[] array) {
		double sum = 0;
		double avg = average(array);
		for(int i = 0; i < array.length; i++) {
			sum += Math.pow(array[i] - avg, 2);
		}//end \
		return Math.sqrt(sum/(array.length - 1));
	}//end stdDev

}//end class
