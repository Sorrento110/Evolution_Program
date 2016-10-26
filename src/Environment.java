import java.util.Vector;

public class Environment {

	private double plants;
	private double meat;
	private double space;
	private double regrowth;
	private Utils utilitygen = new Utils();
	
	public Environment(Vector<Vector<Animal>> creatures)
	{
		plants = utilitygen.randomNumD(100, 1000);
		space = utilitygen.randomNumD(100,1000);
		for(Vector<Animal> aniVec : creatures)
		{
			for(Animal live : aniVec)
			{
				switch(live.getSize())
				{
					case 0 :
						meat+= 1;
						break;
					case 1 :
						meat += 2;
						break;
					case 2 :
						meat += 3;
						break;
					case 3 :
						meat += 4;
						break;
					case 4 :
						meat += 5;
						break;
					default :
						meat+= 1;
				}
			}
		}
	}
	/* DEPRECATED FOR NOW
	public Environment(double fd, double spc, double rgth)
	{
		plants=fd;
		space=spc;
	}*/
	void regrow()
	{
		regrowth = utilitygen.randomNumD(0, 0.5);
		plants+=(plants*regrowth)+(plants*.1);
	}


	public double getPlants() {
		return plants;
	}

	public double getMeat() {
		return meat;
	}

	public double getSpace() {
		return space;
	}

}
