public class EvilCabal {
    private Person evilGenius;
    private Person redeemableAssistant;
    private Person disgruntledScientist;

    public EvilCabal(String eg, String ra){
        evilGenius = new Person(eg);
        evilGenius.setEvil(true);
        redeemableAssistant = new Person(ra);
        redeemableAssistant.setEvil(true);
        disgruntledScientist = null;
    }
    public void plotEarthDestruction(){
        evilGenius.addKarmaPoints(-1000);
        redeemableAssistant.addKarmaPoints(200);
        redeemableAssistant.setEvil(false);
    }

    public void addDistgruntledScientist(String name){
        disgruntledScientist = new Person(name);
        disgruntledScientist.setEvil(true);
    }
    public String toString(){
        String s = evilGenius + " " + redeemableAssistant;

        int karma = evilGenius.getKarmaPoints()+redeemableAssistant.getKarmaPoints();
        if(disgruntledScientist!= null){
            s += "\n" + disgruntledScientist;
            karma += disgruntledScientist.getKarmaPoints();
        }
        s += "\nTotal karma points " + karma;
        return s;
    }

    public static void main(String[] args){
        EvilCabal ec = new EvilCabal("Dr. Evil", "Mini-me");
        ec.plotEarthDestruction();
        ec.addDistgruntledScientist("Number 2");
        System.out.println(ec);
    }
}
