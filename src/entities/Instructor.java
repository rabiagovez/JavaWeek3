package entities;

public class Instructor extends BaseEntity{

	private String educatorName;
	private String educatorLastName;
	private String educatorInfo;

	public Instructor(int id, String educatorName, String educatorLastName, String educatorInfo) {
		super(id);
		this.educatorName = educatorName;
		this.educatorLastName = educatorLastName;
		this.educatorInfo = educatorInfo;
	}

	public String getEducatorName() {
		return educatorName;
	}

	public void setEducatorName(String educatorName) {
		this.educatorName = educatorName;
	}

	public String getEducatorLastName() {
		return educatorLastName;
	}

	public void setEducatorLastName(String educatorLastName) {
		this.educatorLastName = educatorLastName;
	}

	public String getEducatorInfo() {
		return educatorInfo;
	}

	public void setEducatorInfo(String educatorInfo) {
		this.educatorInfo = educatorInfo;
	}

}
