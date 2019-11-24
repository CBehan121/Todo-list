import java.util.*;
import java.util.Arrays;


public class Queue
{

	private ArrayList<Converter> listy; // create the private Arraylist 
	
	public ArrayList<Converter> getQueue() // simple getter for the Arraylist
	{
		return listy;
	}

	public Queue()
	{	
		this.listy=new ArrayList<Converter>(); //initialize the ArrayList
	}
	public void enqueue(Converter name)
	{
		getQueue().add(name); // Add something to the start of the list
		
	}
	public void dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Your queue is already empty");
			
		}
		else
		{
		 	listy.remove(0); //Pop off the start of the list 
		}
	}

	public Boolean isEmpty() // a checker for if the list is empty
	{
		return( 0 == lengthOf() ); 
	}
	public void showAll(){ 
		if(lengthOf() > 0)
		{
			for (Converter item: getQueue())
			{	
				System.out.println(item);	
			}
		}
		else
		{
			System.out.println("\n\nYour queue is empty");
		}
		
	}

	public int lengthOf()
	{
		return getQueue().size();
	}

	public void tip(){
		if (isEmpty())
		{
			System.out.println("Your queue is empty");
		}
		else
		{
			System.out.println(getQueue().get(0));
		}
	}

}
