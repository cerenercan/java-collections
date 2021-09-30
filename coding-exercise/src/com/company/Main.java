package com.company;

import com.company.oop.encapsulation.challenge.Printer;
import com.company.oop.masterchallenge.DeluxeBurger;
import com.company.oop.masterchallenge.Hamburger;
import com.company.oop.masterchallenge.HealthyBurger;
import com.company.oop.polymorphism.challenge.Car;
import com.company.oop.polymorphism.challenge.Ford;
import com.company.oop.polymorphism.examples.*;

public class Main {

    public static void main(String[] args) {

//        EXERCISE OUTPUTS

//        SpeedConverter.printConversion(120);
//        System.out.println(SpeedConverter.toMilesPerHour(120));
//
//
//        System.out.println(MethodOverloading.calcFeetAndInchesToCentimeters(6, 0));
//        System.out.println(MethodOverloading.calcFeetAndInchesToCentimeters(100));
//
//
//        System.out.println(SecondsToMinutes.getDurationString(65, 45));
//        System.out.println(SecondsToMinutes.getDurationString(3945));

//        FLOW STATEMENTS OUTPUTS
//        SWITCH STATEMENT

//        SwitchStatement.testingSwitch(4);
//        SwitchStatement.switchChallenge('F');
//        SwitchStatement.switchChallenge("january");
//
//
//        DayOfTheWeekChallenge.DayOfTheWeek(1);

//        FOR STATEMENT

//        ForStatement.CalculateInterest(10000,2);
//        SumThreeAndFiveChallenge.SumChallenge();

//        System.out.println(SumOddChallenge.isOdd(2));
//
//        System.out.println(SumOddChallenge.sumOdd(13, -13));


//        WHILE AND DO-WHILE STATEMENTS
//
//        System.out.println(WhileChallenge.sumDigits(33));
//        System.out.println(NumberPalindrome.isPalindrome(525));
//        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(257));
//        System.out.println(EvenDigitSum.getEvenDigitSum(252));
//        System.out.println(SharedDigit.hasSharedDigit(12, 23));
//        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(81,153));
//        FactorPrinter.printFactors(-1);
//        System.out.println(PerfectNumber.isPerfectNumber(5));


//        PARSING EXAMPLES
//        System.out.println(FlourPacker.canPack(2,2,11));
//        System.out.println(LargestPrime.getLargestPrime(21));

//        USER INPUT EXAMPLES
//        TrialUserInput.UserInputReading();
//        UserInputChallenge.ReadingUserInput();
//        MinAndMaxNumber.FindMinAndMax();
//        InputCalculator.inputThenPrintSumAndAverage();


//        OBJECT ORIENTED PROGRAMMING: CLASSES

//        Car porsche = new Car();
//        Car kia = new Car(4, 4, "ceed", "1.6", "white");
//
//        porsche.setModel("911 Turbo");
//        porsche.setColor("Red");
//        porsche.setDoors(2);
//        porsche.setEngine("2.0");
//        porsche.setWheels(4);
//        System.out.println("Model of the car is: " +porsche.getModel());
//        System.out.println("Color of the car is: " +porsche.getColor());
//        System.out.println("# of the doors of the car is: " +porsche.getDoors());
//
//        System.out.println(kia.getModel());

//        SIMPLE CALCULATOR
//        SimpleCalculator simpleCalculator = new SimpleCalculator();
//        simpleCalculator.setFirstNumber(5.0);
//        simpleCalculator.setSecondNumber(4);
//        System.out.println("Addition: " + simpleCalculator.getAdditionResult());
//        System.out.println("Subtraction: " + simpleCalculator.getSubtractionResult());
//
//        simpleCalculator.setFirstNumber(5.25);
//        simpleCalculator.setSecondNumber(0);
//        System.out.println("Multiplication: " + simpleCalculator.getMultiplicationResult());
//        System.out.println("Division: " + simpleCalculator.getDivisionResult());


//        BANK ACCOUNTING

//        BankAccounting bankAccounting = new BankAccounting();
//        bankAccounting.withdrawFunds(100);
//        bankAccounting.depositFunds(500);
//        bankAccounting.withdrawFunds(100);

//        INHERITANCE EXAMPLES

//        Animal kali = new Dog(1, 1,15,25,"Kali");
//        Dog toffee = new Dog(15, 30, "Toffee", 2, 4, 1, 32, "smooth");
//        kali.move(5);
//        kali.eat();
//        System.out.println(kali.getName());
//
//        toffee.move(5);

//        Kia kia = new Kia(26);
//        kia.accelerate(30);

//        Circle circle = new Circle(3.75);
//        System.out.println("circle.radius: " +circle.getRadius());
//        System.out.println("circle.area: " +circle.getArea());
//
//        Cylinder cylinder = new Cylinder(5.55, 7.25);
//        System.out.println("cylinder.radius: " +cylinder.getRadius());
//        System.out.println("cylinder.height: " +cylinder.getHeight());
//        System.out.println("cylinder.area: " +cylinder.getArea());
//        System.out.println("cylinder.volume: " +cylinder.getVolume());

//        COMPOSITION EXAMPLES
//
//        Dimensions dimensions = new Dimensions(
//                20,
//                20,
//                5);
//
//        Case theCase = new Case(
//                "220B",
//                "Dell",
//                "240",
//                dimensions);
//
//        Monitor monitor = new Monitor(
//                "27inch Beast",
//                "Acer",
//                27,
//                new Resolution(
//                        2540,
//                        1440));
//
//        Motherboard motherboard = new Motherboard(
//                "BJ-200",
//                "Asus",
//                4,
//                6,
//                "v2.44");
//
//        PC pc = new PC(theCase, monitor, motherboard);
//
//        pc.getMonitor().drawPixelAt(1500, 1200, "red");

//        COMPOSITION CHALLENGE
//
//        Wall wall1 = new Wall("West");
//        Wall wall2 = new Wall("East");
//        Wall wall3 = new Wall("South");
//        Wall wall4 = new Wall("North");
//
//        Ceiling ceiling = new Ceiling(12, "Red");
//
//        Bed bed = new Bed("Modern", 4, 3, 2, 1);
//
//        Lamp lamp = new Lamp("Classic", false, 75);
//
//        Bedroom bedroom = new Bedroom("Ceren", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
//
//        bedroom.makeBed();
//        bedroom.getLamp().turnOn();


//        Encapsulation - Player Example (Example of not using encapsulation)
//
//        Player player = new Player();
//        player.fullName = "Ceren Ercan";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health of the player: " +player.healthRemaining());
//
//        player.loseHealth(11);
//        System.out.println("Remaining health of the player: " +player.healthRemaining());

//        Encapsulation - Enhanced Player Example

//        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Ceren", 50, "Sword");
//        System.out.println("Initial health is: " +enhancedPlayer.getHealth());

//        Encapsulation Example

//        Printer printer = new Printer(50, true);
//        System.out.println("Initial page count: " +printer.getNumberOfPages());
//
//        int pagesPrinted = printer.printPages(23);
//        System.out.println("Pages printed was: " +pagesPrinted);
//        System.out.println("New total print count for printer: " +printer.getNumberOfPages());
//
//        System.out.println(printer.addToner(100));

//        Polymorphism - Example

//        for (int i = 1 ; i < 11 ; i++){
//            Movie movie = randomMovie();
//            System.out.println(
//                    "Movie #" + i + ": " + movie.getName() + "\n" +
//                    "Plot: " + movie.plot() + "\n"
//                    );
//        }


//        Polymorphism - Challenge

//        Car car = new Ford("Ford", 8);
//        System.out.println(car.startEngine());
//        System.out.println(car.accelerate());
//        System.out.println(car.brake());
//
//        Ford ford = new Ford("Focus", 6);

//        MASTER OOP CHALLENGE

//
//        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
//        hamburger.addHamburgerAddition1("Tomato", 0.27);
//        hamburger.addHamburgerAddition2("Lettuce", 0.75);
//        hamburger.addHamburgerAddition3("Cheese", 1.12);
//        System.out.println("Total hamburger price is: " + hamburger.itemizeHamburger());
//
//
//        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
//        healthyBurger.addHealthyAddition1("Egg", 5.43);
//        healthyBurger.addHealthyAddition2("Lentils", 3.41);
//        System.out.println("Total hamburger price is: " + healthyBurger.itemizeHamburger());
//
//
//        DeluxeBurger deluxeBurger = new DeluxeBurger();
//        deluxeBurger.itemizeHamburger();

//        ARRAYS




    }

//    Polymorphism - Example
//
//    public static Movie randomMovie(){
//
//        int randomNumber = (int) (Math.random() * 5) + 1;
//        System.out.println("Random number generated is: " + randomNumber);
//        switch (randomNumber){
//            case 1:
//                return new Jaws();
//            case 2:
//                return new IndependenceDay();
//            case 3:
//                return new MazeRunner();
//            case 4:
//                return new StarWars();
//            case 5:
//                return new Forgetable();
//        }
//        return null;
//    }
}
