package manageOfficer;

public class Engineer extends Officer{
	private String field;
	public Engineer(String fullname,byte age, byte sex, String address,String field){
		super(fullname, age, sex, address);
		this.field=field;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
}
