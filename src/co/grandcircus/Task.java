package co.grandcircus;

public class Task {
//Must include the following
	// Team member's name
	// Brief description
	// Whether it's completed or not (set to incomplete by default)
//
	private String name;
	private String description;
	private String dueDate;
	private Boolean complete;

	public Task(String name, String description, String dueDate, Boolean complete) {
		super();
		this.name = name;
		this.description = description;
		this.dueDate = dueDate;
		this.complete = complete;
	}

	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getComplete() {
		return complete;
	}

	public void setComplete(Boolean complete) {
		this.complete = complete;
	}

	@Override
	public String toString() {
		return "Complete = " + complete + "\t" + "Due date = " + dueDate + "\t" + "Task name = " + name + "\t" + "Description = " + description;
	}

}
