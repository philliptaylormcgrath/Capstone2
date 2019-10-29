package co.grandcircus;

import java.util.ArrayList;
import java.util.Scanner;

//Present a list of options
	//1. List Task
	//2. Add Task
	//3. Delete Task
	//4. Mark Task as complete
	//5. Quit
//If the user chooses List Task
	//Display all tasks
	//Format the task so output is tabbed - may be easiest to show description last
	//Show task number (starting at 1, not 0)
////If the user chooses add task
	//Prompt the user to input each piece of data
		//Team member's name, task description, due date
		//Task completion defaults to incomplete/false. Things are only complete after user completes them
	//Instantiate a new task with this info, then add to the end of the list
//If the user chooses delete task
	//Ask which task number. Shift their input (1-size of list. Not starting at 0)
		//Validate that number. Must be within range. Prompt until they enter a valid number
		//Display the task the user selected. Ask if they're certain they want to delete it
			//If they select Y, remove the item from the list. Either way move to main menu
//If the user chooses mark task as complete
	//Ask which task number again. Validate again. Remember again that their inputs are +1 compared to index numbers.
		//Prompt until valid entry
	//Display chosen task. Ask if they're sure they want to mark as complete
		//If Y, mark as complete (default's to incomplete/false) and jump to main menu. Otherwise jump to main menu.
//If user chooses quit, ask if they're sure. 
	//EASY PEASY
public class Capstone2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Task> userList = new ArrayList<Task>();
		String taskName;
		String date;
		String description;
		int userInput;
		String userInput2 = "y";
		int userIndex = 0;
		
		do {

			System.out.println(
					"Please enter an input: " + "\n" + "1. List available tasks. " + "\n" + "2. Add a task. " + "\n" + "3. Delete a task. " + "\n" + "4. Mark task as complete" + "\n" + "5. Quit");

			userInput = scan.nextInt();
			System.out.println("You have selected: " + userInput);
			
			if (userInput == 1) {
				for (int i = 0; i < userList.size(); i++) {
					System.out.println(Integer.toString(i+1) + ". " + userList.get(i));}
			} else if (userInput == 2) {
				
				System.out.println("Please input the name of the person associated with this task: "); //add task happens here
				scan.nextLine();
					taskName = scan.nextLine();
					
					System.out.println("Please input the task description");
					
					description = scan.nextLine();
					
					System.out.println("Please input the due date: ");
					date = scan.nextLine();
					
					Task newTask = new Task();
					
					newTask.setName(taskName);
					
					newTask.setDueDate(date);
					
					newTask.setDescription(description);
					
					newTask.setComplete(false);
					
					userList.add(newTask);
					
			} else if (userInput == 3) {
				System.out.println("Are you sure you want to delete a task? y/n: ");
				userInput2 = scan.next();
				if (userInput2.equalsIgnoreCase("y")){
					System.out.println("Please enter the number of the task you would like to delete: ");
					userIndex = scan.nextInt();
					userList.remove(userIndex -1);
					System.out.println("Task deleted!");
					
				} else if (userInput2.equalsIgnoreCase("n")) {
					
				}
			} else if (userInput == 4 ) {
				System.out.println("Are you sure you want to mark a task as complete? y/n: ");
				userInput2 = scan.next();
				if (userInput2.equalsIgnoreCase("y")){
					System.out.println("Please enter the number of the task you would like to mark as complete: ");
					userIndex = scan.nextInt();
					
					//userList[userIndex-1].set(true); ?? Couldn't figure this part out
					System.out.println(userList.get(userIndex-1));
					}
										
					
				} else if (userInput == 5 ) {
					System.out.println("Are you sure you want to quit? y/n: ");
					userInput2 = scan.next();
						if (userInput2.equalsIgnoreCase("y")){
							userInput = 5;
							System.out.println("GOODBYE");//program ends
						} else if (userInput2.equalsIgnoreCase("n")) {
							userInput = 0;
						}
					
			} else {
				System.out.println("Sorry I didn't understand, let's try again."); // if above conditions aren't met
																					// (userInput == anything but 5), nothing
																					// increments and message is
																					// displayed
			}
		} while (userInput != 5); 
		scan.close();

	}

}
