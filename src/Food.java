
public class Food {
	private String name;
	private int	calories;
	private boolean hasChocolate;
	private boolean isHealthy;

	public Food(String n, int cal) {
		// TODO Auto-generated constructor stub
		name = n;
		calories = cal;
		hasChocolate = false;
		isHealthy = false;
	}
	
	public int getCalories() {
		return calories;
	}
	public void addChocolate() {
		calories = calories + 200;
		hasChocolate = true;
	}

	public void addHealthy(){
		isHealthy = true;
	}
	public String toString() {
		String s;
		s= name + " " + calories + " calories.";
		return s;
	}

}
