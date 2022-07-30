package orge.example;

public class Robots {

    private int robotNumber;
    private int robotPower;
    private String robotType;
    private double robotSalary;

    public Robots(int robotNumber, int robotPower, String robotType, double robotSalary) {
        if (robotNumber > 0) {
            this.robotNumber = robotNumber;
        } else {
            System.out.println("Номер робота не может быть отрицательным");
        }

        if (robotPower > 0) {
            this.robotPower = robotPower;
        } else {
            System.out.println("Заряд энергии робота не может быть отрицательным");
        }

        if (robotType.equals("") || robotType.equals(" ")) {
            System.out.println("Название робота не может быть пустым");
        } else {
            this.robotType = robotType;
        }

        if (robotSalary > 0) {
            this.robotSalary = robotSalary;
        } else {
            System.out.println("Робот не может работать бесплатно");
        }
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
              System.out.println("Уровень заряда: " + robotPower);
                }

    void robotCleans () {
        System.out.println("Хотите, чтобы я тут прибрался? Убираюсь!");
        robotPower = robotPower - 10;
    }

}






