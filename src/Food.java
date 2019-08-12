
public class Food {
	private String name;
	private int	calories;
	private boolean hasChocolate;

	public Food(String n, int cal) {
		// TODO Auto-generated constructor stub
		name = n;
		calories = cal;
		hasChocolate = false;
	}
	
	public int getCalories() {
		return calories;
	}
	public void addChocolate() {
		calories = calories + 200;
		hasChocolate = true;
	}
	public String toString() {
		String s;
		s= name + " " + calories + " calories.";
		return s;
	}

}
