
public class InterfaceTest {

	public static void main(String[] args) {
		Demo2 d = new Demo2();
		d.show();
		
	}

}

interface I1{
    int t=10;
	public void show();
}

interface I2{
	public void show();

}

class Demo2 implements I1,I2{

	@Override
	public void show() {
    System.out.println(t);		
	}
	
}