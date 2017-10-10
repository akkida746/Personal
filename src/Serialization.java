
public class Test {

	public static void main(String[] args) {

		A a = new A();
		a.name = "Akash";
		
		String str = a.getName();
		
		a.name = "Deep";
		
		System.out.println(str);
		System.out.println(a.name);
		
		Thread.currentThread().getStackTrace();
		
	}
	
	static class A {
		String name;
		
		public String getName(){
			return name;
		}
	}

}
