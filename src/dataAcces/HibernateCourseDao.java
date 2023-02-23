package dataAcces;

import entities.Course;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {

		System.out.println("Course added with Hibernate");
	}

	
}
