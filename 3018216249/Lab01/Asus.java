package lab01;

public class Asus  extends Motherboard{

 
	public double speed;
	public String Name="Asus Motherboard";
	public double price;

	public Asus(String Name,double volume,int price){
		this.Name=Name;
		this.speed=volume;
		this.price=price;
	}
	@Override
	public void Motherboardwork() {
		// TODO Auto-generated method stub
		System.out.print(" Asus motherboard work");
	}
}
