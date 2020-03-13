package lab01;

public class Intel extends CPU{


	public Intel(String Name,String coreNum,double price){
		this.Name=Name;
		this.coreNum=coreNum;
		this.price=price;
	}
	@Override
	public void cpuwork() {
		// TODO Auto-generated method stub
		System.out.print("Intelcpu work");
		
	}
}
