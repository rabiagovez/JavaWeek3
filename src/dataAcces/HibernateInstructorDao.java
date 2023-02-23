package dataAcces;

import entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {

		System.out.println("Instructor added with Hibernate");
	}

}
