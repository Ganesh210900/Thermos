
public class Thermos {
	String brand ;
	double liquid;
	String liq_name;
	
	Thermos(String brand,double liquid,String liq_name)
	{
		this.brand=brand;
		this.liquid=liquid;
		this.liq_name=liq_name;
	}
	
	void addLiquid(double liq)
	{
		liquid=liquid+liq; 
	}
	
	void display()
	{
		System.out.println("Brand: "+brand);
		System.out.println("Liquid name:"+liq_name);
		System.out.println("Liquid: "+liquid+" litrs");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thermos u1=new Thermos("Godrez",0, "Orange Juice");
		u1.addLiquid(0.5);
		u1.display();

	}

}
