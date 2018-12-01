
public class Demo {
	
	public static void main(String args[]) {
		x t = new y();
		t.show(null);
}

	public void show() {
		// TODO Auto-generated method stub
		
	}
}

class x
{
 public void show(Integer x) {
	 //x.hashCode();
	 System.out.println("hi111");
 }

}

class y extends x{
	public void show(String x) {
		 
		 System.out.println("hi22");
	 }
}

