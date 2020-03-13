package lab01;

import java.util.HashMap;

public class ComputerStore {
	private Computer c1;
	private Computer c2;
	private Computer c3;
	public ComputerStore(Computer c1,Computer c2,Computer c3) {
		this.c1=c1;
		this.c2=c2;
		this.c3=c3;
	}
	public void print_info(Computer c) {
		System.out.print("Name："+c.getname()+"\n");
		System.out.print("price："+c.getprice()+"\n");
		HashMap<String,String> data = c.getinfo();
		System.out.print(data+"\n");
	}
	public void get_products_info() {
		System.out.print("===============first product============\n");
		print_info(c1);
		System.out.print("===============second product===========\n");
		print_info(c2);
		System.out.print("===============third product=============\n");
		print_info(c3);
	}
}
