

public abstract class Animal

{

    private String name;

    private int hungerLevel;

    private int energyLevel;

    private int love;

    final int MAX = 10;

    private boolean flag;

    private int coins;



    public Animal(String name)

    {

        this.name = name;

        hungerLevel = 10;

        energyLevel = 10;

        love = 5;

        coins = 20;

    }



    public String getName()

    {

        return name;

    }

    

    public int getCoins()

    {

        return coins;

    }

    

    public void setCoins(int newCoin)

    {

        coins = newCoin;

    }



    public int getHungerLevel()

    {

        return hungerLevel;

    }



    public int getEnergyLevel()

    {

        return energyLevel;

    }



    public int getLove()

    {

        return love;

    }



    public void setName(String userName)

    {

        name = userName;

    }



    public void setHungerLevel(int hung)

    {

        hungerLevel = hung;

        hungerLevel = makeSure(hungerLevel);

    }



    public void setEnergyLevel(int eng)

    {

        energyLevel = eng;

        energyLevel = makeSure(energyLevel);

    }



    public void setLove(int lov)

    {

        love = lov;

        love = makeSure(love);

    }

    

    public boolean getFlag()

    {

        return flag;

    }



    public void play()

    {

        if (hungerLevel == 0)

        {

            System.out.println(

                "\n" + getName() + " CAN'T PLAY RIGHT NOW... TOO HUNGRY");

            flag = false;

        }

        else if (energyLevel == 0)

        {

            System.out.println(

                "\n" + getName() + " CAN'T PLAY RIGHT NOW... TOO SLEEPY");

            flag = false;

        }

        else

        {

            energyLevel -= 3;

            hungerLevel -= 1;

            love += 2;

            energyLevel = makeSure(energyLevel);

            hungerLevel = makeSure(hungerLevel);

            love = makeSure(love);

            flag = true;
            
            coins += 2;

        }

    }



    public void pet()

    {

        if (hungerLevel == 0)

        {

            System.out.println("\n" + getName() + " IS TOO HUNGRY...");

            flag = false;

        }

        else

        {

            energyLevel += 1;

            hungerLevel -= 1;

            love += 3;

            energyLevel = makeSure(energyLevel);

            hungerLevel = makeSure(hungerLevel);

            love = makeSure(love);

            flag = true;

        }

    }



    public void rename(String newName)

    {

        setName(newName);

        System.out.println("\nNew name = " + getName());

    }



    public void eat()

    {

        if (energyLevel == 0)

        {

            System.out.println("\n" + getName() + " IS TOO TIRED TO EAT...");

            flag = false;

        }

        else

        {

            hungerLevel += 3;

            energyLevel -= 2;

            hungerLevel = makeSure(hungerLevel);

            energyLevel = makeSure(energyLevel);

            flag = true;

        }



    }



    public void sleep()

    {

        energyLevel += 10;

        energyLevel = makeSure(energyLevel);
        hungerLevel -= 5;
        hungerLevel = makeSure(hungerLevel);

    }



    public int makeSure(int n)

    {

        int s = n;

        if (s < 0)

        {

            s = 0;

        }

        if (s > 10)

        {

            s = 10;

        }

        return s;

    }



    public String picture()

    {

        String str = getName() + ": ";

        str += "Type: Unknown\n";

        str += "??????????\n??????????\n??????????\n??????????";



        return str;

    }



}



