import java.util.Scanner;
import java.util.List;
// My parent class that is used for its type and to create variables that are common between task and event.
public class Converter
{
	private String chosenDate; // Create my variables as private variables
	private String startTime;
	public Converter(String chosenDate, String startTime) // a straight forward constructor 
	{
		this.chosenDate = chosenDate; // initailize my variables 
		this.startTime = startTime;
		
	}
	public static String calcDate() // this method is used in both Task and Event creation
	{
		System.out.println("Please enter the date (In any format youd like)");
		Scanner intake = new Scanner(System.in);
		String c = intake.nextLine();
		return c  + ", "; // appends a ", " on the end for formatting purposes

	}
	public static String calcStartTime() // also used in Task and Event creation
	{
		System.out.println("Please enter the Start time");
		Scanner intake = new Scanner(System.in);
		String c = intake.nextLine();
		return c  + ", ";

	}
	public String getChosenDate() //getters mostly for the to string method
	{
		return this.chosenDate;
	}
		public String getStartTime() 
	{
		return this.startTime;
	}
	public String toString()
	{
		return "Date:-->" + getChosenDate() + "Start Time:-->" + getStartTime();
	}
}