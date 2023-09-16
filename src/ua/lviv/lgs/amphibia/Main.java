package ua.lviv.lgs.amphibia;

public class Main {
    public static void main(String[] args) {
        Frog frog = new Frog();
        Amphibia frog2 = new Frog();

        Activity eat = () -> System.out.println("I'm eating");
        Activity sleep = () -> System.out.println("I'm sleeping");
        Activity swim = () -> System.out.println("I'm swimming");
        Activity walk = () -> System.out.println("I'm walking");

        frog.doActivity(eat);
        frog.doActivity(sleep);
        frog.doActivity(swim);
        frog.doActivity(walk);

        System.out.println();

        frog2.doActivity(eat);
        frog2.doActivity(sleep);
        frog2.doActivity(swim);
        frog2.doActivity(walk);
    }
}