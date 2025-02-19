public class Main {
    public static void main(String[] args) {
        Penguin penguin = new Penguin();
        Ostrich ostrich = new Ostrich();
        Sparrow sparrow = new Sparrow();
        Eagle   eagle   = new Eagle();
        penguin.walk();
        penguin.swim();
        ostrich.walk();
        ostrich.run();
        sparrow.walk();
        sparrow.fly();
        eagle.walk();
        eagle.fly();
    }
}
