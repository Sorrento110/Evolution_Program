
public class Environment {
	public double plants;
	public double meat;
	public double space;
	public double regrowth;
	
	public Environment()
	{
		
	}
	public Environment(double fd, double spc, double rgth)
	{
		plants=fd;
		space=spc;
		regrowth=rgth;
	}
	void regrow()
	{
		plants+=(plants*regrowth)+(plants*.1);
	}

}
