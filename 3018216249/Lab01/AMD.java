package lab01;

public class AMD extends CPU{

	public AMD(String Name,String coreNum,double price){
		this.Name=Name;
		this.coreNum=coreNum;
		this.price=price;
	}
	@Override
	public void cpuwork() {
		// TODO Auto-generated method stub
		System.out.print("AMDcpu work");
		
	}
}
