import java.util.Scanner;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class ToDo
{
	
	public static void main(String [] args) throws Exception
	{
	Map<String, Runnable> commands = new HashMap<>(); // I use a hashmap for simpler/cleaner storing of the functions

	System.out.println("Type `top` to show whats on the top of your list. \nType `remove` if you have finished the top item and would like to remove it.\nType `addtask` if you'd like to add a task to yur list.\nType `addevent` if you'd like to add an event to yur list.\nType `showall` to show your current list\nType `end` to stop your program.");
	Queue q = new Queue(); // i initialize my Queue


	commands.put("remove",() ->  q.dequeue()); // These lines are just me adding the options to my hashmap
	commands.put("top", () -> q.tip());
	commands.put("addtask", () -> q.enqueue(Task.createTask())); // This calls task creation and adds it to the current Queue
	commands.put("addevent", () -> q.enqueue(Event.createEvent()));
	commands.put("end",() ->   System.exit(0));
	commands.put("showall",() -> q.showAll());
	
	
	while(true){
		Scanner intake = new Scanner(System.in);
		String inputWord = intake.next();
		inputWord = inputWord.toLowerCase(); // Convert your input to lowercase so it doesnt have to be case sensitive
		try
		{
			commands.get(inputWord).run(); // check your input against my hashmap and ri=un the relavent command
		  	System.out.println("\n\nType `top` to show whats on the top of your list. \nType `remove` if you have finished the top item and would like to remove it.\nType `addtask` if you'd like to add a task to yur list.\nType `addevent` if you'd like to add an event to yur list.\nType `showall` to show your current list\nType `end` to stop your program.\n\n");
		}
		catch(Exception NullPointerException) // if your input is not in the hashmap it is an incorrect command.
		{
			System.out.println("Incorrect input");
		}
	}
	}
} 




