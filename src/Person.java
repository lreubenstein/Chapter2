public class Person {
    private String name;
    private boolean isEvil;
    private int karmaPoints;


    public Person(String n){
        name = n;
        karmaPoints = 500;
        isEvil=false;

    }

    public void addKarmaPoints(int kp){
        karmaPoints += kp;
    }

    public int getKarmaPoints(){
        return karmaPoints;
    }

    public String getName(){
        return name;
    }
    public void setEvil(boolean e){
        isEvil = e;
        karmaPoints-=100;
    }
    public boolean getEvil(){
        return isEvil;
    }

    public String toString(){
        String s = name + " has " + karmaPoints;
        if(isEvil) s += " and is evil";
        return s;
    }

}

