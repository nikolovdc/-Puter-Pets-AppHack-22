public class Bird extends Animal {
	
	public Bird(String name)
	{
		super(name);
	}
	
	public void play()
	{
		super.play();
		if (super.getFlag() == true)
		{
			System.out.println("\n" + "Chirp! Chirp!");
			System.out.println("You played with " + super.getName() + "!" + "\n" + "Love +2 pts" + "\n" +
				"Hunger -2 pts" + "\n" + "Energy -3pts");
		}
	}
	
	public void pet()
	{
		super.pet();
		if (super.getFlag() == true)
		{
			System.out.println("\n" + super.getName() + " chirps a sweet song for you.");
			System.out.println("You petted " + super.getName() + "!" + "\n" + "Love +3 pts" + "\n" +
				"Hunger -1 pts" + "\n" + "Energy +1pt");
		}
	}
	public void eat()
	{
		super.eat();
		if (super.getFlag() == true)
		{
			System.out.println("\n" + super.getName() + " pecks at the treat.");
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

        str += "Type: Bird\n";

        str += "   .-.\n";

        str += "  /'v'\\\n";

        str += " (/   \\)\n";

        str += "='=\"=\"===< \n";

        str += "mrf|_|\n";

        return str;

    }
	
	
}
