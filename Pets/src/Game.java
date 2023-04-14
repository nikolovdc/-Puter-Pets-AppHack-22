



import java.util.Scanner;



public class Game

{

    private Animal animal;

    Scanner scan;

    private StatusBar statusBar;

    private String food = "";



    public Game()

    {

        scan = new Scanner(System.in);

        startGame();

        System.out.println("Click ENTER to continue");

        scan.nextLine();

        playGame();

        scan.close();

    }



    public void playGame()

    {

        System.out

            .println(

                "\n\n\n––––––––––––––––––––––––––––––––––––––––––––––––––––––\nHow would you like to interact with "

                    + animal.getName() + "?\n COIN BALANCE = $" + animal.getCoins());

        System.out.println("Side note: type QUIT to quit, and HELP for help");

        System.out.println(

            "\nOptions...\nPLAY\nPET\nFEED ($0 - 10)\nSLEEP\nCHECK STATUS");

        System.out

            .println("––––––––––––––––––––––––––––––––––––––––––––––––––––––");



        String choice = scan.nextLine();

        switch (choice)

        {

            case "HELP", "help", "Help":

                clear();

                System.out.print(help());

                break;



            case "QUIT", "quit", "Quit":

                System.out.println("Bye bye....");

                System.exit(0);

                scan.close();

                break;



            case "PLAY", "play", "Play":

                clear();

                animal.play();

                break;



            case "PET", "pet", "Pet":

                clear();

                animal.pet();

                break;



            case "FEED", "feed", "Feed":

                clear();

                System.out.println(

                    "What would you like to feed " + animal.getName()

                        + "?\n");

                

                animal.eat();



                break;



            case "SLEEP", "sleep", "Sleep":

                clear();

                animal.sleep();

                break;



            case "CHECK STATUS", "Check status", "Check Status", "check status":

                clear();

                statusBar = new StatusBar(animal);



                System.out.println(statusBar.checkStatus());

                System.out.print(statusBar);

                break;



            case "CLEAR", "Clear", "clear":

                clear();

                break;



            default:

                clear();

                System.out.println("\nDidn't understand, try again.\n");

        }



        playGame();

    }



    public void startGame()

    {
    	System.out.println("  _ ___      _             ___     _      \r\n"
    		    + " ( ) _ \\_  _| |_ ___ _ _  | _ \\___| |_ ___\r\n"
    		    + " |/|  _/ || |  _/ -_) '_| |  _/ -_)  _(_-<\r\n"
    		    + "   |_|  \\_,_|\\__\\___|_|   |_| \\___|\\__/__/\r\n"
    		    + "                                          ");
        System.out.println("Welcome to the Pet Shop.\nBALANCE = $20");



        System.out.println(

            "\nWhich animal would you like to adopt? Dog & Cat are $5, the rest are $10."

                + "\n\n DOG            CAT            BUNNY\n      CAPYBARA         BIRD");

        String choice = scan.nextLine();

        switch (choice)

        {

            case "DOG", "dog", "Dog":

                System.out

                    .println("\nWhat would you like to name your animal?");

                String dogName = scan.nextLine();

                Dog dog = new Dog(dogName);

                animal = (Animal) dog;

                animal.setCoins(animal.getCoins() - 5);

                break;



            case "CAT", "cat", "Cat":

                System.out

                    .println("\nWhat would you like to name your animal?");

                String catName = scan.nextLine();

                Cat cat = new Cat(catName);

                animal = (Animal) cat;

                animal.setCoins(animal.getCoins() - 5);

                break;



            case "BUNNY", "bunny", "Bunny":



                System.out



                    .println("\nWhat would you like to name your animal?");



                String bunnyName = scan.nextLine();



                Bunny bunny = new Bunny(bunnyName);



                animal = (Animal) bunny;

                animal.setCoins(animal.getCoins() - 10);

                break;



            case "CAPYBARA", "capybara", "Capybara":



                System.out



                    .println("\nWhat would you like to name your animal?");



                String capybaraName = scan.nextLine();



                Capybara capybara = new Capybara(capybaraName);



                animal = (Animal) capybara;

                animal.setCoins(animal.getCoins() - 10);

                break;



            case "BIRD", "bird", "Bird":



                System.out



                    .println("\nWhat would you like to name your animal?");



                String birdName = scan.nextLine();



                Bird bird = new Bird(birdName);



                animal = (Animal) bird;

                animal.setCoins(animal.getCoins() - 10);

                break;



            default:

                System.out.println("Not a choice, sorry. Bye.");

                System.exit(0);

        }



        System.out

            .println("\n---------------------------------------------------"

                + "\nCONGRATULATIONS, YOU HAVE A NEW FRIEND NAMED "

                + animal.getName()

                + "!\n---------------------------------------------------");



        System.out.println(animal.picture());



        System.out

            .println("\nYour animal has a status bar that you should check "

                + "frequently. \nIf you would like to know what each indicator means, "

                + "type HELP at any time.");



        statusBar = new StatusBar(animal);

        System.out.println(statusBar);

    }



    public String getFood()

    {

        return food;

    }



    public String help()

    {

        String str = "\n\n\n************************\nHELP:\n";



        str += "PLAY  =   Play with " + animal.getName()

            + " to increase happiness. +2 coins\n";

        str += "PET   =   Give " + animal.getName()

            + " love, increases the love bar.\n";

        str +=

            "SLEEP =   Let " + animal.getName() + " rest, to regain energy.\n";

        str += "EAT   =   Feed " + animal.getName()

            + " to increase the hunger bar and make them full.\n";

        str +=

            "\nCHECK STATUS returns the needs of " + animal.getName() + ".\n";

        str += "************************";

        return str;

    }



    public void clear()

    {

        System.out.println(

            "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

    }



    public static void main(String args[])

    {

        Game game = new Game();



    }

}

