
public class Thermos {
	String brand ;
	double liquid;
	String liq_name;
	double liq;
	double liq2;
	
	Thermos(String brand,double liquid,String liq_name,double liq,double liq2)
	{
		this.brand=brand;
		this.liquid=liquid;
		this.liq_name=liq_name;
		this.liq=liq;
		this.liq2=liq2;
	}
	
	double addLiquid()
	{
		liquid=liquid+liq; 
		return liquid;
	}
	double PourLiq()
	{
		liquid = liquid-liq2;
		return liquid;
	}
	void display()
	{
		System.out.println("Brand: "+brand);
		System.out.println("Liquid name:"+liq_name);
		System.out.println("Liquid: "+liq+" litrs");
		System.out.println("After poured : "+liq2+" litrs");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thermos u1=new Thermos("Godrez",0, "Orange Juice",0.5,0.25);
		u1.addLiquid();
		u1.PourLiq();
		u1.display();
		

	}

}
