package java_homework;

public class single {
	private static single m = new single();
	private single() {
	}
	public static single getInstance() {
		return m;	
	}
	public void showresult()
	{
		System.out.print("Hello World!");
	}
	public static void main(String arg0[]) {
		single n = single.getInstance();
		n.showresult ();
	}
}
