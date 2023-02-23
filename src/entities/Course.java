package entities;

public class Course extends BaseEntity{

	private String courseName;
	private String category;
	private int price;

	public Course(int id) {
		super(id);
	}

	public Course(int id, String courseName, String category, int price) {
		super(id);
		this.courseName = courseName;
		this.category = category;
		this.price = price;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
