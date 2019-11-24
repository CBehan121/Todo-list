Input = "start"
wordString = "" #intializing my list

while(Input != "end"):  # Start a while loop that ends when a certain inout is given
	
	Input = input("\nChoose between [add], [delete], [show list], [end] or [show top]\n\n")
	if Input == "add": # Check if the user wishes to add a new event/task to the list
		checker = input("\nWould you Task or Event?\n")  # Take the task/event input
		if checker.lower() == "task":
			words = input("Please enter a Date.\n") + " "
			words += input("Please enter a Start time.\n") + " "
			words += input("Please enter a Duration.\n") + " "
			words += input("Please enter a list of members. \n")
			wordString =  wordString + words + "!" # Add the new task/event to the list. I use a ! to seperate each item.
		elif checker.lower() == "event":
			words = input("Please enter a Date, Start time and Location\n") + " "
			words += input("Please enter a Start time. \n") + " "
			words += input("Please enter a loaction. \n")
			wordString =  wordString + words + "!" # Add the new task/event to the list. I use a ! to seperate each item.
		else:
			print("you failed to enter a correct type.")


	elif Input ==  "show top": 
			if wordString != "": # Enure there is something in your list already
				i = 0
				while wordString[i] != "!": # iterates until i hit a ! which means ive reached the end of an item
					i += 1
				print("\n\n" + wordString[:i] + "\n") # print the first item in the list
			else:
				print("\n\nYour list is empty.\n")
			

	elif Input == "delete":
		if wordString != "": #the try is put in place incase the string is empty.
			i = 0
			while wordString[i] != "!": # iterate until i reach the end of the first task/event
				i += 1

			wordString = wordString[i + 1:] #make my list equal from the end of the first item onwards
		else:
			print("\n\nYour list is already empty.\n")


		
	elif Input == "show list":
		if wordString != "":
			fullList = "" # create a new instance of the list so i can append \n inbetween each entry.
			i = 0   # Normal counter
			j = 0	# holds the position when it finds a !
			for letter in wordString:
				if letter == "!": 
					fullList = fullList + wordString[j:i] + "\n" # appending each item to the new list seperated by \n  
					j = i + 1   # this needs a + 1 so it ignores the actual !
					
				i = i + 1
			print("\n\n" + fullList)
		else:
			print("\n\nYour list is empty\n")
	elif Input == "end":
		print("exiting program")


	else:
		print("\nYour input wasnt correct please try again\n") # This is just in place to catch any incorrect inputs you may enter.