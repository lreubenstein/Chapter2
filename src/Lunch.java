
public class Lunch {
	private Food sandwich;
	private Food cookie;

	public Lunch(Food s, Food c) {
		// TODO Auto-generated constructor stub
		sandwich = s;
		cookie = c;
		cookie.addChocolate();	// what would lunch be without chocolate?
	}
	public Lunch(String sand, int cal1, String cook, int cal2) {
		sandwich = new Food(sand, cal1);
		cookie = new Food(cook, cal2);
		cookie.addChocolate();
	}
	
	public int getTotalCalories() {
		int total=0;
		total = sandwich.getCalories() + cookie.getCalories();
		return total;
	}
	
	public String toString() {
		return "" + sandwich + " " +cookie;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Food pbj = new Food("peanutbutterjelly", 350);
		//Food oreo = new Food("oreo", 100);
		Lunch mylunch = new Lunch("peanutbutterjelly", 350, "oreo", 100);
		int cal = mylunch.getTotalCalories();
		System.out.println(mylunch + " Total calories = " + cal);
	}

}
