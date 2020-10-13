public class Box {
    private String type;
    private int height;
    private String color;
    private int width;
    private int length;
    private int howManyPencils;

    public Box(String t, int h, int l, int w, String c){
        type = t;
        height = h;
        length = l;
        width = w;
        color = c;
        howManyPencils =0;
    }
    public Box(){  // default constructor
        type = "plain";
        height = 1;
        length = 1;
        width = 1;
        color = "white";
        howManyPencils = 0;
    }
    public void addPencils(int x){
        howManyPencils += x;
    }
    public void addPencils(){
        howManyPencils++;
    }
    public void paint(String whatColor){
        color = whatColor;
    }
    public String getColor(){
        return color;
    }
    public int volume(){
        return length*width*height;
    }

    public String toString(){
        String s = "A box that is " + color + " size " + length +" "+width + " " +height;
        s += " that has " + howManyPencils + " pencils.";
        return s;
    }


    public static void main(String[] args){
        Box b1 = new Box();
        Box b2 = new Box("shoe", 8,6,3,"purple");
        System.out.println(b1.getColor()+ " " +b1.volume());
        System.out.println(b2.getColor()+ " " + b2.volume());

        System.out.println(b2);
    }
}
