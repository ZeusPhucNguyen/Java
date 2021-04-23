package sessions11;

public class TestMonster {
    public static void main(String[] args) {
        Monster m1 = new FireMonster("Ghost Rider");
        Monster m2 = new WaterMonster("Kappa");
        Monster m3 = new StoneMonster("Golem");

        System.out.println(m1.attack());

        System.out.println(m2.attack());

        System.out.println(m3.attack());

        m1 = new StoneMonster("King Golem");
        System.out.println(m1.attack());

        Monster m4 = new Monster("Satan");
        System.out.println(m4.attack());
    }
}
