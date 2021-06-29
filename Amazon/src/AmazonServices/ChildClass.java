package AmazonServices;

public class ChildClass extends BaseClass {
	
	int int_rate=10;
	
	public static void main(String[] args) {
	
		ChildClass c = new ChildClass();
		//System.out.println(c.int_rate);
		c.showmeintratefrompvtbank();
		

	}
	
	public void showmeintrate() {
		System.out.println("I m in child");
	}

	public void showmeintratefrompvtbank() {
		
		super.showmeintrate();
		System.out.println("Current rate from pvt bank  "+super.int_rate);
	}
}
