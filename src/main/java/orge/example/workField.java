package orge.example;

public class workField {

    public static void main(String[] args) {

        Robots worker = new Robots(10001, 40, "cleaner", 40.00);
        Robots warrior = new Robots(500, 55, "defender", 60.00);
        Robots leader = new Robots(1, 90, "manager", 90);

        worker.introduceYourself();
        worker.howAreYou();

        warrior.introduceYourself();
        warrior.howAreYou();

        leader.introduceYourself();
        leader.howAreYou();

    }
}
