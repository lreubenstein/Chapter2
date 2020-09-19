public class Dinner {
    private Food mainCourse;
    private Food veggie;
    private Food salad;

    public Dinner(String main, int cal1, String veg, int cal2){
        mainCourse = new Food(main, cal1);
        veggie = new Food(veg, cal2);
        salad = null;
    }

    public void addSalad(String name, int cal){
        salad = new Food(name, cal);
        salad.addHealthy();
    }

    public String toString(){
        String s = mainCourse + " " + veggie + " " + salad;
        return s;
    }

    public static void main(String [] args){
        Dinner d = new Dinner("meatloaf", 350, "peas", 80);
        d.addSalad("Caesar", 250);
        System.out.println(d);
    }



}
