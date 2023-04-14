
public class Cat extends Animal {
	
	public Cat(String name)
	{
		super(name);
	}
	
	public void play()
	{
		super.play();
		if (super.getFlag() == true)
		{
			System.out.println("\nMeow!");
			System.out.println("You played with " + super.getName() + "!" + "\n" + "Love +2 pts" + "\n" +
				"Hunger -2 pts" + "\n" + "Energy -3pts");
		}
	}
	
	public void pet()
	{
		super.pet();
		if (super.getFlag() == true)
		{
			System.out.println("\nPurr...");
			System.out.println("You petted " + super.getName() + "!" + "\n" + "Love +3 pts" + "\n" +
				"Hunger -1 pts" + "\n" + "Energy +1pt");
		}
		
	}
	public void eat()
	{
		super.eat();
		if (super.getFlag() == true)
		{
			System.out.println("\nPurr...");
			System.out.println(super.getName() + " has eaten!" + "\n" + "Hunger +3 pts" + "\n" + "Energy -2pts");
		}
		
	}
	
	public void sleep()
	{
		super.sleep();
		System.out.println("\nzZZZzzZzZ...");
		System.out.println(super.getName() + " has slept!" + "\n" + "Energy +10 pts");
	}
	
	public String picture()

    {

        String str = super.getName() + ": \n";

        str += "Type: Cat\n";

        str += "   |\\---/|\n";

        str += "   | ,_, |\n";

        str += "    \\_`_/-..----.\n";

        str += "   _/ `   ' ,\"\"+ \\  sk\n";

        str += "(__...'   __\\    |`.___.';\n";

        str += "  (_,...'(_,.`__)/'.....+\n";

        return str;

    }
	
	
	
}
