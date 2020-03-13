package lab01;

public class Samsung extends Memory{

	@Override
	public void memorywork() {
		// TODO Auto-generated method stub
		System.out.print(" Samsung memory work");
	}
	

	public  Samsung(String Name,double volume,int price){
		this.Name=Name;
		this.volume=volume;
		this.price=price;
	}
}
