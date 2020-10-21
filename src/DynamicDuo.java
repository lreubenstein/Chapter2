public class DynamicDuo {
    Person hero;
    Person sidekick;

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
}
