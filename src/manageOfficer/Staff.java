package manageOfficer;

public class Staff extends Officer{
	private String job;
	public Staff(String fullname,byte age, byte sex, String address,String job){
		super(fullname, age, sex, address);
		this.job=job;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
}
