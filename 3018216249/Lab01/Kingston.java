package lab01;

public class Kingston extends Memory{

	@Override
	public void memorywork() {
		// TODO Auto-generated method stub
		System.out.print(" Kingston memory work");
	}
	

	public  Kingston(String Name,double volume,int price){
		this.Name=Name;
		this.volume=volume;
		this.price=price;
	}
}
