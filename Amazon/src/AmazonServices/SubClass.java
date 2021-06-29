package AmazonServices;

public class SubClass extends ParentClass {
	
	public SubClass() {
		
		System.out.println("I m in child class constructor");
	}
	
   public SubClass(String name ) {
		super(name);
		System.out.println("I m in child class constructor"+name);
	}

	public static void main(String[] args) {
		
     SubClass c= new SubClass("Mukesh");
	}

}
