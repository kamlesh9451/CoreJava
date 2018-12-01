package org.kp.core;

public class ConstructorDemo {

	public static void main(String[] args) {


	}

}

class X{
	int x,y;
	public X() {
		x=10;
		y=10;
	}
	public X(int x,int y) {
		this.x=x;
		this.y=y;
		double nt =2.5;
	}	
	
		
	}
	


class Y extends X{
	int z;
	Y(){
		
	}
	Y(int x,int y,int z){
		super(x,y);
		this.z=z;	
	}
}