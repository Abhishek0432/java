class Tv
{
	double Tv_cost;
	String tv_brand;
	String tv_type;

	Tv(double a,String b,String c )
	{
		Tv_cost=a;
		tv_brand=b;
		tv_type=c;
	}
	public static void main(String[] args) 
	{
		Tv t = new Tv(2300.0,"sony","led");
		System.out.println(t.Tv_cost);
		System.out.println(t.tv_brand);
		System.out.println(t.tv_type);
	}
}