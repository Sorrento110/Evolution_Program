import java.util.*;

public class Main {

    private Vector<Animal> sortedFauna = new Vector<Animal>();

	public static void main(String[] args)
	{
        Utils utilityFac = new Utils();
		Vector<Vector<Animal>> fauna = new Vector<Vector<Animal>>();
        for(int i = 0; i < utilityFac.randomNumInt(3, 10); i++)
        {
            Vector<Animal> species = new Vector<Animal>();
            Animal newAn = new Animal();
            for(int j = 0; j < utilityFac.randomNumInt(10, 500); j++)
            {
                newAn.initiativeGen();
                species.add(newAn);
            }
            fauna.add(species);
        }

        for( Vector<Animal> Vecc : fauna)
        {
            int number = 0;
            for(int i = 0; i < Vecc.size(); i++)
            {
                if(i < 1)
                {
                    System.out.println(Vecc.elementAt(0).toString());
                    number++;
                }
                else
                {
                    number++;
                }
            }
            System.out.println(number);
        }

        Environment world = new Environment(fauna);

	}

	public void sortAnimals(Vector<Vector<Animal>> A)
    {
        for(Vector<Animal> aniVec : A)
        {
            for (Animal live : aniVec)
            {
                sortedFauna.addElement(live);
            }
        }
    }

    public void eatCycle(Environment E, Vector<Vector<Animal>> A)
    {

    }














































	//Interactive main method. Currently Deprecated.
	/*public static void main(String[] args)
	{
		int asize=0;
		Animal[][] fauna=new Animal[10][100];
		Environment world=new Environment(100, 100, 0);
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to Evolution, an evolution simulator. We will start by making some species of fauna");
		System.out.println("Please provide your Animals a name, size(tiny(0), small(1), medium(2), large(3), massive(4)), and type (omnivore, herbivor, carnivore) when prompted.");
		System.out.println("When you are done entering species (maximum of 10), please input 'exit' as the next Animal Name");
		while(asize<10)
		{
			System.out.println("Name (String): ");
			String name=scan.next();
			if(name.equals("exit"))
			{
				break;
			}
			System.out.println("Size (Double): ");
			double size=scan.nextDouble();
			System.out.println("Food Type (String): ");
			String ft=scan.next();
			System.out.println("Number of these Animals in World (max 10): ");
			int numbb=scan.nextInt();
			for(int i=0; i<numbb; i++)
			{
				fauna[asize][i]=new Animal(name, size, ft);
			}
			asize++;
		}
		System.out.println("We will now run an evolutionary scenario with the "+asize+" species you created.");
		System.out.println("How much time should we run the scenario for?");
		for(int i=0; i< asize; i++)
		{
			for(int j=0; j<fauna[i].length; j++)
			{
				System.out.println("Name: "+fauna[i][j].name+" Foodtype: "+fauna[i][j].foodtype+" Size: "+fauna[i][j].size+" Strength: "+fauna[i][j].strength+"Initiative: "+fauna[i][j].initiative+" Reproduction: "+fauna[i][j].reproduction+" Sizemc: "+fauna[i][j].sizemc+" Strengthmc: "+fauna[i][j].strengthmc+"Initiativemc: "+fauna[i][j].initiativemc+" Reproductionmc: "+fauna[i][j].reproductionmc);
			}
		}
	}
	void reproduce(Animal one, Animal two)
	{
		
	}*/
}