interface Mom {
	public void printMom();
}

interface Dad {
	public void printDad();
}


class Child implements Mom, Dad {
	@Override public void printMom()
	{
		System.out.println("Printing Mom");
	}

	public void printDad() 
	{ 
		System.out.println("Printing Dad");
	}
}


public class MultipleApp {
	public static void main(String[] args)
	{
		Child c = new Child();
		c.printMom();
		c.printDad();
	}
}
