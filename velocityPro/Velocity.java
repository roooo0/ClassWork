//Ruben Nunez
//9.1.21
//Creating a program that takes in data and displays them according to time, Vi, Vf, Acceleration in second and hours, and creating an algo for displacement. 

package velocityPro;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Velocity {

	public static void main(String[] args) {
		//Create our double list to hold in Vi and Vf and create a variable for time
		double[] vi = new double[100];
		double[] vf = new double[100];
		int time = 60;
		//create code to read in the data from txt file
		Scanner input = null;
		try {
			input = new Scanner( new File("velocities.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File Could not be opened!!!");
		}//end code for reading in txt
		//This line of code goes through our txt file
		int index = 0;
		while(input.hasNext()) {
			vi[index] = input.nextDouble();
			vf[index++] = input.nextDouble();
		}//end while loop
		//create a table for our output.
		System.out.printf("%1s %15s %15s %15s %15s %15s \n", "Time(s)", "Init v(m/s)", "Final v(m/s)", "Acceleration(m/s/s)", "Acceleration(m/hr/s)", "Displacement");
		//Create some code to make sure we limit the decimal points.
		for(int i = 0; i < vf.length; i++) {
			DecimalFormat df = new DecimalFormat(".####");
					
			double acc = acceleration(vi[i], vf[i], time);
			double msToMph = metersPerSecToMilesPerSec(acc);
			double dis = displacement(vi[i], vf[i], time);
			System.out.println(time + "           " + vi[i] + "            " + vf[i]+ "         "
					+ df.format(acc) + "             " + df.format(msToMph) + "                 " +
					dis);
			}
	}//end main
	//formula for finding Acceleration
	public static double acceleration(double vi, double vf, int time) {
		return (vf - vi)/time;
	}//end acc
	
	//Converts mps to mps
	public static double metersPerSecToMilesPerSec(double meters) { 
		return meters * 2.23694;	
	}//end mp
	
	//our formula for displacment.
	public static double displacement(double vi, double vf, int time) {
		return ((vf + vi)/2) *time;
	}

}//end class
