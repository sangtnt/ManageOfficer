package manageOfficer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManageOfficer {
	private static List<Officer> listOfficer= new ArrayList<Officer>();
	public static void addOfficer(Officer officer) {
		ManageOfficer.listOfficer.add(officer);
	}
	public static List<Officer> searchOfficer(String fullname){
		return ManageOfficer.listOfficer.stream()
				.filter(o -> o.getFullname().contains(fullname))
				.collect(Collectors.toList());
	}
	public static String convertToString() {
		String res="";
		for (Officer o: ManageOfficer.listOfficer) {
			res=res+o.getFullname()+" ";
		}
		return res;
	}
}
