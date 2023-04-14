
import java.util.Scanner;



public class Dog extends Animal

{

    public Dog(String name)

    {

        super(name);

    }



    public void play()

    {

        super.play();

        if (super.getFlag() == true)

        {

            System.out.println("\nWoof!");

            System.out.println("You played with " + super.getName() + "!" + "\n"

                + "Love +2 pts" + "\n" +

                "Hunger -2 pts" + "\n" + "Energy -3pts");

        }

    }



    public void pet()

    {

        super.pet();

        if (super.getFlag() == true)

        {

            System.out.println("\nA tail wags excitedly.");

            System.out.println("You petted " + super.getName() + "!" + "\n"

                + "Love +3 pts" + "\n" +

                "Hunger -1 pts" + "\n" + "Energy +1pt");

        }



    }



    public void eat()

    {

        System.out.println(

            "Options...\nBASIC KIBBLE ($0) +1 hunger\nPREMIUM KIBBLE ($2) +3 hunger"

                + "\nTREAT ($2) +1 hunger\nPORK CHOPS ($10) +10 hunger\nSTEAK ($10) +10 hunger");

        

        Scanner scan = new Scanner(System.in);

        String food = scan.nextLine();



        switch (food)

        {

            case "BASIC KIBBLE", "basic kibble", "Basic Kibble":

                System.out

                    .println("\nKibble spills everywhere in excitement...");

                System.out.println(super.getName() + " has eaten!" + "\n"

                    + "Hunger +1 pts" + "\n" + "Energy -2pts");

                super.setHungerLevel(super.getHungerLevel() + 1);

                super.setEnergyLevel(super.getEnergyLevel() - 2);

                break;



            case "PREMIUM KIBBLE", "premium kibble", "Premium Kibble":

                if (super.getCoins() < 2)

                {

                    System.out.println("You can't afford this :( \nBALANCE = " + super.getCoins());

                    break;

                }

                super.setCoins(super.getCoins() - 2);

                super.setEnergyLevel(super.getEnergyLevel() - 2);

                super.setHungerLevel(super.getHungerLevel() + 3);

                System.out

                    .println("\nKibble spills everywhere in excitement...");

                System.out.println(super.getName() + " has eaten!" + "\n"

                    + "Hunger +3 pts" + "\n" + "Energy -2pts");

                break;



            case "TREAT", "treat", "Treat":

                if (super.getCoins() < 2)

                {

                    System.out.println("You can't afford this :( \nBALANCE = " + super.getCoins());

                    break;

                }

                super.setCoins(super.getCoins() - 2);

                super.setHungerLevel(super.getHungerLevel() + 3);

                super.setEnergyLevel(super.getEnergyLevel() - 1);

                System.out

                    .println("\nYummy yummy snack...");

                System.out.println(super.getName() + " has eaten!" + "\n"

                    + "Hunger +1 pts" + "\n" + "Energy -1pts");

                break;



            case "PORK CHOPS", "pork chops", "Pork Chops", "Pork chops", "STEAK", "Steak", "steak":

                if (super.getCoins() < 10)

                {

                    System.out.println("You can't afford this :( \nBALANCE = " + super.getCoins());

                    break;

                }

                super.setCoins(super.getCoins() - 10);

                super.setHungerLevel(super.getHungerLevel() + 10);

                super.setEnergyLevel(super.getEnergyLevel() - 1);

                super.setLove(MAX);

                System.out

                    .println("\nAbsolutely divine. " + super.getName() + " is extremely happy now.");

                System.out.println(super.getName() + " has eaten!" + "\n"

                    + "Hunger maked out\nLove maxed out\n");

                break;

        }

    }



    public void sleep()

    {

        super.sleep();

        System.out.println("\nzZzzZZZzz");

        System.out

            .println(super.getName() + " has slept!" + "\n" + "Energy +10 pts");

    }



    public String picture()

    {

        String str = super.getName() + ": \n";

        str += "Type: Dog\n";

        str += "    ___\n";

        str += " __/_  `.  .-\"\"\"-.\n";

        str += " \\_,` | \\-'  /   )`-')\n";

        str += "  \"\") `\"`    \\  ((`\"`\n";

        str += " ___Y  ,    .'7 /|\n";

        str += "(_,___/...-` (_/_/ sk\n";

        return str;

    }

}
