
public class BooleanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean value = false;
		System.out.println("Value of Boolean "+value);
		methodcall(value);
		System.out.println("After method call Value of Boolean "+value);
		

	}

	private static void methodcall(boolean value) {
		System.out.println("Value local scope " +value);
		value=true;
		System.out.println("Value local scope "+value);
	}

}
