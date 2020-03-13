package lab01;

public class result {


	public static void main(String[] args) {
		CPU cpu1 = new AMD("AMD","9nm",200);
		CPU cpu2=new Intel("Intel","12nm",500);
		Memory memory1=new Samsung("Samsung",200,300);
		Memory memory2=new Kingston("Samsung",250,400);
		Harddrive harddrive1=new Seagate("Seagate",1000,300);
		Harddrive harddrive2=new WestDigitals("WestDigitals",1500,350);
		Motherboard motherboard1 = new  Asus("Asus",200,300);
		Motherboard motherboard2 = new  Gigabyte("Gigabyte",500,500);
		Computer c1=new Computer("com1",motherboard1,cpu2,memory1,harddrive2) ;
		Computer c2=new Computer("com2",motherboard2,cpu1,memory2,harddrive1);
		Computer c3=new Computer("com3",motherboard1,cpu1,memory2,harddrive2);
		ComputerStore cs=new ComputerStore(c1,c2,c3);
		cs.get_products_info();
	}
}
