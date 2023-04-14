public class Bunny extends Animal {
	
	public Bunny(String name)
	{
		super(name);
	}
	
	public void play()
	{
		super.play();
		if (super.getFlag() == true)
		{
			System.out.println("\n...");
			System.out.println("You played with " + super.getName() + "!" + "\n" + "Love +2 pts" + "\n" +
				"Hunger -2 pts" + "\n" + "Energy -3pts");
		}
	}
	
	public void pet()
	{
		super.pet();
		if (super.getFlag() == true)
		{
			System.out.println("\n" + super.getName() + "'s nose sniffles happily.");
			System.out.println("You petted " + super.getName() + "!" + "\n" + "Love +3 pts" + "\n" +
				"Hunger -1 pts" + "\n" + "Energy +1pt");
		}
		
	}
	public void eat()
	{
		super.eat();
		if (super.getFlag() == true)
		{
			System.out.println("\n" + super.getName() + " nibbles and nibbles...");
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

        str += "Type: Bunny\n";

        str += "             ,\\\n";

        str += "             \\\\\\,_\n";

        str += "              \\` ,\\\n";

        str += "         __,.-\" =__)\n";

        str += "       .\"        )\n";

        str += "    ,_/   ,    \\/\\_\n";

        str += "    \\_|    )_-\\ \\_-`\n";

        str += "jgs    `-----` `--`\n";

        return str;

    }
	
	
	
	
}
