public class Family {
    private Person adult1;
    private Person adult2;
    private Person child;

    public Family(Person p1, Person p2){
        adult1 = p1;
        adult2 = p2;
        child = null;
    }
    public Family(String name1, int age1, String name2, int age2){
        adult1 = new Person(name1, age1);
        adult2 = new Person(name2, age2);
    }

    public void addChild(String name, int age){
        child = new Person(name, age);
    }
}
