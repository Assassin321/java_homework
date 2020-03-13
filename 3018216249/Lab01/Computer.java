package lab01;

import java.util.ArrayList;
import java.util.HashMap;

public class Computer {

	private String name;
	private Motherboard motherboard;
	private CPU cpu;
	private Memory memory;
	private Harddrive harddrive;
	public Computer(String name,Motherboard mb,CPU c,Memory m,Harddrive hd){
		this.name=name;
		this.cpu=c;
		this.harddrive=hd;
		this.memory=m;
		this.motherboard=mb;
	}
	public String getprice() {
		return String.valueOf(cpu.price+memory.price+harddrive.price+motherboard.price);
	}
	public String getname() {
		return name;
	}
	public HashMap<String,String> getinfo(){
		HashMap<String,String> data = new HashMap<>();
		data.put("CPU", cpu.Name);
		data.put("Memory", memory.Name);
		data.put("HardDrive", harddrive.Name);
		data.put("MotherBoard", motherboard.Name);
		return data;
	}
		
	

}
