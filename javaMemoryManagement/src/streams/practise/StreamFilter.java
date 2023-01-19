package streams.practise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> arrayList = new ArrayList();
		arrayList.add(8);
		arrayList.add(5);
		arrayList.add(18);
		arrayList.add(38);
		arrayList.add(48);
		arrayList.add(68);

		System.out.println(arrayList.stream().filter(x -> x > 5).collect(Collectors.toList()));
		if(getRateCodeList().size()>=1) {
			getRateCodeList().get(0);			
		}
		getRateCodeList().get(0);

		// filter array using using stream which are greater than 5
		/*
		 * List<Integer> filteredlist = new ArrayList<Integer>(); for (Integer integer :
		 * arrayList) { if (integer > 5) { filteredlist.add(integer); } }
		 * System.out.println(filteredlist);
		 */

	}
	
	public static List<Integer> getRateCodeList() {
        List<Integer> rateCodeList = new ArrayList();
        return rateCodeList;
    }

}
