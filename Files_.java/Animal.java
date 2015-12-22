
public class Animal {
	public String name;
	public String foodtype; //omnivore, herbivore, carnivore
	public double hunger; //scale of 1.0-unlimited
	public double size; //scale of 0-4 for tiny, small, medium, large, massive
	public double strength; //1.0-unlimited
	public double reproduction; //.1-2.0
	public double initiative; //1.0-5.0
	public double mutationchance; //.1-1.0
	public double hungermc;
	public double sizemc;
	public double strengthmc;
	public double reproductionmc;
	public double initiativemc;
	
	public Animal()
	{
		
	}
	public Animal(String nme, double sze, String ft)
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
		reproduction=(Math.random()*(2-.1)+.1);
		initiative=(Math.random()*(5-1)+1);
		mutationchance=(Math.random()*(1.0-.1)+.1);
		hungermc=hunger*mutationchance;
		sizemc=size*mutationchance;
		strengthmc=strength*mutationchance;
		reproductionmc=reproduction*mutationchance;
		initiativemc=initiative*mutationchance;
		
	}
	public Animal(String nm, String ft, int hnger, int sze, int strngth, int reprodction, int mc)
	{
		name=nm;
		if(ft=="herbivore"||ft=="omnivore"||ft=="carnivore")
		{
			foodtype=ft;
		}
		else{System.out.println("Invalid Food Type on Animal: "+name);}
		hunger=hnger;
		size=sze;
		strength=strngth;
		reproduction=reprodction;
		mutationchance=mc;
		hungermc=hunger*mutationchance;
		sizemc=size*mutationchance;
		strengthmc=strength*mutationchance;
		reproductionmc=reproduction*mutationchance;
		initiative=(Math.random()*(5-1)+1);
		initiativemc=initiative*mutationchance;
	}
	void eat()
	{
		
	}

}
