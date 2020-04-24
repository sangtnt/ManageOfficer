package Main;

import manageOfficer.ManageOfficer;
import manageOfficer.Officer;
import manageOfficer.Staff;

public class Main {
	public static void main(String[] args) {
		Officer officer = new Staff("tran nguyen tan sang",(byte) 19,(byte) 0, "sky", "student");
		ManageOfficer.addOfficer(officer);
		System.out.print(officer.getFullname());
	}
}
