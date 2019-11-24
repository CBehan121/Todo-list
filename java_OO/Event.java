import java.util.Scanner;
import java.util.List;
public class Event extends Converter // Extending Converter for the type and methods
{
	private String location; // Creating the private variabled location.
	public Event(String chosenDate, String startTime, String location){
	super(chosenDate, startTime); // inheriting chosenDate and startTime variables from Converter
	this.location = location; // initializing location
	}

	public static Converter createEvent()  // Creates an event object
	{
		String chosenDate = calcDate(); //calls parent class methods (Converter)
		String startTime = calcStartTime(); // ^^
		String location = calcLocation(); // calls local method and stores it in a private variable
		Event words =  new Event(chosenDate, startTime, location); // creates an event
		return words;
	}

	public static String calcLocation() // generates a location from user input
	{
		System.out.println("Please enter a location");
		Scanner intake = new Scanner(System.in);
		String c = intake.nextLine();
		return c;
	}
	public String getLocation() // just a simple getter for my location
	{
		return this.location;
	}

	public String toString()
	{
		return "Event: " + super.toString() +"Location:-->" + getLocation();
	}	
}