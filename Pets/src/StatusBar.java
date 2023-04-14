




public class StatusBar

{

    private int hunger;

    private int energy;

    private int love;

    private Animal animal;

    

    public StatusBar(Animal animal)

    {

        hunger = animal.getHungerLevel();

        energy = animal.getEnergyLevel();

        love = animal.getLove();

        this.animal = animal;

    }

    

    public String hungerBar()

    {

        String str = "";

        str += "Hunger: ";

        for (int i = 0; i < hunger; i++)

        {

            str+= "|";

            if (i == 9)

            {

                str += "   FULL";

            }

        }

        return str;

    }

    

    public String energyBar()

    {

        String str = "";

        str += "Energy: ";

        for (int i = 0; i < energy; i++)

        {

            str+= "|";

            if (i == 9)

            {

                str += "   FULL";

            }

        }

        return str;

    }

    

    public String loveBar()

    {

        String str = "";

        str += "Love:   ";

        for (int i = 0; i < love; i++)

        {

            str+= "|";

            if (i == 9)

            {

                str += "   FULL";

            }

        }

        return str;

    }

    

    public String toString()

    {

        String str = "\n\n-----------------------------------------------";

        str += "\nSTATUS OF " + animal.getName() + "....\n\n";

        str += "\n" + hungerBar() + "\n" + energyBar() + "\n" + loveBar();

        str += "\n-----------------------------------------------";

        return str;

    }

    

    public String checkStatus()

    {

        String str = "\n\nSTATUS:\n";

        if (energy < 2)

        {

            str += "Animal is tired! ";

        }

        if (hunger < 3)

        {

            str += "Animal is hungry! ";

        }

        if (love < 2)

        {

            str += "Animal needs attention! ";

        }

        

        if (str.equals("\n\nSTATUS:\n"))

        {

            str += animal.getName() + " is happy.";

        }

        

        str += "\n\n" + animal.picture();

        

        return str;

    }

}