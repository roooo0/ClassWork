//Ruben Nunez
//9.15.21 Using OOP to find our velcoity problem from before

package velocity;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Velocity {

	public static void main(String[] args) {

		//create an array for data
		int time = 60;
		VelocitySet[] vel = new VelocitySet[100];

		//get data from txt file
		Scanner input = null;
		try {
			input = new Scanner( new File("velocities.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File Could not be opened!!!");
		}//end code for reading in txt

		//go through the files
		int index = 0;
		while(input.hasNext()) {
			vel[index++] = new VelocitySet(input.nextDouble(), input.nextDouble());
		}//end while loop

		//create table for data
		System.out.println("Time(s)\t" + "Init v(m/s)\t" + "Final v(m/s)\t"
				+ "Acceleration(m/s/s)\t" + "Acceleration(m/hr/s)\t" + "Displacement");

		//add a decimal limit
		DecimalFormat df = new DecimalFormat(".####");

		//create for loop to display data
		for(int i = 0; i < vel.length; i++) {			
			double acc = acceleration(vel[i].getVi(), vel[i].getVf(), time);
			double msToMph = metersPerSecToMilesPerSec(acc);
			double dis = displacement(vel[i].getVi(), vel[i].getVf(), time);
			System.out.println(time + "\t" + vel[i].getVi() + "\t\t" + vel[i].getVf() + "\t\t"
					+ df.format(acc) + "\t\t\t" + df.format(msToMph) + "\t\t\t" +
					dis);
		}
	}//end main
	//getting the acceleration 
	public static double acceleration(double vi, double vf, int time) {
		double acc = 0;
		acc = (vf - vi)/time;

		return acc;
	}//end acc
	
	//getting the conversion from mps to miles per sec
	public static double metersPerSecToMilesPerSec(double meters) {
		return meters * 2.23694;
	}//end mp
	
	//get the displacemnt
	public static double displacement(double vi, double vf, int time) {
		double dis = ((vf + vi)/2) *time;
		return dis;
	}//end displamenet method
	
}//end class


