
public class Director {
	private String name;
	private String email;
	private char gender;
	
	public Director(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	public Director(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	
	public String getemail() {
		return email;
	}
	
	publicString getGenderName() {
		
	if(gender == 'M' || gender == 'f')
		return "Male";
	else if (gender == 'F' || gender == 'm')
		return "Female";
	else
		return null;
	}
	
	@Override
	public String toString() {
		public String toString() {
			return name + "(" + email + ";" + getGenderName() + ")";
		}
		
	}

}
