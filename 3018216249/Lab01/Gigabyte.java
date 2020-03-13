package lab01;

public class Gigabyte extends Motherboard{

 
	

	public Gigabyte(String Name,double volume,int price){
		this.Name=Name;
		this.speed=volume;
		this.price=price;
	}
	@Override
	public void Motherboardwork() {
		// TODO Auto-generated method stub
		System.out.print(" Gigabyte motherboard work");
	}
}
