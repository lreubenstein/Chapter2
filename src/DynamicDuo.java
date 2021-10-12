public class DynamicDuo {
    private Person hero;
    private Person sidekick;

    public DynamicDuo(String hn,  String sn){
        hero = new Person(hn);
        sidekick = new Person(sn);
    }

    public void saveTheWorld(){
        hero.addKarmaPoints(1000);
        sidekick.addKarmaPoints(500);
    }

    public int getTotalKarma(){
        return hero.getKarmaPoints()+sidekick.getKarmaPoints();
    }
    public String toString(){
        String s =  hero + " " + sidekick;
        s += " They have " + getTotalKarma() + " Karma points.";
        return s;
    }
    public static void main(String[] args){
        DynamicDuo ww = new DynamicDuo("Wonder Woman", "Steve");
        ww.saveTheWorld();
        System.out.println(ww);
    }
}
