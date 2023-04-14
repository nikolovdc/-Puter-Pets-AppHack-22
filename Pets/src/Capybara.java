public class Capybara extends Animal {
	
	public Capybara(String name)
	{
		super(name);
	}
	
	public void play()
	{
		super.play();
		if (super.getFlag() == true)
		{
			System.out.println("\n" + super.getName() + " chirps and chatters in excitement.");
			System.out.println("You played with " + super.getName() + "!" + "\n" + "Love +2 pts" + "\n" +
				"Hunger -2 pts" + "\n" + "Energy -3pts");
		}
	}
	
	public void pet()
	{
		super.pet();
		if (super.getFlag() == true)
		{
			System.out.println("\n" + super.getName() + " purrs happily.");
			System.out.println("You petted " + super.getName() + "!" + "\n" + "Love +3 pts" + "\n" +
				"Hunger -1 pts" + "\n" + "Energy +1pt");
		}
		
	}
	public void eat()
	{
		super.eat();
		if (super.getFlag() == true)
		{
			System.out.println(super.getName() + " knaws and chews its food");
			System.out.println(super.getName() + " has eaten!" + "\n" + "Hunger +3 pts" + "\n" + "Energy -2pts");
		}
		
	}
	
	public void sleep()
	{
		super.sleep();
		System.out.println("\nzZzzZZZzz");
		System.out.println(super.getName() + " has slept!" + "\n" + "Energy +10 pts");
	}
	
	public String picture()

    {

        String str = super.getName() + ": \n";

        str += "Type: Capybara\n";

        str += "              //__//\n";

        str += "             /    _  \\_________________\n";

        str += "            /                              \\\n";

        str += "           /                                 \\\n";

        str += "           | Y                               \\\n";

        str += "            \\_____/ |                        |\n";

        str += "                   _/  \\     / -------    -  \\\n";

        str += "                 //___/ |   |          \\  |\\  |\n";

        str += "                        // _/          //_///_/ \n";

        

        return str;

    }
	
	
	
	
}
