class Animal
{
	void noise()
	{
		System.out.println("some noise");
	}
}

class Dog extends Animal
{
	void noise()
	{
		System.out.println("bow bow");
	}
}

class Cat extends Animal
{
	void noise()
	{
		System.out.println("meo meo");
	}
}

class Snake extends Animal
{
	void noise()
	{
		System.out.println("hiss thuss");
	}
}
class Stimulator
{
	static void ansim(Animal a1)
	{
		a1.noise();
	}
}
class Mainclass5
{
	public static void main(String[] args) 
	{
		Dog d1 = new Dog();
		Cat c1 = new Cat();
		Snake s1 = new Snake();

		Stimulator.ansim(d1);
		Stimulator.ansim(c1);
		Stimulator.ansim(s1);
		
	}
}
