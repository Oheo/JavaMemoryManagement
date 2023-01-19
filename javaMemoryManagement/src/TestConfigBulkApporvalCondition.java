import java.util.Arrays;

public class TestConfigBulkApporvalCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Value is " +isConfigValueEnabled(2004,70));
		

	}
	
	public static boolean isConfigValueEnabled(int configId, int moduleConstant) {
		boolean isEnabled = false;
		String strings= "870,570,70,560,430,412,411,40,370,272,270,2100,180,1630,20";
		String[] arrayStrings = strings.split(",");
		isEnabled = Arrays.asList(arrayStrings).contains(String.valueOf(moduleConstant));
		return isEnabled;
	}

}
