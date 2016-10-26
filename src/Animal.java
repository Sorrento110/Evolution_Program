import java.util.Random;

public class Animal {
    private String name;
	private int foodtype; //omnivore, herbivore, carnivore :: 1-3
	private double hunger; //scale of 1.0-unlimited
	private int size; //scale of 0-4 for tiny, small, medium, large, massive
	private double strength; //1.0-unlimited
	private double reproduction; //.1-2.0
	private double initiative; //1.0-5.0
	private double mutationchance; //.1-1.0
    private double evolvechance;
	private Utils u = new Utils();
	
	public Animal()
	{
		name = nameGen();
		foodtype = u.randomNumInt(1,3);
		size = u.randomNumInt(0, 4);
		if(size==0)
		{
			hunger=1.0;
			strength=1.0;
		}
		else if(size==1)
		{
			hunger=2.0;
			strength=2.0;
		}
		else if(size==2)
		{
			hunger=4.0;
			strength=3.0;
		}
		else if(size==3)
		{
			hunger=5.0;
			strength=4.0;
		}
		else if(size==4)
		{
			hunger=10.0;
			strength=10.0;
		}
		reproduction=u.randomNumD(.1, 2.0);
		initiative=u.randomNumD(1.0,5.0);
        evolvechance = u.randomNumD(.0001, .75);
	}
	public Animal(String nme, int sze, int ft)
	{
		name=nme;
		size=sze;
		foodtype=ft;
		if(size==0)
		{
			hunger=1.0;
			strength=1.0;
		}
		else if(size==1)
		{
			hunger=2.0;
			strength=2.0;
		}
		else if(size==2)
		{
			hunger=4.0;
			strength=3.0;
		}
		else if(size==3)
		{
			hunger=5.0;
			strength=4.0;
		}
		else if(size==4)
		{
			hunger=10.0;
			strength=10.0;
		}
		reproduction=u.randomNumD(.1, 2.0);
		initiative=u.randomNumD(1.0,5.0);
		mutationchance=u.randomNumD(.1,1.0);
		
	}
	public Animal(String nme, String ft, int hnger, int sze, int strngth, int reprodction, int mc)
	{
		name=nme;
		hunger=hnger;
		size=sze;
		strength=strngth;
		reproduction=reprodction;
		mutationchance=mc;
		initiative=u.randomNumD(1.0,5.0);
	}

	public void evolve()
    {
        mutationchance = u.randomNumD(.00001, .5);
        hunger += hunger*mutationchance;
        strength += strength*mutationchance;
        reproduction += reproduction*mutationchance;
        initiative += initiative*mutationchance;
        size += size*mutationchance;
    }

	public String nameGen()
	{
		String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() < u.randomNumInt(3, 15)) {
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		String saltStr = salt.toString();
		return saltStr;
	}



	public int getSize() {
		return size;
	}
    public String getName() {
        return name;
    }

    public int getFoodtype() {
        return foodtype;
    }

    public double getHunger() {
        return hunger;
    }

    public double getStrength() {
        return strength;
    }

    public double getReproduction() {
        return reproduction;
    }
    public double getEvolvechance() {
        return evolvechance;
    }

    public String toString()
    {
        return "Name: " + name + " Size: " + size + " Foodtype: " + foodtype;
    }



}
