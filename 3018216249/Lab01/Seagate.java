package lab01;

public class Seagate extends Harddrive{

	@Override
	public void hardDrivework() {
		// TODO Auto-generated method stub
		System.out.print(" Seagate harddrive work");
	}
	

	public  Seagate(String Name,double volume,int price){
		this.Name=Name;
		this.volume=volume;
		this.price=price;
	}
}
