
public class Cities {
	private int totalmiles;
	
	public Cities() {
		totalmiles = 0;
	}
	public void london() {
		System.out.println("London Bridge is falling down.");
		totalmiles = totalmiles + 3000;
	}
	public void hongKong() {
		china();
		System.out.println("Hong Kong.");
		london();
		totalmiles = totalmiles + 8000;
	}
	public void china() {
		System.out.println("Current milage = " + totalmiles);
		System.out.println("China.");
	}
	public int getMiles() {
		return totalmiles;
	}
	public static void main(String[] args) {
		Cities c = new Cities();
		c.hongKong();
		c.london();
		c.china();
		c.hongKong();
		System.out.println("Total miles = " + c.getMiles());
	}
}
