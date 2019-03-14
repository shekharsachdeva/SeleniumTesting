package testing;

public class Class1 {

	 int b;
	
	public void add(int a) {
		
      b=a;}
	
	public void display() {
		
		System.out.println(""+b);
		
		
	}
	
	public static void main(String[] args) {
		
		Class1 obj = new Class1();
		Class1 obx = new Class1();
		
		
		obj.add(12);
		obx.add(15);
		obj.display();
		obx.display();
	
		
	
		
		
	}
	
}
