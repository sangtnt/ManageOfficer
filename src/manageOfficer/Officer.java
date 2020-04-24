package manageOfficer;

public class Officer {
	protected String fullname;
	protected byte age;
	protected byte sex;
	protected String address;
	public Officer(String fullname, byte age, byte sex, String address){
		this.fullname=fullname;
		this.age=age;
		this.sex=sex;
		this.address=address;
	}
	public String getFullname() {
		return fullname;
	}
	public byte getAge() {
		return age;
	}
	public byte getSex() {
		return sex;
	}
	public String getAddress() {
		return address;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	public void setSex(byte sex) {
		this.sex = sex;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
