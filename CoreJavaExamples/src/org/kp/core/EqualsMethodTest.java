package org.kp.core;

public class EqualsMethodTest {

	public static void main(String[] args) {

		String s1 = new String("kamlesh");
		Object o1 = s1;
		Object o2 = new String("kamlesh");
		Object o3 = new String("kamlesh");
		System.out.println(s1.equals(o1));
		System.out.println(o1.equals(s1));
		System.out.println(o1.equals(o2));
		System.out.println(o1==o2);
		System.out.println(o2.equals(o3));
	}

}
