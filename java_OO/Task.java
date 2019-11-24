import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
public class Task extends Converter
{
	private String duration;// Creating the local variables of this class
	private List<String> members;
	public Task(String chosenDate, String startTime, String duration, List<String> members){ // inheriting the parent class variables and initializing the local variables
	super(chosenDate, startTime);
	this.duration = duration;
	this.members = members;
	}	


	public static Converter createTask	() // creation of a task
	{
		String chosenDate = calcDate(); // calling parent class methods
		String startTime = calcStartTime(); // ^^
		String duration = calcDuration();// calling the local creation methods
		List<String> members = calcMembers();// ^^
		Task taskObject =  new Task(chosenDate, startTime, duration, members); // creating the task object
		return taskObject;
	}

	public static String calcDuration() // taking in the wanted task duration
	{
		System.out.println("Please enter the duration of your event");
		Scanner in = new Scanner(System.in);
		String duration = in.nextLine();
		return duration + ", ";
	}

	public static List<String> calcMembers() // taking in the wanted member list
	{

		System.out.println("Please enter each member of your event, seperated by just ','s");
		Scanner intake = new Scanner(System.in);
		String member = intake.nextLine();
		List<String> members = Arrays.asList(member.split(",")); // spliting the member list on commas to account for full name inputs.
		return members;
	}
	
	public String getDuration() //getters mainly used for toString methods
	{
		return this.duration;
	}
	public List<String> getMembers()
	{
		return this.members;
	}
		
	
	public String toString() //toString method that uses to toString of the parent class.
	{
		return "Task: " + super.toString() + "Duration:-->" + getDuration() + "Members:-->" + getMembers();
	}


}