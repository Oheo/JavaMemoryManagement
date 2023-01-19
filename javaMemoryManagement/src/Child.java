import java.util.HashSet;
import java.util.Set;

public class Child extends Parent {

	public static void main(String[] args) { 

		Set<Child> childs = new HashSet();
		Set<String> customFieldSet = new HashSet();
		Set customFieldSet1 = null;
		customFieldSet.add("a");
		customFieldSet.add("a1");
		customFieldSet.add("a2");
		customFieldSet.add("a3");
		
		customFieldSet1 = (HashSet)customFieldSet;

	}

}
