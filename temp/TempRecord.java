package temp;

public class TempRecord {

	//data variables these are the data that describe each object
		private int year;
		private double temp;
		
		//constructors - a method used to make the object in main memory
		//default constructor because nothing in parenthesis
		public TempRecord() {
			year = 2000;
			temp = 0.0;
		}//end constructor
		//none default
		public TempRecord(int year, double temp) {
			this.year = year;
			this.temp = temp;
		}
		//getter methods, accessor methods
		public int getYear() {
			return year;
		}//end getyear
		//make getter for temp
		public double getTemp() {
			return temp;
		}//end gettemp
		
		//setter methods
		public void setYear(int year) {
			this.year = year;
		}//endyear
		public void setTemp(double temp) {
			this.temp = temp;
		}//end settemp
		//create a to string 
		public String toString() {
			return "Year: " + year + " Temp: " + temp;
		}//end to string method
}//end class
