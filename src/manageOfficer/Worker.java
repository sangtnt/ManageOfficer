package manageOfficer;

public class Worker extends Officer {
	private byte level;
	public Worker(String fullname,byte age, byte sex, String address,byte level){
		super(fullname, age, sex, address);
		this.level=level;
	}
	public byte getLevel() {
		return level;
	}
	public void setLevel(byte level) {
		this.level = level;
	}
}
