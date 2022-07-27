package orge.example;

public class Robots {

    int robotNumber;
    int robotPower;
    String robotType;
    double robotSalary;

    public Robots(int robotNumber, int robotPower, String robotType, double robotSalary) {
        this.robotNumber = robotNumber;
        this.robotPower = robotPower;
        this.robotType = robotType;
        this.robotSalary = robotSalary;
    }

    void introduceYourself() {
        System.out.println("My number is " + robotNumber + ". I am " + robotType);
    }

    void howAreYou() {
        if (robotPower > 70 && robotSalary > 70.00) {
            System.out.println("How am I? Feel good :) ");
        } else if ((robotPower > 50 && robotPower < 70.00) && (robotSalary > 50.00 && robotSalary < 70.00)) {
            System.out.println("How am I? It's OK ._.");
        } else {
            System.out.println("How am I? Oh....(((");
        }
    }

                void solarCharge() {
                    robotPower = 100;
                    System.out.println("Я полностью зарядился!");
                    System.out.println("Урвоень заряда: " + robotPower);
                }
}






